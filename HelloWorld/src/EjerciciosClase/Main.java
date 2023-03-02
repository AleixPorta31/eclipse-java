package EjerciciosClase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("!Hola mundo!");
//		//System.out.printf("5 + 6 + 7 = %d", 5 + 6 + 7).println();
//		
//		int a = 2, b = 5, c = 3;
//		
//		System.out.printf("%d + %d + %d = %d", a, b, c, a+b+c).println();
//		
//		c = 6;
//		
//		System.out.printf("%d + %d + %d = %d", a, b, c, a+b+c).println();	
//		
//		int suma = a+b+c;
//		
//		System.out.println(a +"+"+ b +"+"+ c + "=" + suma);

		int a = 9, b = 3, c = 2, d = 5;

		if ((a + b) > (c + d)) {
			System.out.println("a + b es mayor que c + d");
		} else {
			System.out.println("a + b es igual o menor que c + ");
		}

//		if((a+b) <= (c+d)) {
//		System.out.println("a + b es igual o menor que b + c");
//		}

		int angulo1 = 180, angulo2 = 0, angulo3 = 0;

		if ((angulo1 + angulo2 + angulo3) == 180) {
			System.out.println("es un triangulo");
		} else {
			System.out.println("no es un triangulo");
		}

		int z = 31;
		if (z % 2 == 0) {
			System.out.println("es par");
		} else {
			System.out.println("es impar");
		}

		int num1 = 1, num2 = 9, num3 = 3;
		if (num1 > num2 && num1 > num3) {
			System.out.println("num 1 es el mayor");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num 2 es el mayor");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("num 3 es el mayor");
		} else {
			System.out.println("hay almenos 2 numeros iguales");
		}

	}

}
