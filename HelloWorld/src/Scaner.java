import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner keyboard = new Scanner(System.in);
//		System.out.printf("Escribe un numero:").println();
//		int numero = keyboard.nextInt();
//		keyboard.close();
//		
//		
//		if(numero == 1) {
//			
//			System.out.println("has escrito un 1");
//		}else if(numero == 2) {
//			System.out.println("has escrito un 2");
//		}else if(numero == 3) {
//			System.out.println("has escrito un 3");
//		}else if(numero == 4) {
//			System.out.println("has escrito un 4");
//		}else if(numero == 5) {
//			System.out.println("has escrito un 5");
//		}else if(numero == 6) {
//			System.out.println("has escrito un 6");
//		}else {
//			System.out.println();
//		}
//		
//		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Escribe un numero:");

		int numero = keyboard.nextInt();
		
		
		int i = 2;

		while(numero % i != 0 && i < numero-1) {
			i++;			
		}
		
		if (i == numero-1 || numero == 2) {
			System.out.println("El numero es primo");
		}else if (numero <= 1) {
			System.out.println("Has puesto un 0, un 1 o un numero negativo");
		}else {
			System.out.println("El numero no es primo");
		}
		
		keyboard.close();
//		

	}

}
