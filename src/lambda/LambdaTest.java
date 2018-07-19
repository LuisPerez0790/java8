package lambda;

public class LambdaTest {

	public static void main(String[] args) {

		FunctionTest ft = () -> System.out.println("hola mundo");
		Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
		// ft.saludar();
		// new LambdaTest().miMetodo((num1, num2) -> System.out.println(num1 - num2), 7,
		// 9);
		engine((x, y) -> x + y);
		engine((x, y) -> x / y);
		engine((x, y) -> x * y);
		engine((x, y) -> x % y);
	}

	public void miMetodo(Operaciones op, int num1, int num2) {
		op.imprimirOperacion(num1, num2);
	}

	public static void engine(Calculadora cal) {
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println(resultado);
	}

}
