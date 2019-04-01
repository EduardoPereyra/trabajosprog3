package practico1;

public class Pila {
	
	private MySimpleLinkedList lista;
	
	public Pila() {
		lista = new MySimpleLinkedList();
	}
	
	public void push(Object o) { //Inserta al principio
		this.lista.insertFront(o);
	}
	
	public Object pop() { //elimina el primero
		return this.lista.extractFront();
	}
	
	public Object top() { //devuelve el primero
		return this.lista.get(1);
	}
		
	public void reverse() { //invierte la pila
		MySimpleLinkedList tmp = new MySimpleLinkedList(); 
		int tamanio = this.lista.size()+1;
		for(int i = 1; i < tamanio; i++) {
			tmp.insertFront(this.lista.extractFront());
		}
		this.lista = tmp;
	}
}
