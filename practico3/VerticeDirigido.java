package practico3;

import java.util.ArrayList;
import java.util.List;

public class VerticeDirigido { //son los objetos
	private List<ArcoDirigido> arcoDirigidos;
	private Object info;
	private String estado;
	
	public VerticeDirigido(Object info) {
		this.info = info;
		this.arcoDirigidos = new ArrayList<>();
	}
	
	public Object getInfo() {
		return info;
	}
	
	public void addArco(ArcoDirigido arcoDirigido) {
		this.arcoDirigidos.add(arcoDirigido);
	}
	
	public List<ArcoDirigido> getArcos(){
		return this.arcoDirigidos;
	}
	
	public void setInfo(Object info) {
		this.info = info;
	}
	
	public String toString() {
		return "\n Vertice [info: " + info + ", arista: " + arcoDirigidos + "]";
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	} 
	
	public String getEstado() {
		return this.estado;
	}
	
}
