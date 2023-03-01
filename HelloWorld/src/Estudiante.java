
public class Estudiante extends Persona{
//	Constructores
	public Estudiante(float sumaNotas, float notaMedia) {
		this.numeroNotas = 5;
		this.sumaNotas = sumaNotas;
		this.notaMedia = notaMedia;
	}
	
//	Atributos
	private int numeroNotas;
	private float sumaNotas;
	private float notaMedia;
	
//	Metodos
	public void agregarNota() {};
	public void mostrarInfo() {};
	public void crearEstudiante() {}
	
	
//	Getters y setters
	public int getNumeroNotas() {
		return numeroNotas;
	}
	public void setNumeroNotas(int numeroNotas) {
		this.numeroNotas = numeroNotas;
	}
	public float getSumaNotas() {
		return sumaNotas;
	}
	public void setSumaNotas(float sumaNotas) {
		this.sumaNotas = sumaNotas;
	}
	public float getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
	
}
