package semana4;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class IntegracaoTest {

	private static final String ARQUIVO = "banco.txt";
	
	@Before
	public void setup() {
		apagaArquivo();
	}

	@Test
	public void gravacaoUmUsuarioUmTipoDePonto() throws Exception {
		
		Placar placar = new Placar();
		placar.setArmazenamento(new ArmazenamentoImpl());
		
		placar.grava("Jose", "MOEDA", 1);
		Map<String, Integer> pontosUsuario = placar.getPontosUsuario("Jose");
		assertEquals(1, pontosUsuario.size());
		assertEquals(1, pontosUsuario.get("MOEDA").intValue());
		assertEquals(Arrays.asList("Jose,MOEDA,1"), conteudoArquivo());
	}

	
	@Test
	public void gravacaoRecuperacao() throws Exception {
		
		Placar placar = new Placar();
		placar.setArmazenamento(new ArmazenamentoImpl());
		
		placar.grava("Jose", "MOEDA", 1);
		placar.grava("Joao", "ENERGIA", 2);
		placar.grava("Paulo", "ENERGIA", 2);
		placar.grava("Jose", "MOEDA", 3);
		placar.grava("Paulo", "MOEDA", 4);
		placar.grava("Joao", "ENERGIA", 3);
		placar.grava("Joao", "ENERGIA", 2);
		placar.grava("Paulo", "ENERGIA", 6);
		placar.grava("Joao", "MOEDA", 3);
		placar.grava("Jose", "ENERGIA", 2);
		
		placar = new Placar();
		placar.setArmazenamento(new ArmazenamentoImpl());
		
		Map<String, Integer> pontosUsuario = placar.getPontosUsuario("Jose");
		assertEquals(2, pontosUsuario.size());
		assertEquals(4, pontosUsuario.get("MOEDA").intValue());
		assertEquals(2, pontosUsuario.get("ENERGIA").intValue());
		
		pontosUsuario = placar.getPontosUsuario("Joao");
		assertEquals(2, pontosUsuario.size());
		assertEquals(3, pontosUsuario.get("MOEDA").intValue());
		assertEquals(7, pontosUsuario.get("ENERGIA").intValue());
		
		pontosUsuario = placar.getPontosUsuario("Paulo");
		assertEquals(2, pontosUsuario.size());
		assertEquals(4, pontosUsuario.get("MOEDA").intValue());
		assertEquals(8, pontosUsuario.get("ENERGIA").intValue());
	}
	
	@Test
	public void adicaoRemocaoPontos() throws Exception {

		Placar placar = new Placar();
		placar.setArmazenamento(new ArmazenamentoImpl());
		
		placar.grava("Jose", "MOEDA", 4);
		placar.grava("Jose", "MOEDA", 3);
		placar.grava("Jose", "ENERGIA", 2);
		placar.grava("Jose", "ENERGIA", 2);
		
		placar.grava("Joao", "ENERGIA", 2);
		placar.grava("Joao", "ENERGIA", 3);
		placar.grava("Joao", "MOEDA", 3);
		placar.grava("Joao", "ENERGIA", 2);
		
		placar.grava("Paulo", "ENERGIA", 2);
		placar.grava("Paulo", "MOEDA", 4);
		placar.grava("Paulo", "ENERGIA", 6);
		
		placar.grava("Jose", "MOEDA", -10); // zerando as moedas com saldo negativo. Tem que resultar em zero.
		placar.grava("Jose", "ENERGIA", -4); // zerando energia com zero exato
		placar.grava("Joao", "ENERGIA", -7); // zerando energia com saldo negativo. Tem que resultar em zero.
		placar.grava("Paulo", "ENERGIA", -4);
		
		Map<String, Integer> pontosUsuario = placar.getPontosUsuario("Jose");
		assertTrue(pontosUsuario.isEmpty());
		
		pontosUsuario = placar.getPontosUsuario("Joao");
		assertEquals(1, pontosUsuario.size());
		assertEquals(3, pontosUsuario.get("MOEDA").intValue());
		
		pontosUsuario = placar.getPontosUsuario("Paulo");
		assertEquals(2, pontosUsuario.size());
		assertEquals(4, pontosUsuario.get("MOEDA").intValue());
		assertEquals(4, pontosUsuario.get("ENERGIA").intValue());
		
	}

	@Test
	public void ranking() throws Exception {
		Placar placar = new Placar();
		placar.setArmazenamento(new ArmazenamentoImpl());
		
		placar.grava("Jose", "MOEDA", 4);
		placar.grava("Jose", "MOEDA", 3);
		placar.grava("Jose", "ENERGIA", 2);
		placar.grava("Jose", "ENERGIA", 2);
		
		placar.grava("Joao", "ENERGIA", 2);
		placar.grava("Joao", "ENERGIA", 3);
		placar.grava("Joao", "MOEDA", 3);
		placar.grava("Joao", "ENERGIA", 2);
		
		placar.grava("Paulo", "ENERGIA", 2);
		placar.grava("Paulo", "MOEDA", 4);
		placar.grava("Paulo", "ENERGIA", 6);
		
		assertEquals(Arrays.asList("Jose 7", "Paulo 4", "Joao 3"), placar.getRanking("MOEDA"));
		
		placar.grava("Jose", "MOEDA", -8);
		placar.grava("Jose", "MOEDA", 10);
		placar.grava("Joao", "MOEDA", 14);
		
		assertEquals(Arrays.asList("Joao 17", "Jose 10", "Paulo 4"), placar.getRanking("MOEDA"));
		
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
