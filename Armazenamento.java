package semana4;

import java.util.Set;

public interface Armazenamento {
	
	void registraPontosRecebidos(String usuario, String tipoPonto, int pontos) throws Exception;
	
	int getPontos(String usuario, String tipoPonto);
	
	Set<String> getUsuariosPontuados();
	
	Set<String> getTiposPontosAtribuidos();
}
