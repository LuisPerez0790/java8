package predicate;

import java.util.function.BiFunction;

public class Funciones {
	
	public Double incrementoSalario(Empleado emp, double incremento, BiFunction<Double, Double, Double> bi) {
		return bi.apply(emp.getSalario(), incremento);
	}
}
