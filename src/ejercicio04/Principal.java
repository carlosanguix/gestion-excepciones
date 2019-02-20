package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static void metodo1() throws Exception1, Exception2 {

		int[] vector =new int[] {1, 2};

		int num2 = vector[3];

//		if (vector[1] > 0) {
//
//			throw new Exception1();
//		}
//
//		if (vector[1] != 0) {
//
//			throw new Exception2();
//		}
	}

	static void metodo2 () {

		Scanner sc = new Scanner(System.in);

		int[] vector = new int[1];

		try {

			vector[1] = sc.nextInt();

		}
		catch (IndexOutOfBoundsException e) {

			System.out.println("texto0");
		}
	}

	static void metodo3 () throws Exception3, Exception1 {

		Scanner sc = new Scanner(System.in);

		String animal = sc.nextLine();

		if (!animal.equals("pajaro")) {

			throw new Exception3();
		}

		if (!animal.equals("perro")) {

			throw new Exception1();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			metodo1();
			metodo2();
			metodo3();

		}
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
		finally {
			System.out.println("texto5");
		}




	}

}
