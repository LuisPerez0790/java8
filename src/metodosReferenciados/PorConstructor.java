package metodosReferenciados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PorConstructor {

	public static void main(String[] args) {
		List<String> numerosStrign = Arrays.asList("10", "10", "20", "25", "30", "35", "50");
		getResults(numerosStrign, Integer::new).forEach(PorConstructor::printData);

	}

	public static List<Integer> getResults(List<String> lista, Function<String, Integer> func) {
		List<Integer> listInt = new ArrayList<>();
		lista.forEach(num -> listInt.add(func.apply(num)));
		return listInt;
	}

	public static void printData(Integer num) {
		System.out.println("Multiplica por 10 es valor de: " + num + " dando como resultado: " + num * 10);
	}
}
