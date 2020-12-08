package semana4;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.*;

public class ArmazenamentoImplTest {

	private static final String ARQUIVO = "banco.txt";
	
	@Before
	public void setup() {
		apagaArquivo();
	}
	
	@Test
	public void testaGravacao() throws Exception {
		
		Armazenamento armazenamento = new ArmazenamentoImpl();
		
		armazenamento.registraPontosRecebidos("Jose", "SAUDE", 3);
		
		assertEquals(Arrays.asList("Jose,SAUDE,3"), conteudoArquivo());
		
		armazenamento.registraPontosRecebidos("Paulo", "MOEDA", 10);
		armazenamento.registraPontosRecebidos("Joao", "MAGIA", 5);
		armazenamento.registraPontosRecebidos("Paulo", "MOEDA", -2);
		
		assertEquals(Arrays.asList("Jose,SAUDE,3", "Paulo,MOEDA,10", "Joao,MAGIA,5", "Paulo,MOEDA,-2"), conteudoArquivo());
		
	}
	
	@Test
	public void testaCarregamentoDeArquivoExistente() throws Exception {
		
		criaMassaDeTeste();
		
		Armazenamento armazenamento = new ArmazenamentoImpl();
		
		assertEquals(10, armazenamento.getPontos("Jose", "MOEDA"));
		assertEquals(10, armazenamento.getPontos("Joao", "SAUDE"));
		assertEquals(8, armazenamento.getPontos("Paulo", "PRESTIGIO"));
		assertEquals(12, armazenamento.getPontos("Jose", "SAUDE"));
		assertEquals(10, armazenamento.getPontos("Joao", "MOEDA"));
		assertEquals(0, armazenamento.getPontos("Jose", "PRESTIGIO")); // usuario nunca teve pontos do tipo PRESTIGIO 
		assertEquals(0, armazenamento.getPontos("Eduardo", "MOEDA")); // usuario nunca exisitiu
		
	}
	
	
	@Test
	public void testaModificacaoDePontos() throws Exception {
		
		criaMassaDeTeste();
		
		Armazenamento armazenamento = new ArmazenamentoImpl();
		
		armazenamento.registraPontosRecebidos("Paulo", "SAUDE", 6);
		
		assertEquals(6, armazenamento.getPontos("Paulo", "SAUDE"));
		
		assertEquals(
				Arrays.asList(
						"Jose,MOEDA,5",
						"Jose,MOEDA,5",
						"Joao,SAUDE,3",
						"Paulo,PRESTIGIO,8",
						"Jose,SAUDE,12",
						"Joao,MOEDA,10",
						"Joao,SAUDE,7",
						"Paulo,SAUDE,6"),
				conteudoArquivo());
		
		armazenamento.registraPontosRecebidos("Paulo", "PRESTIGIO", -6);
		
		assertEquals(2, armazenamento.getPontos("Paulo", "PRESTIGIO"));
		
		armazenamento.registraPontosRecebidos("Paulo", "PRESTIGIO", -8);
		
		assertEquals(0, armazenamento.getPontos("Paulo", "PRESTIGIO"));
		
		armazenamento.registraPontosRecebidos("Paulo", "PRESTIGIO", 2);
		
		assertEquals(2, armazenamento.getPontos("Paulo", "PRESTIGIO"));
	}	
	
	@Test
	public void testaUsuariosPontuados() throws Exception {
		
		criaMassaDeTeste();
		
		Armazenamento armazenamento = new ArmazenamentoImpl();
		
		assertEquals(new HashSet<String>(Arrays.asList("Jose", "Joao", "Paulo")), armazenamento.getUsuariosPontuados());
		
		armazenamento.registraPontosRecebidos("Paulo", "PRESTIGIO", -8);
		
		assertEquals(new HashSet<String>(Arrays.asList("Jose", "Joao")), armazenamento.getUsuariosPontuados());
		
	}
	
	@Test
	public void testaTodosOsTiposDePontosAtribuidos() throws Exception {
		
		criaMassaDeTeste();
		
		Armazenamento armazenamento = new ArmazenamentoImpl();
		
		assertEquals(new HashSet<String>(Arrays.asList("MOEDA", "SAUDE", "PRESTIGIO")), armazenamento.getTiposPontosAtribuidos());
		
		armazenamento.registraPontosRecebidos("Paulo", "PRESTIGIO", -8);
		
		assertEquals(new HashSet<String>(Arrays.asList("MOEDA", "SAUDE")), armazenamento.getTiposPontosAtribuidos());
		
		armazenamento.registraPontosRecebidos("Jose", "MOEDA", -18);
		
		assertEquals(new HashSet<String>(Arrays.asList("MOEDA", "SAUDE")), armazenamento.getTiposPontosAtribuidos());
		
	}
	
	private void criaMassaDeTeste() throws Exception {
		escreveRegistros(
				"Jose,MOEDA,5",
				"Jose,MOEDA,5",
				"Joao,SAUDE,3",
				"Paulo,PRESTIGIO,8",
				"Jose,SAUDE,12",
				"Joao,MOEDA,10",
				"Joao,SAUDE,7");
	}
	
	private void escreveRegistros(String... linhas) throws Exception {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
			bw.flush();
		}
	}
	
	private List<String> conteudoArquivo() throws IOException {
		List<String> linhasArquivo = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
			String linha = null;
			while ((linha = br.readLine()) != null) {
				linhasArquivo.add(linha);
			}
		}
		return linhasArquivo;
	}

	private void apagaArquivo() {
		new File(ARQUIVO).delete();
	}
}
