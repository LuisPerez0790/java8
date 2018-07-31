package streams;

import java.util.Random;
import java.util.stream.Stream;

public class Creacion2 {

	public static void main(String[] args) {
		Stream<Long> firstTen = Stream.iterate(1L, x -> x + 1).limit(10);
		firstTen.forEach(System.out::println);
		System.out.println();
		Stream.iterate(1L, x -> x + 1).filter(x -> x % 2 == 0).limit(10).forEach(System.out::println);
		
		System.out.println();
		Stream.iterate(1L, x -> x + 1).filter(x -> x % 2 == 0).skip(100).limit(5).forEach(System.out::println);

		System.out.println();
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		
		System.out.println();
		new Random().ints().limit(5).forEach(System.out::println);

	}

}
