package practico2;

import java.util.ArrayList;

public class BTree {
	private TNode root;
	
	public BTree(TNode root) {
		this.root = root;
	}
	
	public void add(int n) {
		if(this.root != null) {
			this.root.add(n);
		}else {
			this.root = new TNode(n);
		}
	}
	
	public void imprimir() {
		if(this.root != null)
		this.root.imprimir();
	}
/*	
	public int getRoot() {
		if(this.root != null)
			return this.root.getN();
		return 0;
	}
*/
/*	
	public boolean hasElem(int n) {
		if(this.root != null) {
			return this.root.hasElem(n);
		}
		return false;
	}
*/
/*	
	public boolean isEmpty() {
		if(this.root != null) {
			if(this.root.getN() != 0) {
				return false;	
			}
			return true;
		}
		return true;
	}
*/
/*	
	public boolean delete(int n) {
		if(this.hasElem(n)) {
			return this.root.delete(n);
		}
		return false;
	}
*/
/*	
	public ArrayList<Integer> getElemAtLevel(int i) {
		ArrayList<Integer> lista = new ArrayList<>();
		this.root.getElemAtLevel(lista, i);
		return lista;
	}
*/
	
	public ArrayList<Integer> getHojas(){
		ArrayList<Integer> lista = new ArrayList<>();
		this.root.getHojas(lista);
		return lista;
	}
}
