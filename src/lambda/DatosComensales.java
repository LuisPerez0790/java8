package lambda;

import java.util.function.Function;

import pojos.Comensal;

public class DatosComensales {
	
	public static void main(String[] args) {
		Comensal com1 = new Comensal("Luis",27,2);
		String nombreCom = (String) getComensalData(com1, x -> x.getName());
		int age = (int) getComensalData(com1, x -> x.getAge());
		System.out.println("El nombre del comensal es: " + nombreCom);
		System.out.println("La edad del comensal es: "+ age);
		
	}
	
	public static Object getComensalData(Comensal com , Function<Comensal, Object> func) {
		return func.apply(com);
	}

}
