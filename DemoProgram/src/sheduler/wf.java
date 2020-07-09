package sheduler;

import java.time.LocalDate;
import java.util.Date;

public class wf {
public static void main(String[] args) {
	Date date=new Date();
	Date findDate = new Date(LocalDate.now().plusDays(7).toString().replace("-", "/"));
	System.out.println(date);
	System.out.println(findDate);
}
}
