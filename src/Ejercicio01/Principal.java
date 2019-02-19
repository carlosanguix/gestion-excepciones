package Ejercicio01;

public class Principal {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		LecturaValidada l = new LecturaValidada();
		
		int numeroInt;
		double numeroDouble;
		
		// Leer número entero
		numeroInt = l.leerNumeroEntero();
		
		if (numeroInt > -404) {
			
			System.out.println(numeroInt);
		
		} else {
			
			System.out.println("No has introducido un número válido");
		}
		
		// Leer número dentro de un rango
		numeroInt = l.leerNumeroDentroRango();
		
		if (numeroInt == -1) {
			
			ExcepcionNumeroDentroRango exc = new ExcepcionNumeroDentroRango();
			System.out.println(exc.mensajeError());
			
		} else if (numeroInt == -2) {
			
			System.out.println("No has introducido un número válido.");
			
		} else {
			
			System.out.println(numeroInt);
			
		}
		
		// Leer número real
		
		// Leer número real positivo
		numeroDouble = l.leerNumeroReal();
		
		if (numeroDouble == -1) {
			
			ExcepcionNumeroRealPositivo exc = new ExcepcionNumeroRealPositivo();
			System.out.println(exc.mensajeError());
			
		} else if (numeroDouble == -2) {
			
			System.out.println("No has introducido un número válido.");
			
		} else {
			
			System.out.println(numeroDouble);
			
		}
		
		// Leer número real dentro de rango
		
	}
}
