package practico5;

import java.util.ArrayList;

public class Habitacion {
	private ArrayList<Puerta> puertas;
	
	public Habitacion() {
		this.puertas = new ArrayList<>();
	}

	public Puerta getPuerta(int i) {
		return this.puertas.get(i);
	}

	public ArrayList<Puerta> getPuertas() {
		return puertas;
	}

	public void setPuertas(Puerta puerta) {
		this.puertas.add(puerta);
	}

}
