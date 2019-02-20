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
		
		try {
			
			f = (Figura) o;
		
		}
		catch (ClassCastException e) {
			
			System.out.println("No se puede castear");
		}
		
		
		return this.color.equals(f.color) &&
		this.nombre.equals(f.nombre) &&
		this.area() == f.area();
		}
	
	
}
