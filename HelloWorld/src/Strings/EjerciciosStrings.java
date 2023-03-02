package Strings;

public class EjerciciosStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String cadena = "";
		
		
		
		String palabra = "aleyo";
		
		System.out.println(palabra);

		for(int i = 0; i < palabra.length(); i++) {
			
			cadena += palabra.charAt(i);
			
		}
		System.out.println(cadena);
		
	}

}
