
public class Bici extends Vehiculo {
//	Constructores
	public Bici(){
		this.cambios = 6;
	}
	
	public Bici (int cambios) {
		this.cambios = cambios;
	}	
	
//	Atributos
	private int cambios;
	
	//Getters y setter
	public int getCambios() {
		return cambios;
	}
	
	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

}
