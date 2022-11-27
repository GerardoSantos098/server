package gera.actividad;

import java.util.List;

public class Documento {
	
	private long id;
    private String palabra;
    private List<String> rutas;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public List<String> getRutas() {
		return rutas;
	}
	public void setRutas(List<String> rutas) {
		this.rutas = rutas;
	}
    
    
}
