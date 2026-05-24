package ejercicio;

public class Motor {
	private double consumoXMin;
	private double distanciaXLitro;
	private boolean encendido;
	
	public Motor(double consumoXMin, double distanciaXLitro, boolean encendido) {
		this.consumoXMin = consumoXMin;
		this.distanciaXLitro = distanciaXLitro;
		this.encendido = encendido;
	}
	
	public double getConsumoXMin() {
		return consumoXMin;
	}
	
	public double getDistanciaXLitro() {
		return distanciaXLitro;
	}
	
	public boolean getEncendido() {
		return encendido;
	}
	
	public void setEncendido(boolean estado) {
		encendido = estado;
	}
}


