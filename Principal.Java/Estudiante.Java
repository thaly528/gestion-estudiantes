public class Estudiante {
	String nombre;
	double calificacion;

	public Estudiante(String n, double c) {
		nombre = n;
		calificacion = c;
	}

	public void mostrar() {
		System.out.println("Estudiante: " + nombre + " Nota: " + calificacion);
		if (calificacion >= 60) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Reprobado");
		}
	}
}
