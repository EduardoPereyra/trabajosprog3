package practico2;

import java.util.ArrayList;

public class Main {
	final static int MAX = 10;

	public static void main(String[] args) {
		
		/*Ejercicio 1*/
/*		
		int Arreglo[] = new int[MAX]; 
		for(int i = 0; i < Arreglo.length ; i++) {
			Arreglo[i] = i;
		}
		
		Arreglo[8] = 10;
		
		for(int i = 0; i < Arreglo.length ; i++) {
			System.out.println(Arreglo[i]);
		}
		
		System.out.println("esta ordenado? " + estaOrdenado(Arreglo, 0));
*/		
		
		TNode raiz = new TNode(10);
		BTree arbol = new BTree(raiz);
		
		arbol.add(7);
		arbol.add(15);
		arbol.add(1);
		arbol.add(17);
		arbol.add(12);
		arbol.add(11);
		arbol.add(3);
		
		arbol.imprimir();
/*		
		int valor = 17;
		System.out.println("contiene "+ valor + "->" +arbol.hasElem(valor));
*/		
/*		
		int level = 3;
		ArrayList<Integer> lista = arbol.getElemAtLevel(level);
		System.out.println("get Elem At Level " + level);
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
*/
		
		ArrayList<Integer> lista1 = arbol.getHojas();
		System.out.println("getHojas");
		for(int i = 0; i < lista1.size(); i++) {
			System.out.println(lista1.get(i));
		}
	}

/*	
	public static boolean estaOrdenado(int aux[],int pos) {
		if(pos < aux.length-1) {
			if(aux[pos] > aux[pos+1]) {
				return false;
			} else {
				return estaOrdenado(aux, pos+1);
			}
		}
		return true;
	}
*/	
}
