
public class Employe {
private Long id;
private String name;
private String position;
private int salary;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + "]";
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}

}
