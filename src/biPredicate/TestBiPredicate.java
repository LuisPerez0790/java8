package biPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import predicate.Empleado;

public class TestBiPredicate {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = Arrays.asList(new Empleado("Hugo", 27, 2000D, "ventas"),
				new Empleado("Paco", 21, 3000D, "finanzas"), new Empleado("Luis", 22, 4000D, "cobranza"),
				new Empleado("Alan", 23, 2000D, "desarrollo"), new Empleado("Pedro", 24, 3000D, "finanzas"),
				new Empleado("Nayeli", 25, 4000D, "ventas"), new Empleado("Amalia", 26, 2000D, "desarrollo"),
				new Empleado("Angel", 27, 3000D, "finanzas"), new Empleado("Andres", 28, 4000D, "ventas"),
				new Empleado("Javier", 29, 2000D, "cobranza"));

		Evaluador evaluador = new Evaluador();

		// empleados mayores a 25 años y que sean del departamento de ventas
		BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad >= 25)
				&& (departamento.equals("ventas"));

		BiPredicate<Integer, String> SegundoCriterio = (edad, departamento) -> (edad >= 25)
				&& (departamento.equals("finanzas") /* || departamento.equals("ventas") */);

		BiPredicate<Integer, String> criterio = primerCriterio.or(SegundoCriterio);

		System.out.println("Empleados de mostrador o ventas mayores de 25 años");

		List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);

		for (Empleado empleado : listaActualizada) {
			System.out.println(empleado);
		}

	}

}
