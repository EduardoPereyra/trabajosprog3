package practico3;

public class ArcoDirigido {
	private Object etiqueta;
	private VerticeDirigido destino;
	
	public ArcoDirigido(Object etiqueta, VerticeDirigido destino) {
		this.etiqueta = etiqueta;
		this.destino = destino;
	}

	public Object getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Object etiqueta) {
		this.etiqueta = etiqueta;
	}

	public VerticeDirigido getDestino() {
		return destino;
	}

	public void setDestino(VerticeDirigido destino) {
		this.destino = destino;
	}
	
	public String toString() {
		return "\n \tArista [destino:" + destino.getInfo() + ", etiqueta " + etiqueta.toString() + "]";
	}
}
