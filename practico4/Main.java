package practico4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ejercicio1(2478);

	}
	
	public static void ejercicio1(int n) {
		Billetes billetes = new Billetes();
		ArrayList<Integer> respuesta = billetes.vuelto(n);	
		for(int i = 0; i < respuesta.size(); i++) {
			System.out.println("$"+respuesta.get(i));
		}
	}

}
