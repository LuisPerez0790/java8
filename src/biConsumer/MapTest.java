package biConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		String[][] arreglo = { { "Luis", "MX" }, { "Juan", "US" }, { "Pedro", "CA" }, { "Domingo", "AR" },
				{ "Amanda", "FR" }, { "Raju", "IND" } };

		for (int i = 0; i < arreglo.length; i++) {
			map.put(arreglo[i][0], arreglo[i][1]);
		}

		Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

		if (iter != null) {
			while (iter.hasNext()) {

				Map.Entry<String, String> entry = iter.next();
				System.out.println("La clave es: " + entry.getKey() + " el valor es: " + entry.getValue());
			}
		}

		System.out.println();

		map.forEach((clave, valor) -> System.out.println("La clave es: " + clave + " el valor es: " + valor));

	}

}
