package streams;

public class Estudiante {
	
	private String name;
	private String lastName;
	private int age;
	private String address;
	
	public Estudiante(String name, String lastName, int age, String address) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Estudiante [name=" + name + ", lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}
	
	

	

}
