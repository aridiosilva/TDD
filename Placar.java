package semana4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Placar {
	
	private Armazenamento armazenamento;
	
	public void setArmazenamento(Armazenamento armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	public void grava(String usuario, String tipoPonto, int pontos) throws Exception {
		armazenamento.registraPontosRecebidos(usuario, tipoPonto, pontos);
	}
	
	public Map<String, Integer> getPontosUsuario(String usuario) {
		
		if (!armazenamento.getUsuariosPontuados().contains(usuario))
			return Collections.emptyMap();
		
		Map<String, Integer> mapaResultados = new HashMap<String, Integer>();
		
		int pontos = 0;
		
		for (String tipoPonto : armazenamento.getTiposPontosAtribuidos()) {
			if ((pontos = armazenamento.getPontos(usuario, tipoPonto)) > 0)
				mapaResultados.put(tipoPonto, pontos);
		}
		
		return mapaResultados;
	}

	public List<String> getRanking(String tipoPonto) {
		
		SortedMap<Integer, String> pontosOrdenados = new TreeMap<Integer, String>(Comparator.reverseOrder());
		
		int pontos = 0;
		
		for (String usuario : armazenamento.getUsuariosPontuados()) {
			if ((pontos = armazenamento.getPontos(usuario, tipoPonto)) > 0)
				pontosOrdenados.put(pontos, usuario);
		}
		
		List<String> listaPontos = new LinkedList<String>();
		
		StringBuffer linhaRanking = new StringBuffer(20);
		
		for (Map.Entry<Integer, String> chaveValor : pontosOrdenados.entrySet()) {
			linhaRanking.append(chaveValor.getValue()).append(' ').append(chaveValor.getKey());
			listaPontos.add(linhaRanking.toString());
			linhaRanking.setLength(0);
		}
		
		return listaPontos;
	}
}
