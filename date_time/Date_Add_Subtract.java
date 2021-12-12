package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date_Add_Subtract {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now().plusMonths(3);
		LocalDate d3 = LocalDate.now().minus(10, ChronoUnit.CENTURIES);
		LocalDate d2 = LocalDate.now().minusMonths(3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

	}

}
