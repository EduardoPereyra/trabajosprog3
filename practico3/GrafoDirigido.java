package practico3;

import java.util.ArrayList;
import java.util.Iterator;

public class GrafoDirigido {
	private ArrayList<VerticeDirigido> verticeDirigidos;
	
	public GrafoDirigido() {
		verticeDirigidos = new ArrayList<>();
	}
	
	public void add(VerticeDirigido v) {
		this.verticeDirigidos.add(v);
	}
	
	public Iterator<VerticeDirigido> getVertices() {
		return this.verticeDirigidos.iterator();
	}
	
	public String toString() {
		return "\n Grafo [ vertice: " + verticeDirigidos.toString() + "]";
	}
	
	public void dfs() {
		for (VerticeDirigido v : verticeDirigidos) {
			v.setEstado("No visitado");			
		}
		
		for (VerticeDirigido v : verticeDirigidos) {
			if(v.getEstado().equals("No visitado") ) {
				dfs_visit(v);
			}		
		}
	}
	
	private void dfs_visit(VerticeDirigido v) {
		v.setEstado("Visitado");
		
		System.out.println(v.getInfo());
		
		for (ArcoDirigido a : v.getArcos()) {
			if(a.getDestino().getEstado().equals("No visitado")) {
				dfs_visit(a.getDestino());
			}
		}
		v.setEstado("Explorado");
	}
	
	
	//el detectar un ciclo hay que fijar si esta en visitado
	
	
	
	
	
	
	
}
