package practico2;

import java.util.ArrayList;

public class BTree {
	private TNode root;
	
	public BTree(TNode root) {
		this.root = root;
	}
	
	public void add(int n) {
		if(this.root != null) {
			addpv(this.root, n);		
			
		}else {
			this.root = new TNode(n);
		}
	}
	
	private void addpv(TNode nodo, int x) { //crea un arbol ordenado
		if(nodo.getN() != 0) {
			if(nodo.getN() < x) {
				if(nodo.getRight() != null) {
					addpv(nodo.getRight(),x);
				}else {
					nodo.setRight(new TNode(x));
				}
			}else {
				if(nodo.getLeft() != null) {
					addpv(nodo.getLeft(),x);
				}else {
					nodo.setLeft(new TNode(x));
				}	
			}
		}else {
			nodo.setN(x);
		}	
	}
	
	public ArrayList<Integer> getHojas(){
		ArrayList<Integer> lista = new ArrayList<>();
		getHojaspv(root,lista);
		return lista;
	}
	
	private ArrayList<Integer> getHojaspv(TNode nodo, ArrayList<Integer> listaHojas){
		if(nodo.isHoja()) {
			listaHojas.add(nodo.getN());
		}else{
			if(nodo.getLeft() != null) {
				getHojaspv(nodo.getLeft(),listaHojas);
			}
			if(nodo.getRight() != null) {
				getHojaspv(nodo.getRight(),listaHojas);
			}
			return listaHojas;
		}
		return listaHojas;
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
}
