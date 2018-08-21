package reductionOperations;

import java.util.List;
import java.util.stream.IntStream;

public class Reduction {

	public static void main(String[] args) {
		List<Empleado> empleados = Empleado.empleados();
		int[] numeros = { 4, 6, 10, 5, 7, 3, 4, 21, 6, 9, 4, 3, 7, 2 };

		int sum = 0;
		for (int x = 0; x < numeros.length; x++) {
			sum = sum + numeros[x];
		}

		System.out.println("la suma del arreglo es: " + sum);

		System.out.println("la suma del arreglo con streams es: " + IntStream.of(numeros).sum());

		System.out.println("El promedio del arreglo es: " + IntStream.of(numeros).average().getAsDouble());

		System.out.println("El valor minimo es: " + IntStream.of(numeros).min().getAsInt());

		System.out.println("El valor maximo es: " + IntStream.of(numeros).max().getAsInt());

		System.out.println("La suma de los salarios de los empleados es: "
				+ empleados.stream().mapToDouble(Empleado::getIngresos).sum());

		System.out.println("Empleado con salario maximo"
				+ empleados
				.stream()
				.max(
						(emp1, emp2) -> (int) (emp1.getIngresos() - emp2.getIngresos()))
				.get());
	}

}
