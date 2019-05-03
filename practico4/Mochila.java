package practico4;

import java.util.ArrayList;

public class Mochila {
	private ArrayList<ObjetoValor> objetos;
	private double peso_maximo;
	public Mochila(double peso_maximo) {
		this.objetos = new ArrayList<>();
		this.peso_maximo = peso_maximo;
	}
	
	public void addObjeto(ObjetoValor o) {
		this.objetos.add(o);
	}
	
	public ObjetoValor getObjetoValor(int i) {
		return this.objetos.get(i);
	}
	
	public ArrayList<ObjetoValor> getObjetosValor(){
		return objetos;
	}

	public double getPeso_maximo() {
		return peso_maximo;
	}

	public void setPeso_maximo(double peso_maximo) {
		this.peso_maximo = peso_maximo;
	}
	
	public ArrayList<ObjetoValor> llenarMochila(){ //llena un arreglo con objetos teniento la mayor cantidad de valor posible
		ArrayList<ObjetoValor> mochila = new ArrayList<>();//ya arranca la mochila vacia
		double peso = 0.0; //peso actual
		while(peso <= this.peso_maximo) {
			int i = this.seleccionarMejor(); //elegir el mejor
			if(peso + this.objetos.get(i).getPeso() <= peso_maximo) { //que no se pase del peso maximo
				mochila.add(this.objetos.get(i)); //agrega el objeto en la mochila
				peso += this.objetos.get(i).getPeso();
				this.objetos.remove(i); //saca el objeto de la coleccion
			}else {
				//saco copia del objeto seleccionado
				ObjetoValor tmp = new ObjetoValor(this.objetos.get(i).getPeso(), this.objetos.get(i).getValor()); 
				tmp.setPeso((this.peso_maximo - peso)/this.objetos.get(i).getPeso()); 
				//agarra la mayor cantidad que entra en lo que queda de la mochila
				mochila.add(tmp);
				double aux = this.objetos.get(i).getPeso();
				this.objetos.get(i).setPeso(aux - tmp.getPeso());
				peso = this.peso_maximo; //mochila completa
			}		
		}		
		return mochila;
	}
		
	public int seleccionarMejor() {
		int i = 0;
		double max = 0.0; //peso
		int maximo = 0; //pos
		while(i < this.objetos.size()) {
			double tmp = this.objetos.get(i).getValor()/this.objetos.get(i).getPeso();
			if(tmp > max) {
				max = tmp; //guarda el v/kg maximo
				maximo = i; //guarda la posicion
			}
			i++;
		}
		return maximo;
	}
	
}
