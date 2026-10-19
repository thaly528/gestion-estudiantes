public class Principal {
	public static void main(String[] args) {
		System.out.println("=== CONTROL DE ALUMNOS ===");
		Estudiante e1 = new Estudiante("Ana Gomez", 85.5);
		Estudiante e2 = new Estudiante("Carlos Perez", 45.0);
		e1.mostrar();
		e2.mostrar();
	}
}

class Estudiante {
	private final String nombre;
	private final double nota;

	Estudiante(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	void mostrar() {
		System.out.println("Alumno: " + nombre + " | Nota: " + nota);
	}
}
