package streams;

import java.util.List;

public class StreamsFilter {

	public static void main(String[] args) {
		List<Empleado> empleados = Empleado.empleados();

		empleados.stream()
		.filter(Empleado::esHombre)
		.forEach(System.out::println);
	}

}
