package comparator;

import java.util.Date;

public class Persona {
	
	private String name;
	private Integer age;
	private Date birdDate;
	
	public Persona(String name, int age, Date birdDate) {
		super();
		this.name = name;
		this.age = age;
		this.birdDate = birdDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirdDate() {
		return birdDate;
	}
	public void setBirdDate(Date birdDate) {
		this.birdDate = birdDate;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", age=" + age + ", birdDate=" + birdDate + "]";
	}
	
	
	
	

}
