package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		List<Estudiante> estudiantes = Arrays.asList(new Estudiante("Luis", 10), new Estudiante("Mark", 10),
				new Estudiante("Felix", 9), new Estudiante("Patrick", 9), new Estudiante("James", 8),
				new Estudiante("Peter", 8), new Estudiante("Paul", 7), new Estudiante("James", 7),
				new Estudiante("Judas", 6), new Estudiante("Tomas", 6), new Estudiante("Felipe", 5),
				new Estudiante("Tom", 5), new Estudiante("Maria", 4), new Estudiante("Amanda", 4));

		OperacionEstudiantes op = new OperacionEstudiantes();
		Consumer<Estudiante> cons1 = e -> System.out
				.println("Nombre: " + e.getNombre() + " Calificacion: " + e.getCalificacion());

		System.out.println("\nEstudiantes sin calificacion actualizada");

		op.aceptaTodos(estudiantes, cons1);

		Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
		Consumer<Estudiante> cons3 = cons2.andThen(cons1);
		//op.aceptaTodos(estudiantes, cons2);
	
		System.out.println("\nEstudiantes con calificacion actualizada");

		op.aceptaTodos(estudiantes, cons3);

	}

} 
