package semana4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArmazenamentoImpl implements Armazenamento {

	private static final String ARQUIVO = "banco.txt";
	
	private final Map<String, Map<String, Pontuacao>> cacheUsuariosPontos = new HashMap<String, Map<String,Pontuacao>>();
	
	/*
	 * Essa classe interna Pontuacao foi criada para evitar que cada vez que o valor
	 * de um ponto mudasse fosse criada uma nova inst�ncia de Integer pois a classe
	 * Integer � imut�vel. Para resolver isso a classe Pontuacao mantem uma vari�vel
	 * primitiva do tipo int que pode ser mudada � vontade. Isso evita um esfor�o
	 * computacional alto desnecess�rio de aloca��o de mem�ria pois a inst�ncia da
	 * classe Pontuacao n�o precisa mudar. Em um cen�rio de alta demanda isso
	 * evitaria muito garbage collection.
	 * 
	 * Obs: h� uma m� pr�tica intencional nesta classe. O acesso ao valor da
	 * variavel pontos � feito diretamente sem o uso de m�todos, mas isso � feito
	 * pelo motivo dessa classe ser interna e cujo �nico prop�sito � armazenar um
	 * valor inteiro. Isso evita indire��es e denecess�rias e mant�m o c�digo da
	 * classe o menor poss�vel. Se por algum motivo a altera��o da variavel int
	 * passasse a necessitar de uma l�gica complexa a� sim seriam criados m�todos
	 * getPontos e setPontos, mas a refatora��o seria pequena pois, como pode ser
	 * visto, a classe Pontuacao s� tem uso interno. Se a classe Pontuacao fosse
	 * publica, a variavel pontos nunca teria acesso direto.
	 */
	private class Pontuacao {
		private int pontos;
		public Pontuacao(int pontos) {
			this.pontos = pontos;
		}
		@Override
		public String toString() {
			return Integer.toString(pontos);
		}
	}
	
	public ArmazenamentoImpl() throws FileNotFoundException, IOException {
		carregaArquivo();
	}
	
	private void carregaArquivo() throws FileNotFoundException, IOException {
		
		File arquivo = new File(ARQUIVO);
		
		if (!arquivo.exists()) {
			arquivo.createNewFile();
			return;
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String linha = null;
			String[] partesLinha = null;
			
			String usuario = null;
			String tipoPonto = null;
			int pontos = 0;
			
			while ((linha = br.readLine()) != null) {
				
				partesLinha = linha.split(",");
				
				usuario  = partesLinha[0];
				tipoPonto = partesLinha[1];
				pontos = Integer.parseInt(partesLinha[2]);

				atualizaCache(usuario, tipoPonto, pontos);
				
			}
		}
	}	
	
	
	@Override
	public void registraPontosRecebidos(String usuario, String tipoPonto, int pontos) throws Exception {
		
		if (pontos == 0)
			return;
		
		gravaRegistroEmArquivo(usuario, tipoPonto, pontos);
		
		atualizaCache(usuario, tipoPonto, pontos);
		
	}

	private void atualizaCache(String usuario, String tipoPonto, int pontos) {
		Map<String, Pontuacao> mapaPontosUsuario = cacheUsuariosPontos.get(usuario);
		Pontuacao pontuacao = null;
		if (mapaPontosUsuario == null) {
			atualizaCacheUsuarioInexistente(usuario, tipoPonto, pontos);
		} else if ((pontuacao = mapaPontosUsuario.get(tipoPonto)) == null) {
			atualizaCacheUsuarioSemTipoPonto(tipoPonto, pontos, mapaPontosUsuario);
		} else {
			atualizaCacheUsuarioComPontuacaoPrevia(usuario, tipoPonto, pontos, pontuacao, mapaPontosUsuario);
		}
	}

	private void atualizaCacheUsuarioInexistente(String usuario, String tipoPonto, int pontos) {
		if (pontos < 0)
			return;
		Map<String, Pontuacao> mapaPontosUsuario = new HashMap<String, Pontuacao>();
		mapaPontosUsuario.put(tipoPonto, new Pontuacao(pontos));
		cacheUsuariosPontos.put(usuario, mapaPontosUsuario);
	}
	
	private void atualizaCacheUsuarioSemTipoPonto(String tipoPonto, int pontos, Map<String, Pontuacao> mapaPontosUsuario) {
		if (pontos < 0)
			return;
		mapaPontosUsuario.put(tipoPonto, new Pontuacao(pontos));
	}
	
	private void atualizaCacheUsuarioComPontuacaoPrevia(String usuario, String tipoPonto, int pontos, Pontuacao pontuacao, Map<String, Pontuacao> mapaPontosUsuario) {
		pontuacao.pontos += pontos;
		if (pontuacao.pontos <= 0) {
			mapaPontosUsuario.remove(tipoPonto);
			if (mapaPontosUsuario.isEmpty())
				cacheUsuariosPontos.remove(usuario);
		}
	}
	
	private void gravaRegistroEmArquivo(String usuario, String tipoPonto, int pontos) throws FileNotFoundException, IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
			bw.write(usuario);
			bw.write(',');
			bw.write(tipoPonto);
			bw.write(',');
			bw.write(Integer.toString(pontos));
			bw.newLine();
			bw.flush();
		}
	}

	@Override
	public int getPontos(String usuario, String tipoPonto) {
		Map<String, Pontuacao> mapaTipoPontosPontuacao = null;
		if ((mapaTipoPontosPontuacao = cacheUsuariosPontos.get(usuario)) == null)
			return 0;
		
		Pontuacao pontuacao = null;
		
		if ((pontuacao = mapaTipoPontosPontuacao.get(tipoPonto)) == null)
			return 0;
		
		return pontuacao.pontos;
	}

	@Override
	public Set<String> getUsuariosPontuados() {
		return cacheUsuariosPontos.keySet();
	}
	
	@Override
	public Set<String> getTiposPontosAtribuidos() {
		Set<String> tiposPontosAtribuidos = new HashSet<String>();
		
		for (Map<String, Pontuacao> mapaTipoPontosPontuacao : cacheUsuariosPontos.values())
			tiposPontosAtribuidos.addAll(mapaTipoPontosPontuacao.keySet());
		
		return tiposPontosAtribuidos;
		
	}

	
}
