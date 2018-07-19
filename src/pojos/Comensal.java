package pojos;

public class Comensal {
	
	private String name;
	private int age;
	private int mesa;
	
	
	public Comensal(String name, int age, int mesa) {
		super();
		this.name = name;
		this.age = age;
		this.mesa = mesa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	
	

}
