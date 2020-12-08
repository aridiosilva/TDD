package semana4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PlacarTest {

	@Test
	public void umUsuarioUmTipoDePonto() {
		Map<String, Integer> mapaPontos = new HashMap<String, Integer>();
		mapaPontos.put("MOEDA", 6);
		
		ArmazenamentoMock armazenamentoMock = new ArmazenamentoMock();
		armazenamentoMock.setMapaPontos(mapaPontos);
		armazenamentoMock.setTiposPontosAtribuidos("MOEDA");
		armazenamentoMock.setUsuariosPontuados("Jose");
		
		Placar placar = new Placar();
		placar.setArmazenamento(armazenamentoMock);
		
		Map<String, Integer> pontosUsuario = placar.getPontosUsuario("Jose");
		
		assertEquals(1, pontosUsuario.size());
		assertEquals(6, pontosUsuario.get("MOEDA").intValue());
		assertEquals(Arrays.asList("Jose 6"), placar.getRanking("MOEDA"));
		armazenamentoMock.setUsuariosPontuados();
		assertEquals(Collections.EMPTY_LIST, placar.getRanking("MAGIA"));
	}

	
	@Test
	public void umUsuarioMultiplosTiposDePontos() {
		Map<String, Integer> mapaPontos = new HashMap<String, Integer>();
		mapaPontos.put("MOEDA", 6);
		mapaPontos.put("MAGIA", 8);
		mapaPontos.put("PRESTIGIO", 4);
		
		ArmazenamentoMock armazenamentoMock = new ArmazenamentoMock();
		armazenamentoMock.setMapaPontos(mapaPontos);
		armazenamentoMock.setTiposPontosAtribuidos("MOEDA", "MAGIA", "PRESTIGIO");
		armazenamentoMock.setUsuariosPontuados("Jose");
		
		Placar placar = new Placar();
		placar.setArmazenamento(armazenamentoMock);
		
		assertEquals(mapaPontos, placar.getPontosUsuario("Jose"));
		assertEquals(Arrays.asList("Jose 8"), placar.getRanking("MAGIA"));
	}
	
	
	@Test
	public void multiplosUsuarioMultiplosTiposDePontos() {
		Map<String, Integer> mapaPontosMock = new HashMap<String, Integer>();
		mapaPontosMock.put("MOEDA", 6);
		mapaPontosMock.put("MAGIA", 8);
		mapaPontosMock.put("PRESTIGIO", 0);
		
		ArmazenamentoMock armazenamentoMock = new ArmazenamentoMock();
		armazenamentoMock.setMapaPontos(mapaPontosMock);
		armazenamentoMock.setTiposPontosAtribuidos("MOEDA", "MAGIA", "PRESTIGIO");
		armazenamentoMock.setUsuariosPontuados("Jose", "Joao", "Paulo");
		
		Placar placar = new Placar();
		placar.setArmazenamento(armazenamentoMock);

		Map<String, Integer> mapaPontosResposta = new HashMap<String, Integer>();
		mapaPontosResposta.put("MOEDA", 6);
		mapaPontosResposta.put("MAGIA", 8);
		
		assertEquals(mapaPontosResposta, placar.getPontosUsuario("Jose"));
	}
	
	@Test
	public void rankingMmultiplosUsuarios() {
		Map<String, Integer> mapaPontos = new HashMap<String, Integer>();
		mapaPontos.put("Jose", 6);
		mapaPontos.put("Joao", 8);
		mapaPontos.put("Eduardo", 4);
		mapaPontos.put("Alexandre", 20);
		mapaPontos.put("Paulo", 0);
		mapaPontos.put("Rafael", 0);
		
		ArmazenamentoMockRanking armazenamentoMockRanking = new ArmazenamentoMockRanking();
		armazenamentoMockRanking.setMapaPontos(mapaPontos);
		armazenamentoMockRanking.setUsuariosPontuados("Jose","Alexandre", "Eduardo", "Joao", "Paulo", "Rafael");
		armazenamentoMockRanking.setTiposPontosAtribuidos("SAUDE", "PRESTIGIO", "MOEDA");
		
		Placar placar = new Placar();
		placar.setArmazenamento(armazenamentoMockRanking);
		
		assertEquals(Arrays.asList("Alexandre 20", "Joao 8","Jose 6", "Eduardo 4"), placar.getRanking("MOEDA"));
	}
	

}
