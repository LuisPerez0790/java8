package streams;

import java.util.Arrays;
import java.util.List;

public class Empleado {

	private Long id;
	private String nombre;
	private Double ingresos;
	private Genero genero;
	private int edad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getIngresos() {
		return ingresos;
	}

	public void setIngresos(Double ingresos) {
		this.ingresos = ingresos;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean esHombre(){
		return genero.equals(Genero.HOMBRE);
	}
	
	public boolean esMujer(){
		return genero.equals(Genero.MUJER);
	}

	public static enum Genero {
		HOMBRE, MUJER
	}

	public Empleado(Long id, String nombre, Double ingresos, Genero genero, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ingresos = ingresos;
		this.genero = genero;
		this.edad = edad;
	}

	public static List<Empleado> empleados() {
		Empleado emp1 = new Empleado(1L, "luis", 30000D, Genero.HOMBRE, 27);
		Empleado emp2 = new Empleado(2L, "juan", 20000D, Genero.HOMBRE, 20);
		Empleado emp3 = new Empleado(3L, "pedro", 5000D, Genero.HOMBRE, 31);
		Empleado emp4 = new Empleado(4L, "adriana", 3000D, Genero.MUJER, 19);
		Empleado emp5 = new Empleado(5L, "alejandra", 60000D, Genero.MUJER, 53);
		Empleado emp6 = new Empleado(6L, "ana karen", 99999D, Genero.MUJER, 32);
		Empleado emp7 = new Empleado(7L, "julio", 23000D, Genero.HOMBRE, 28);
		Empleado emp8 = new Empleado(8L, "vegeta", 25000D, Genero.HOMBRE, 17);
		Empleado emp9 = new Empleado(9L, "jose", 20000D, Genero.HOMBRE, 44);
		Empleado emp10 = new Empleado(10L, "amanda", 30000D, Genero.MUJER, 23);
		Empleado emp11 = new Empleado(11L, "sofia", 20000D, Genero.MUJER, 26);
		Empleado emp12 = new Empleado(12L, "franscisco", 30000D, Genero.HOMBRE, 35);
		Empleado emp13 = new Empleado(13L, "roberto", 30000D, Genero.HOMBRE, 37);
		Empleado emp14 = new Empleado(14L, "gohan", 30000D, Genero.HOMBRE, 67);
		Empleado emp15 = new Empleado(15L, "trunks", 30000D, Genero.HOMBRE, 81);
		Empleado emp16 = new Empleado(16L, "milk", 30000D, Genero.MUJER, 13);
		Empleado emp17 = new Empleado(17L, "bulma", 25000D, Genero.MUJER, 55);
		Empleado emp18 = new Empleado(18L, "giren", 30000D, Genero.HOMBRE, 65);
		Empleado emp19 = new Empleado(19L, "toppo", 23000D, Genero.HOMBRE, 27);
		Empleado emp20 = new Empleado(20L, "bills", 30000D, Genero.HOMBRE, 23);
		Empleado emp21 = new Empleado(21L, "wiss", 25000D, Genero.HOMBRE, 28);
		Empleado emp22 = new Empleado(22L, "boo", 5000D, Genero.HOMBRE, 28);
		Empleado emp23 = new Empleado(23L, "kefla", 25000D, Genero.MUJER, 43);
		Empleado emp24 = new Empleado(24L, "kyabe", 20000D, Genero.HOMBRE, 22);
		Empleado emp25 = new Empleado(25L, "dante", 60000D, Genero.HOMBRE, 18);
		Empleado emp26 = new Empleado(26L, "vergil", 20000D, Genero.HOMBRE, 20);
		Empleado emp27 = new Empleado(27L, "trish", 30000D, Genero.MUJER, 31);
		Empleado emp28 = new Empleado(28L, "andrea", 25000D, Genero.MUJER, 30);
		Empleado emp29 = new Empleado(29L, "carlos", 30000D, Genero.HOMBRE, 20);
		Empleado emp30 = new Empleado(30L, "karla", 60000D, Genero.MUJER, 30);

		List<Empleado> empleados = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11,
				emp12, emp13, emp14, emp15, emp16, emp16, emp17, emp18, emp19, emp19, emp20, emp21, emp22, emp23, emp24,
				emp24, emp25, emp26, emp27, emp28, emp29, emp30);

		return empleados;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", ingresos=" + ingresos + ", genero=" + genero + ", edad="
				+ edad + "]";
	}
	
	

}
