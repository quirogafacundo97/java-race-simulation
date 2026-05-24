package ejercicio;

public class Tanque {
	private double capTotal;
	private double capActual;
	private boolean vacio;
	
	public Tanque(double capTotal, double capActual, boolean vacio) {
		this.capTotal = capTotal;
		this.capActual = capActual;
		this.vacio = vacio;
	}
	
	public double getCapTotal()	{
		return capTotal;
	}
	
	public double getCapActual() {
		return capActual;
	}
	
	//Método que llena el tanque de combustible
	public void cargarNaftaLleno() {
		capActual = capTotal;
		vacio = false;
	}
	
	//Método que consume nafta
	public void consumoNafta(double consumo) {
		capActual-= consumo;
		if(capActual <= 0) {
			capActual=0;
			vacio = true;
		}
	}
	
	//Método que carga una determinada cantidad de combustible
	public void cargarNaftaCantidad(double cantidad) {
		capActual+= cantidad;
		if(capActual > capTotal) {
			capActual = capTotal;
			vacio = false;
		}
	}
	
	public boolean getVacio() {
		return vacio;
	}
}
