package Strings;
import java.util.Scanner;

public class EjerciciosStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char letra;		
//		
//		String palabra = "aleyo";
//		
//		System.out.println(palabra);
//
//		for(int i = 0; i < palabra.length(); i++) {
//			
//			letra = palabra.charAt(i);
//			System.out.println(letra);
//			
//		}

		
//		//Ejercicio 2 Strings
//		String pal1 = "aleyo";
//		String pal2 = "aleix";
//		
//		int longitudPal1 = pal1.length();
//		int longitudPal2 = pal2.length();
//		
//	
//		int si = 0;
//		int tambe = 1;
//		
//		String no = "No son iguales";
//		String araSi = "Si son iguales";
//		
//		if (pal1.substring(0, 2).equals(pal2.substring(0, 2))) {
//			si = 31;
//		} else {
//			si = 145679;
//		}
//		
//		if (pal1.substring((longitudPal1 -2), longitudPal1).equals(pal2.substring((longitudPal2 -2), longitudPal2))) {
//			tambe = 31;
//		} else {
//			si = 39476;
//		}
//		
//		if(si == tambe) {
//			System.out.println(araSi);
//		}else {
//			System.out.println(no);
//		}
		
		
//		//Ejercicio 3
//		Scanner tuPalabra = new Scanner(System.in);
//		System.out.printf("Escribe una palabra:").println();
//		String palabra = tuPalabra.next();
//		System.out.println("tu palabra es: " + palabra);
//		tuPalabra.close();
//				
//		
//		if (palabra.startsWith("abc") || (palabra.endsWith("abc"))) {
//			System.out.println("La palabra contiene abc al princio y/o al final");
//		} else if (palabra.contains("abc")) {
//			System.out.println("la palabra " + palabra + " contiene abc");
//		}else {
//			System.out.println("La palabra " + palabra + " no contiene abc");
//		}
		
//		//Es CAPICUA?
//		Scanner tuPalabra = new Scanner(System.in);
//		System.out.printf("Escribe una palabra:").println();
//		String palabra = tuPalabra.next();		
//		tuPalabra.close();
//		
//		int numPar = 0;
//				
//		int mitad = palabra.length()/2;
//				
//		String principio = palabra.substring(0, mitad);
//		
//		for(int i = 0; i <= palabra.length(); i++) {
//			if (palabra.length() % 2 == 0) {
//				numPar = 1;
//			}else {
//				numPar = 2;
//			}				
//		}
//		
//		String finaal = "";
//		
//		if(numPar == 2) {
//			finaal = palabra.substring(mitad +1);
//		}else if(numPar == 1) {
//			finaal = palabra.substring(mitad);
//		}
//
//				
//		String principioRevertido = new StringBuilder(principio).reverse().toString();	
//				
//		if (principioRevertido.equals(finaal)) {
//			System.out.println("La palabra " + palabra + " SI es un palindromo");
//		}else {
//			System.out.println("La palabra " + palabra + " NO es un palindromo");
//		}		
		
		
		//Ex1 pag 421
		StringBuilder palabra1 = new StringBuilder("Hola");
		StringBuilder palabra2 = new StringBuilder("Aleix");

		System.out.println(palabra1.append(" " + palabra2)); 
		
		//Ex2 pag 421
		StringBuilder palabra3 = new StringBuilder("Aleyo");
		
		System.out.println(palabra3.delete(palabra3.length() -1, palabra3.length()));
		
		//Ex3 pag 421
//		StringBuilder palabra4 = new StringBuilder("Hola a tothom!");
//		
//		int i = 0;		
//		
//		while(i < palabra4.length()) {		
//			
//			i++;
//			
//			if(i % 3 == 0) {				
//				System.out.println(palabra4.insert(i, 'b'));				
//			}				
//				
//		}		
		
		//Ex5 pag 421
		
		
			
		
	}	

}
