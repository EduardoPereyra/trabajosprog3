package practico5;

import java.util.ArrayList;

public class Main {
	static ArrayList<Habitacion> habitaciones = new ArrayList<>();
	static int pos_salida;
	public static void main(String[] args) {
		ejercicio1(1,8);

	}
	
	public static void ejercicio1(int pos_entrada, int pos_salida) {
		
		ArrayList<Habitacion> recorrido_mayor = new ArrayList<>();
		ArrayList<Habitacion> recorrido_actual = new ArrayList<>();
		back1(recorrido_mayor, recorrido_actual, habitaciones.get(pos_entrada));
	}
	
	
	private static void back1(ArrayList<Habitacion> recorrido_mayor,ArrayList<Habitacion> recorrido_actual, Habitacion habitacionactual){
		recorrido_actual.add(habitacionactual);
		if(recorrido_actual.get(recorrido_actual.size()-1).equals(habitaciones.get(pos_salida))) {
			if(recorrido_actual.size() > recorrido_mayor.size()) {
				recorrido_mayor = recorrido_actual;	
				return;
			}
		}else{
			for(int i = 0; i < habitacionactual.getPuertas().size(); i++) {
				if(!(recorrido_actual.contains(habitacionactual.getPuertas().get(i).getEntrada()))) {
					back1(recorrido_actual,recorrido_mayor,habitacionactual.getPuerta(i).getEntrada());	
				}
			}		
		}
		recorrido_actual.remove(habitacionactual);
	}

}
