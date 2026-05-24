package ejercicio;

public class Carrera {
	private Auto[] autos;
	private double distancia;
	
	public Carrera(Auto[] autos, double distancia) {
		this.autos = autos;
		this.distancia = distancia;
	}
	
	//Metodo que simula una carrera con varios autos
	public void simular() {
			for(int i=0; i<autos.length; i++) {
				while(autos[i].getDistanciaRecorrida() < distancia && !autos[i].getTanque().getVacio()) {
					autos[i].mover();
				}
				if(autos[i].getTanque().getCapActual() == 0) {
					System.out.println("Auto " + (i+1) + " se quedó sin nafta");
				}
				System.out.println("Auto " + (i+1) + " termino con " + autos[i].getDistanciaRecorrida() + " km recorridos");
			}
	}
	
	public double getDistancia() {
		return distancia;
	}
}
