import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Employe emp = new Employe();
		emp.setId(1l);
		emp.setName("shubham");
		emp.setPosition("devloper");
		emp.setSalary(35000);

		Employe emp1 = new Employe();
		emp1.setId(2l);
		emp1.setName("pratik");
		emp1.setPosition("devloper");
		emp1.setSalary(85000);

		Employe emp3 = new Employe();
		emp3.setId(3l);
		emp3.setName("amit");
		emp3.setPosition("devloper");
		emp3.setSalary(15000);

		Employe emp4 = new Employe();
		emp4.setId(4l);
		emp4.setName("akash");
		emp4.setPosition("devloper");
		emp4.setSalary(24000);

		Employe emp5 = new Employe();
		emp5.setId(5l);
		emp5.setName("pancher");
		emp5.setPosition("devloper");
		emp5.setSalary(25000);

		List<Employe> e = new ArrayList<Employe>();
		e.add(emp);
		e.add(emp1);
		e.add(emp3);
		e.add(emp4);
		e.add(emp5);
		for (Employe q : e) {
			if (q.getSalary() >= 25000) {
				System.out.println(q);
			}
		}

	}
}
