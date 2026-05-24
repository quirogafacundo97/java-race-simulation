package ejercicio;

public class Auto {
	private Conductor conductor;
	private Motor motor;
	private Tanque tanque;
	private double distanciaRecorrida;
	
	public Auto(Conductor conductor) {
		this.conductor = conductor;
		this.motor = new Motor(1,5,true);
		this.tanque = new Tanque(30,5,false);
		this.distanciaRecorrida=0;
	}
	
	//Método que simula el movimiento de un auto durante 1 minuto
	public void mover() {
		if(motor.getEncendido()) {
			if(tanque.getCapActual() >= motor.getConsumoXMin()) {
				tanque.consumoNafta(motor.getConsumoXMin());
				distanciaRecorrida+= motor.getConsumoXMin() * motor.getDistanciaXLitro();
				System.out.println("El auto avanzo 1 minuto");
			}
			else {
				System.out.println("El auto se quedó sin nafta");
				motor.setEncendido(false);
			}
		}
		else {
			System.out.println("El auto esta apagado");
		}
	}
	
	//Método para cargar una cantidad de nafta
	public void cargarNafta(double cantidad) {
		if(tanque.getCapActual() < tanque.getCapTotal()) {
			tanque.cargarNaftaCantidad(cantidad);
		}
		else {
			System.out.println("Tanque lleno");
		}
	}
	
	//Método para cargar tanque lleno
	public void cargarNafta() {
		if(tanque.getCapActual() < tanque.getCapTotal()) {
			tanque.cargarNaftaLleno();
		}
		else {
			System.out.println("Tanque lleno");
		}
	}
	
	public double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}
	
	public Conductor getConductor() {
		return conductor;
	}
	
	public void setConductor(Conductor otroConductor) {
		conductor = otroConductor;
	}
	
	public Tanque getTanque() {
		return tanque;
	}
	
	@Override
	public String  toString() {
		return "Nafta: " + tanque.getCapActual();
	}
}
