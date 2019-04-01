package practico1;

import java.util.Iterator;

public class ListInt implements Iterable<Integer>{
	
	private NodoInt first;
	private int size;
	
	public ListInt() {
		this.first = null;
		this.size = 0;
	}
	
	
	public int size() {
		return this.size;
	}
	
	public void insertFront(int x) { //inserta al principio
		NodoInt tmp = new NodoInt(x,null);
		tmp.setNext(first);
		first = tmp;
		this.size = this.size+1;
	}
	
	public void insertOrdenado(int x) { //inserta ordenadamente en la lista
		NodoInt n = new NodoInt(x,null);
		if (size != 0) { //quiere decir si no esta vacio
			NodoInt puntero = this.first;
			if(puntero.getNum() > n.getNum()) {
				insertFront(n.getNum());
			} else {
				int i = 1;
				boolean sigue = true;
				
				while(( i <= this.size) && (sigue)) {
					if(puntero.getNext() != null) {
						if(puntero.getNext().getNum() > n.getNum()) {
							n.setNext(puntero.getNext());
							puntero.setNext(n);
							sigue = false; //ya lo inserto por lo tanto termina la funcion
						} else {
							puntero = puntero.getNext();
							i++;
						}	
					} else {
						puntero.setNext(n);
						sigue = false;
					}	
				}//fin while
				this.size++;
			}
		} else {
			insertFront(n.getNum());	
		}
	}
	
	public int extractFront() { //devuelve lo eliminado al principio
		int num = this.first.getNum();
		this.first = this.first.getNext();		
		this.size = this.size-1;
		return num;
	}
	
	public void max() { //devuelve el mayor numero de la lista y su nodo
		NodoInt max = new NodoInt();
		NodoInt tmp = new NodoInt();
		int indice = 0;
		tmp = this.first;
		for(int i = 1; i < this.size+1 ; i++) {
			System.out.println("fuera del if " + tmp.getNum());
			if(tmp.getNum() > max.getNum()) {
				System.out.println(tmp.getNum());
				max = tmp;
				indice = i;
			}
			tmp = tmp.getNext();
		}
		System.out.println("El mayor es " + max.getNum());
		System.out.println("El indice del mayor es " + indice);
	
	}
	
	public MyIterator iterator() {
		return new MyIterator();
	}
	
	
	
	public class MyIterator implements Iterator<Integer>{
		private int pos;
		private NodoInt nodoTmp;
		
		public MyIterator() {
			pos = 1;
			nodoTmp = first;
		}
		
		public boolean hasNext() {
			return pos <= size;
		}
		
		public Integer next() {
			Integer tmp = nodoTmp.getNum();
			nodoTmp = nodoTmp.getNext();
			pos++;
			return tmp;
		}
		
		public Integer get() {
			return nodoTmp.getNum();
		}
	}
	
}
