package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura f1 = new Figura("rojo","cuadrado");
		Figura f2 = new Figura("rojo","cuadrado");
		Double d  = new Double(1.0);
		String k  = "Hello";
		
		
		boolean b1 = f1.equals(f2);
		boolean b2 = d.equals(k);
		boolean b3 = k.equals(f2);
		boolean b4 = f1.equals(d);
		
		System.out.printf("%b %b %b %b", b1, b2, b3, b4);
		
		
	}

}
