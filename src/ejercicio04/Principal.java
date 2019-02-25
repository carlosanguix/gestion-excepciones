package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// Este método contempla la posibilidad de que alguna de las instrucciones falle
	// en un tipo de excepción "personalizada" (creada por el usuario).
	// Siempre tendrás que "capturar/indicar" los márgenes o el momento
	// en el que la instrucción pueda dar el fallo y lanzarla (throw).
	static void metodo1() throws Exception1, Exception2 {
		int[] vector =new int[] {1};

		// a) En (1) la excepción de usuario Excepcion1.
//		if (vector[0] > 0) {
//			throw new Exception1();
//		}
	
		// b) En (1) la excepción unchecked IndexOutOfBoundsException.
//		int num2 = vector[3];
		
		// c) En (1) la excepción de usuario Excepcion2.
//		if (vector[0] < 100) {
//			throw new Exception2();
//		}
	}

	// Este método NO contempla la posibilidad de que alguna de sus instrucciones falle
	// en algún punto a simple vista (dentro de los "catch" que están contemplados fuera).
	// Pero vemos que dentro si que captura un fallo posible que no se contempla en la creación del método
	// Aunque si que capturemos "ese" fallo en los catch de abajo si no lo propagamos al método,
	// no contempla ni captura "ese" fallo...
	static void metodo2 () {
		Scanner sc = new Scanner(System.in);
		int[] vector = new int[1];

		// d) En (2) la excepción unchecked InputMismatchException.
		vector[0] = sc.nextInt();
		
		// e) En (2) la excepción unchecked IndexOutOfBoundsException.
//		try {
//			vector[1] = sc.nextInt();
//		}
//		catch (IndexOutOfBoundsException e) {
//
//			System.out.println("texto0");
//		}
	}

	static void metodo3 () throws Exception3, Exception1 {
		Scanner sc = new Scanner(System.in);
		int[] vector = new int[1];
		
		// f ) En (3) la excepción de usuario Excepcion3.
//		if (vector[0] != 2) {
//			throw new Exception3();
//		}

		// g) En (3) la excepción unchecked InputMismatchtException.
//		vector[0] = sc.nextInt();
		
	}

	public static void main(String[] args) {
		
		System.out.println("Hola");
		// El programa "intentará" realizar las instrucciones que haya en el interior del try.
		// Si fallan en algunas de las excepciones capturadas más abajo y (en este caso),
		// los métodos (en su "título") lanzan (throws) ese tipo de excepciones en el caso de que fallen,
		// ese fallo se capturará más en los catch de abajo.
		
		try {

			metodo1();
			metodo2();
			metodo3();

		}
		// Excepciones capturadas para las instrucciones que haya dentro del try.
		catch (Exception1 e) {
			System.out.println("texto1"); 
		}
		catch (Exception2 e) {
			System.out.println("texto2"); 
		}
		catch (Exception3 e) {
			System.out.println("texto3"); 
		}
		catch (InputMismatchException e) {
			System.out.println("texto4"); 
		}
		// Antes de finalizar el programa por un fallo (siempre que sea capturado por las excepciones),
		// se ejecutará lo que haya dentro del finally.
		finally {
			System.out.println("texto5");
		}

	}

}
