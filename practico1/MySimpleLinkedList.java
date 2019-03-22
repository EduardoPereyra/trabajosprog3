package practico1;

public class MySimpleLinkedList {
	
	protected Nodo first;
	private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(Object o) { //inserta al principio
		Nodo tmp = new Nodo(o, null);
		tmp.setNext(first);
		first = tmp;
		this.size = this.size+1;
	}
	
	public Object extractFront() { //devuelve lo eliminado al principio
		Object info = this.first.getInfo();
		this.first = this.first.getNext();		
		this.size = this.size-1;
		return info;
	}
	
	public Object get(int i) { //devuelve la info del nodo en la posicion i
		Object info;
		Nodo tmp = this.first; 
		for(int j = 0;j < i; j++) {
			tmp = tmp.getNext();
		}
		info = tmp.getInfo();
		return info;
	}
	
	public void print(int n) { //imprime la info del nodo de n elementos (no esta optimizada)
		for(int i = 0; i < n ; i++) {
				System.out.println("Informacion del nodo en la posicion "+ 
						n+ " -> "+ this.get(n));
		}
	}
	
	public boolean isEmpty() { //devuelve true si esta vacia la lista
		if(this.first != null) {
			return false;
		}
		return true;
	}
	
	public int size() { //Devuelve el tamaño
		return this.size;
	}

}
