package ejercicio;

public class Main {

	public static void main(String[] args) {
		
		Conductor conductor1 = new Conductor("Facundo", 123);
		Auto auto1 = new Auto(conductor1);
		
		Conductor conductor2 = new Conductor("Mauricio", 456);
		Auto auto2 = new Auto(conductor2);
		
		Conductor conductor3 = new Conductor("Diego", 789);
		Auto auto3 = new Auto(conductor3);
		
		Auto[]	autos = {auto1, auto2, auto3};
		
		Carrera tc2000 = new Carrera(autos, 26);
		tc2000.simular();
		
		System.out.println("Nafta auto1: " + auto1);
		System.out.println("Nafta auto2: " + auto2);
		System.out.println("Nafta auto3: " + auto3);
	}

}
