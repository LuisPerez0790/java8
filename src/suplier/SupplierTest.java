package suplier;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> i = () -> "Luis";
		
		System.out.println("El valor pasado es: " + i.get());
	}

}
