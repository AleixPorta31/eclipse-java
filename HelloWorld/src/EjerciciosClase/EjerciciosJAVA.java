package EjerciciosClase;

public class EjerciciosJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public class Estudiante {

		public Estudiante(int id, int edad, int telefono, float sumaDeNotas) {
			this.id = id;
			this.edad = edad;
			this.telefono = telefono;
			this.numeroDeNotas = 5;
			this.sumaDeNotas = sumaDeNotas;
			this.notaMedia = sumaDeNotas/numeroDeNotas;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public int getNumeroDeNotas() {
			return numeroDeNotas;
		}
		
		public float getSumaDeNotas() {
			return sumaDeNotas;
		}
		public void setSumaDeNotas(float sumaDeNotas) {
			this.sumaDeNotas = sumaDeNotas;
		}
		public float getNotaMedia() {
			return notaMedia;
		}
		

		// Atributos
		private int id;
		public  int telefono;
		private int numeroDeNotas;
		private int edad;
		private float sumaDeNotas;
		private float notaMedia;

		// Metodos
		void mostrarInfo() {}
		void agregarNuevaNota() {}
	}}

	
	
	
