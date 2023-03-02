package Vehiculo;

public interface Vehiculo {
	
	//Atributos
	public static final float g = 9.8f;

	//Metodos
	public abstract void parar();
	public abstract void acelerar();
	public abstract void desacelerar();
	public abstract void girarIzquierda();
	public abstract void girarDerecha();

}
