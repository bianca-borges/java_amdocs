package date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time_Add_Subtract {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now().minusHours(5);
		System.out.println(t1);
		LocalTime t2 = LocalTime.now().plusMinutes(12);
		System.out.println(t2);
		LocalTime t3 = LocalTime.now().plus(1, ChronoUnit.DECADES);
		System.out.println(t3);
		
	}

}
