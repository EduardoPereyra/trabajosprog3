package practico4;

import java.util.ArrayList;

public class Billetes {
	private ArrayList<Integer> billetes;
	
	
	public Billetes() {
		this.billetes = new ArrayList<>();
		this.billetes.add(1000);
		this.billetes.add(500);
		this.billetes.add(200);
		this.billetes.add(100);
		this.billetes.add(50);
		this.billetes.add(20);
		this.billetes.add(10);
		this.billetes.add(5);
		this.billetes.add(1);
	}
	
	public ArrayList<Integer> vuelto(int n) {//best fit
		ArrayList<Integer> respuesta = new ArrayList<>();//solucion vacia
		int i = 0;
		while((i < this.billetes.size())&&(n > 0)) {//recorrer
			if(n >= this.billetes.get(i)) { //es factible
				respuesta.add(this.billetes.get(i)); //agregar
				n -= this.billetes.get(i);
			}else{
				i++; //borrar
			}
		}		
		return respuesta;
	}
}
