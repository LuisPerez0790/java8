package comparator;

import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Persona> personas = Arrays.asList(
				new Persona("Luis", 27, new Date(Calendar.getInstance().getTimeInMillis())),
				new Persona("Juan", 22, new Date(Calendar.getInstance().getTimeInMillis())),
				new Persona("Pedro", 30, new Date(Calendar.getInstance().getTimeInMillis())),
				new Persona("Ramon", 56, new Date(Calendar.getInstance().getTimeInMillis())),
				new Persona("Agustin", 76, new Date(Calendar.getInstance().getTimeInMillis())),
				new Persona("Enojadin", 12, new Date(Calendar.getInstance().getTimeInMillis())));
		
		personas.forEach(persona -> System.out.println(persona));	
		Collections.sort(personas, (p1, p2) -> p1.getAge().compareTo(p2.getAge()));
		
		System.out.println();
		System.out.println("Ordenando por edad");
		
		personas.forEach(persona -> System.out.println(persona));	
		
	}

}
