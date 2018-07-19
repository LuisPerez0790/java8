package biFunction;

public class Empleado {
	
	private String name;
	private Double salario;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Empleado(String name, Double salario) {
		super();
		this.name = name;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [name=" + name + ", salario=" + salario + "]";
	}
	
	
	
	
	

}
