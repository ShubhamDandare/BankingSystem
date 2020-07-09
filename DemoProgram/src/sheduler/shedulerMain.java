package sheduler;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class shedulerMain extends TimerTask {
Date currentdate;
int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		currentdate =new Date();
		System.out.println(currentdate);
		count++;
		if(count==2) {
			System.exit(0);
		}
	}
public static void main(String[] args) {
	Timer timer=new Timer();
	shedulerMain sm=new shedulerMain();
	timer.scheduleAtFixedRate(sm, 2020-06-22, 60000);
	
}
}
