package biFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
	
	public static void main(String[] args) {
		List<Empleado> empleados = Arrays.asList(new Empleado("Luis", 1000.0),
												 new Empleado("Juan", 2000.0),
												 new Empleado("pedro", 3000.0),
												 new Empleado("gonzalo", 4000.0),
												 new Empleado("pablo", 5000.0));
		
		double incrementoAceptado = 16;
		
		BiFunction<Double, Double, Double> bi = (salario, incremento) -> salario + (salario * (incremento / 100));
		
		List<Empleado> empleadosNuevo = incrementaSalarios(empleados, bi, incrementoAceptado);
		for (Empleado empleado : empleadosNuevo) {
			System.out.println(empleado);
		}
 	}
	
	public static List<Empleado> incrementaSalarios(List<Empleado> empleados, BiFunction<Double, Double, Double> bi, Double incrementoAceptado){
		for (Empleado empleado : empleados) {
			empleado.setSalario(bi.apply(empleado.getSalario(), incrementoAceptado));
		}
		return empleados;		
	}

}
