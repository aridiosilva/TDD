package semana4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArmazenamentoMock implements Armazenamento {

	private Map<String, Integer> mapaPontos = null; 
	
	private Set<String> listaTiposPontos = null;
	
	private Set<String> usuariosPontuados;
	
	@Override
	public void registraPontosRecebidos(String usuario, String tipoPonto, int pontos) {
	}

	public void setMapaPontos(Map<String, Integer> mapaPontos) {
		this.mapaPontos = mapaPontos;
	}
	
	@Override
	public int getPontos(String usuario, String tipoPonto) {
		return mapaPontos.get(tipoPonto);
	}

	public void setTiposPontosAtribuidos(String... tiposPontos) {
		listaTiposPontos = new HashSet<String>(Arrays.asList(tiposPontos));
	}
	
	@Override
	public Set<String> getTiposPontosAtribuidos() {
		return listaTiposPontos;
	}
	
	public void setUsuariosPontuados(String... usuariosPontuados) {
		this.usuariosPontuados = new HashSet<String>(Arrays.asList(usuariosPontuados));
	}
	
	@Override
	public Set<String> getUsuariosPontuados() {
		return usuariosPontuados;
	}
	
}
