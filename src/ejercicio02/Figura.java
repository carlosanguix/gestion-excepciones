package ejercicio02;

public class Figura {

	private String color;
	private String nombre;

	public Figura(String color, String nombre) {

		this.color  = color;
		this.nombre = nombre;
	}

	public double area() {

		return 1.0;
	}



	public boolean equals(Object o) {

		Figura f;

		boolean sonIguales;
		
		try {
			
			// Intenta castear el objeto recibido
			f = (Figura) o;
			
			// En el caso de que no pete comparar los campos
			sonIguales =  this.color.equals(f.color) &&
					this.nombre.equals(f.nombre) &&
					this.area() == f.area();

		}
		catch (ClassCastException e) {

			sonIguales = false;
		}

		return sonIguales;

	}


}
