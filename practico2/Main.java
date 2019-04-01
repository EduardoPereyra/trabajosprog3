package practico2;

public class Main {
	final static int MAX = 10;

	public static void main(String[] args) {
		int Arreglo[] = new int[MAX]; 
		for(int i = 0; i < Arreglo.length ; i++) {
			Arreglo[i] = i;
		}
		
		Arreglo[8] = 10;
		
		for(int i = 0; i < Arreglo.length ; i++) {
			System.out.println(Arreglo[i]);
		}
		
		System.out.println("esta ordenado? " + estaOrdenado(Arreglo, 0));
	}
	
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
}
