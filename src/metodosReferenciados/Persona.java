package metodosReferenciados;

public class Persona {
	
	private String name;
	private Integer edad;
	private String email;
	
	public Persona(String name, Integer edad, String email) {
		super();
		this.name = name;
		this.edad = edad;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Persona [name=" + name + ", edad=" + edad + ", email=" + email + "]";
	}
	
}
