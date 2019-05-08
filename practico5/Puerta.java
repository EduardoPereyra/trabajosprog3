package practico5;

public class Puerta {
	private Habitacion entrada;

	public Puerta(Habitacion entrada) {
		this.entrada = entrada;
	}

	public Habitacion getEntrada() {
		return entrada;
	}

	public void setEntrada(Habitacion entrada) {
		this.entrada = entrada;
	}
}
