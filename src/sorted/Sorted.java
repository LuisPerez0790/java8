package sorted;

import java.util.Comparator;
import java.util.List;

public class Sorted {

	public static void main(String[] args) {
		System.out.println("Arreglo de nombres ordenados");

		// Arrays.asList("Alfredo", "Maria", "Armando",
		// "Jenny").stream().sorted().forEach(System.out::println);
		//
		//
		// System.out.println("Arreglo de enteros ordenados");
		// Arrays.asList(1, 2, 4, 2, 6, 4, 7, 1, 2, 7, 9, 4, 2,
		// 3).stream().sorted().forEach(System.out::println);

		List<Empleado> empleados = Empleado.empleados();

		empleados.stream().sorted().forEach(emp -> System.out.println(emp.getNombre()));

		empleados.stream().sorted(new Comparator<Empleado>() {
			@Override
			public int compare(Empleado emp1, Empleado emp2) {
				return emp1.getEdad() - emp2.getEdad();
			}

		}).forEach(emp -> System.out.println(emp.getNombre() + " Edad: " + emp.getEdad()));

		empleados.stream().filter(emp -> emp.getEdad() > 25)
				.sorted((emp1, emp2) ->(int)(emp1.getIngresos() - emp2.getIngresos())).forEach(System.out::println);

	}
}
