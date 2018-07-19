package binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		BinaryOperator<Integer> bOperator = (num1, num2) -> num1 * num2;

		System.out.println(bOperator.apply(5, 5));
	
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));
		System.out.println("El numero mayor de 10 y 20 es: " + maxBy.apply(10, 20));
	
		BinaryOperator<Integer> minBy = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
		System.out.println("El numero menor de 10 y 20 es: " + minBy.apply(10, 20));
		
	}

}
