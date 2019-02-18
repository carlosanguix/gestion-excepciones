package Ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaValidada{

	// Leer número entero
	public int leerNumeroEntero () {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		try {
			
			a = sc.nextInt();
			
		}
		catch (InputMismatchException exc) {
			
			a = -1;
			
		}
		
		return a;
		
	}
	
	// Leer número entero dentro de rango
	public int leerNumeroDentroRango () {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		try {
			
			a = sc.nextInt();
			
			if (a < 2 || a > 5) {
				
				throw new ExcepcionNumeroDentroRango();
				
			}
		}
		catch (ExcepcionNumeroDentroRango exc) {
			
			a = -1;
			
		}
		catch (InputMismatchException exc) {
			
			a = -2;
			
		}
		
		return a;
		
	}
	
	// Leer número real

	// Leer número real positivo

	// Leer número real dentro de rango



}
