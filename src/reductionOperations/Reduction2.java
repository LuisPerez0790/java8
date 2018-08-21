package reductionOperations;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Reduction2 {

	public static void main(String[] args) {

		int[] numeros = { 4, 6, 10, 5, 7, 3, 4, 21, 6, 9, 4, 3, 7, 2 };

		int suma = IntStream.of(numeros).reduce(0, new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				return left + right;
			}
		});

		System.out.println(suma);

		int suma2 = IntStream.of(numeros).reduce(0, Integer::sum);
		System.out.println(suma2);

	}
}
