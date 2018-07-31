package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Creation {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("This is an example of unique param");
		stream1.forEach(System.out::println);

		System.out.println();

		Stream<String> stream2 = Stream.of("value1", "value2", "value3");
		stream2.forEach(System.out::println);

		System.out.println();

		String array[] = { "x1", "x2", "x3" };
		Stream<String> stream3 = Stream.of(array);
		stream3.forEach(System.out::println);

		System.out.println();

		Stream<Estudiante> streamEstudiante = Stream.<Estudiante>builder()
				.add(new Estudiante("Luis", "Herrera", 21, "Olvera1"))
				.add(new Estudiante("Enrique", "Perez", 22, "Olvera2"))
				.add(new Estudiante("Juan", "Aguilar", 23, "Olvera3"))
				.add(new Estudiante("Charrasquedo", "Gomez", 24, "Olvera4")).build();

		streamEstudiante.forEach(e -> System.out.println(e.getName()));

		System.out.println();
	
		IntStream oneToTwenty = IntStream.range(1, 21);
		oneToTwenty.forEach(System.out::println);

	}

}
