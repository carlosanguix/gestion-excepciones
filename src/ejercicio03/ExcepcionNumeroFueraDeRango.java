package ejercicio03;

public class ExcepcionNumeroFueraDeRango extends Exception {

	public String mensajeDeError (int opcion) {
		
		return "La opcion elegida es: " + opcion;
	}
	
}
