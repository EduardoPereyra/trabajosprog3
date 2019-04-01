package practico1;

public class Main {

	public static void main(String[] args) {
		/*Ejercicio 1 y 2*/
/*		
		MySimpleLinkedList lista = new MySimpleLinkedList();
		for (int i = 100; i < 110; i++)
			lista.insertFront(i);
		System.out.println("Tamanio : " + lista.size());
		System.out.println("Get : " + lista.get(3));
		lista.print(9);
*/		
		
		/*Ejercicio 3*/
/*		
 		Pila p = new Pila();
		for (int i = 100; i < 110; i++)
			p.push(i);
		System.out.println("Primera pos: " + p.top());
		p.reverse();
		System.out.println("Primera pos: " + p.top());
		p.pop();
		System.out.println("Primera pos: " + p.top());
		
		for(int j = 1; j < 9; j++) {
			System.out.println(j + " pos: " + p.top());
			p.pop();
		}
*/		
				
		/*Ejercicio 4*/
/*	
		ListInt lista = new ListInt();
		for (int i = 100; i < 110; i++)
			lista.insertFront(i);
//		for (int i = 110; i > 100; i--)
//			lista.insertFront(i);
		lista.max();
*/
		
		/*Ejercicio 5*/

/*		
		ListInt lista1 = new ListInt();
		ListInt lista2 = new ListInt();
		
		lista1.insertFront(4);
		lista1.insertFront(3);
		lista1.insertFront(2);
		lista1.insertFront(1);
		lista1.insertOrdenado(7);
		lista1.insertOrdenado(6);
		lista1.insertOrdenado(9);
		
		lista2.insertOrdenado(4);
		lista2.insertOrdenado(2);
		lista2.insertOrdenado(6);
		lista2.insertOrdenado(5);
		
		ListInt.MyIterator it1 = lista1.iterator();
		System.out.println("lista 1");
		while(it1.hasNext()) {
			int tmp1 = it1.next();
			System.out.println(tmp1);
		}
		ListInt.MyIterator it2 = lista2.iterator();
		System.out.println("lista 2");
		while(it2.hasNext()) {
			int tmp2 = it2.next();
			System.out.println(tmp2);
		}
		
		ListInt listanueva = listaiguales(lista1,lista2);
		
		ListInt.MyIterator it3 = listanueva.iterator();
		System.out.println("lista ordenada con iguales");
		while(it3.hasNext()) {
			int tmp = it3.next();
			System.out.println(tmp);
		}
*/		
		/*Ejercicio 6*/
/*	
		ListInt listanueva2 = listaprimeraSisegundaNo(lista1,lista2);
		
		ListInt.MyIterator it = listanueva2.iterator();
		System.out.println("lista ordenada con distintos de la primera lista");
		while(it.hasNext()) {
			int tmp = it.next();
			System.out.println(tmp);
		}
*/		
	}
	
/*	
	public static ListInt listaiguales(ListInt lista1 , ListInt lista2) { //Ejercicio 5b
		ListInt auxList = new ListInt();
		ListInt.MyIterator it1 = lista1.iterator();
		ListInt.MyIterator it2 = lista2.iterator();
		
		while(it1.hasNext() && it2.hasNext()) {
			int valor1 = it1.get();
			int valor2 = it2.get();
			
			if(valor1 == valor2) {
				auxList.insertOrdenado(valor1);
				it1.next();
				it2.next();
			}else if(valor1 < valor2) {
				it1.next();
			}else {
				it2.next();
			}		
		}
		return auxList;	
	}
	
	public static ListInt listaprimeraSisegundaNo(ListInt lista1 , ListInt lista2) { //Ejercicio 6
		ListInt auxList = new ListInt();
		ListInt.MyIterator it1 = lista1.iterator();
		ListInt.MyIterator it2 = lista2.iterator();
		
		while(it1.hasNext() && it2.hasNext()) {
			int valor1 = it1.get();
			int valor2 = it2.get();
			
			if((valor1 < valor2)) {
				auxList.insertOrdenado(valor1);
				it1.next();
			}else if(valor1 == valor2) {
				it1.next();
				it2.next();
			}else {
				it2.next();
			}
		}
		return auxList;	
	}
*/
}
