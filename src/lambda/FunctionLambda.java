package lambda;

import java.util.function.Function;

public class FunctionLambda {
	
	public static void main(String[] args) {
		Function<Integer,String> convertidor = x -> Integer.toString(x);
		
		System.out.println(convertidor.apply(3).length());
		System.out.println(convertidor.apply(30).length());
		System.out.println(convertidor.apply(300).length());
	}

}
