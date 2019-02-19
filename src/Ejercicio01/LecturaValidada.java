package Ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaValidada{

	// Leer número entero
	public int leerNumeroEntero () {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		try {
			
			System.out.print("Número entero\n");
			System.out.print("Número: ");
			a = sc.nextInt();
			
		}
		catch (InputMismatchException exc) {
			
			// Excepción por defecto (no se ha introducido un número)
			a = -404;
			
		}
		
		return a;
		
	}
	
	// Leer número entero dentro de rango
	public int leerNumeroDentroRango () {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		try {
			
			System.out.print("Número entero dentro de rango\n");
			System.out.print("Número: ");
			a = sc.nextInt();
			
			if (a < 2 || a > 5) {
				
				throw new ExcepcionNumeroDentroRango();
				
			}
		}
		catch (ExcepcionNumeroDentroRango exc) {
			
			// Excepción personalizada (numero dentro de rango)
			a = -1;
			
		}
		catch (InputMismatchException exc) {
			
			// Excepción por defecto (no se ha introducido un número)
			a = -2;
			
		}
		
		return a;
	}
	
	// Leer número real
	
	// Leer número real positivo
	public double leerNumeroReal () {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		try {
			
			System.out.print("Número real\n");
			System.out.print("Número: ");
			a = sc.nextDouble();
			
			if (a < 0) {
				
				throw new ExcepcionNumeroRealPositivo();
				
			}
			
		}
		catch (ExcepcionNumeroRealPositivo exc) {
			
			a = -1;
			
		}
		catch (InputMismatchException exc) {
			
			a = -2;
			
		}
		
		return a;
	}
	
	// Leer número real positivo

	// Leer número real dentro de rango



}
