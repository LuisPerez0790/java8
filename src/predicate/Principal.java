package predicate;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = Arrays.asList(new Empleado("Luis", 27, 2000D, "DGTI"),
				new Empleado("Luis1", 21, 3000D, "ABC"), new Empleado("Luis2", 22, 4000D, "DEF"),
				new Empleado("Luis3", 23, 2000D, "GHI"), new Empleado("Luis4", 24, 3000D, "JKL"),
				new Empleado("Luis5", 25, 4000D, "MNO"), new Empleado("Luis6", 26, 2000D, "PKR"),
				new Empleado("Juan", 27, 3000D, "STU"), new Empleado("Luis8", 28, 4000D, "UVX"),
				new Empleado("Luis9", 29, 2000D, "YZ"));

		Evaluador evaluador = new Evaluador();
		System.out.println("Empleados con salarios > 3000");

		List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados, empleado -> empleado.getSalario() > 3000);

		for (Empleado empleado2 : empSalariosAltos) {
			System.out.println(empleado2);
		}

		System.out.println("\nEmpleados que empiezan con J");

		List<Empleado> empleadosJ = evaluador.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("J"));

		for (Empleado empleado2 : empleadosJ) {
			System.out.println(empleado2);
		}

		System.out.println("\nEmpleados jovenes: ");
		List<Empleado> empleadosJovenes = evaluador.evaluar(listaEmpleados, empleado -> empleado.getEdad() < 25);
		for (Empleado empleado3 : empleadosJovenes) {
			System.out.println(empleado3);
		}

		Funciones funciones = new Funciones();
		for (Empleado empleado : empleadosJovenes) {
			double nuevoSalario = funciones.incrementoSalario(empleado, 10,
					(salario, incremento) -> salario + (salario * (incremento / 100)));
			
			empleado.setSalario(nuevoSalario);
		}
		System.out.println("\nSalarios actualizados: ");
		for (Empleado empleado3 : empleadosJovenes) {
			System.out.println(empleado3);
		}

	}

}
