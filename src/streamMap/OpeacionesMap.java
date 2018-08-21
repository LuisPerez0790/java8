package streamMap;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class OpeacionesMap {

	public static void main(String[] args) {
		// IntStream.rangeClosed(1, 5).map(new IntUnaryOperator() {
		// @Override
		// public int applyAsInt(int operand) {
		// return operand * operand;
		// }
		// }).forEach(System.out::println);
		// System.out.println();
		// IntStream.rangeClosed(1, 5).map(n -> n * 2).forEach(System.out::println);

		List<Empleado> empleados = Empleado.empleados();

		System.out.println("Promedio de ingresos de personal femenino mayor de 25 años");

		Double suma = empleados.stream()
				.filter(emp -> emp.esMujer())
				.filter(emp -> emp.getEdad() > 25)
				.mapToDouble(emp -> emp.getIngresos()).sum();

		Double promedio = suma
				/ empleados.stream()
				.filter(emp -> emp.esMujer())
				.filter(emp -> emp.getEdad() > 25)
				.count();
		
		System.out.println(promedio);
	}

}
