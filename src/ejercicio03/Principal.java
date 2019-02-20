package ejercicio03;

import java.util.Scanner;

public class Principal {

	private static int menu(Scanner teclado) {
		System.out.println(" Menú de Agenda ");
		System.out.println("--------------------------");
		System.out.println("1.- Cargar Fichero Agenda");
		System.out.println("2.- Guardar Fichero Agenda");
		System.out.println("3.- Buscar Nombre");
		System.out.println("4.- Insertar Nuevo Nombre");
		System.out.println("5.- Eliminar Nombre");
		System.out.println("0.- Salir");
		System.out.print("Seleccione [0..5]: ");
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);

		int opcion = -1;
		boolean opcionCorrecta = false;
		
		do {
			
			try {

				opcion = menu(tec);

				if (opcion < 0 || opcion > 5) {
					throw new ExcepcionNumeroFueraDeRango();
				}
				
				opcionCorrecta = true;

			}
			catch (ExcepcionNumeroFueraDeRango e){

				ExcepcionNumeroFueraDeRango exc = new ExcepcionNumeroFueraDeRango();
				System.out.println(exc.mensajeDeError());
			}
			
		} while (!opcionCorrecta);

		switch(opcion) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}



	}

}
