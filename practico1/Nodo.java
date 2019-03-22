package practico1;

public class Nodo {
	private Object info;
	private Nodo next;
	public Nodo() {
		this.info = null;
		this.next = null;
	}
	
	public Nodo(Object o, Nodo n) {
		setInfo(o);
		setNext(n);
	}
	
	public void setInfo(Object o) {
		this.info = o;
	}
	
	public void setNext(Nodo n) {
		this.next = n;
	}
	
	public Object getInfo() {
		return this.info;
	}
	
	public Nodo getNext() {
		return this.next;
	}
}
