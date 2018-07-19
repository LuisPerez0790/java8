package biPredicate;

public class Empleado {
	
	private String nombre;
	private int edad;
	private Double salario;
	private String departamento;
	
	
	public Empleado(String nombre, int edad, Double salario, String departamento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", departamento="
				+ departamento + "]";
	}
	
	

}
