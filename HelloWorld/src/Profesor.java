
public class Profesor extends Persona {

//	Constructores
	public Profesor(int edadEstudiantes, float sumaEdadEstudiantes, float edadMediaEstudiantes) {
		super();
		this.edadEstudiantes = edadEstudiantes;
		this.sumaEdadEstudiantes = sumaEdadEstudiantes;
		this.edadMediaEstudiantes = edadMediaEstudiantes;
	}
//	Atributos
		private int edadEstudiantes;
		private float sumaEdadEstudiantes;
		private float edadMediaEstudiantes;

//	Metodos
	public void agregarEdadEstudiantes() {};
	public void mostrarInfo() {}
	
//	getters setters

	public int getEdadEstudiantes() {
		return edadEstudiantes;
	}

	public void setEdadEstudiantes(int edadEstudiantes) {
		this.edadEstudiantes = edadEstudiantes;
	}

	public float getSumaEdadEstudiantes() {
		return sumaEdadEstudiantes;
	}

	public void setSumaEdadEstudiantes(float sumaEdadEstudiantes) {
		this.sumaEdadEstudiantes = sumaEdadEstudiantes;
	}

	public float getEdadMediaEstudiantes() {
		return edadMediaEstudiantes;
	}

	public void setEdadMediaEstudiantes(float edadMediaEstudiantes) {
		this.edadMediaEstudiantes = edadMediaEstudiantes;
	};
	
	

}
