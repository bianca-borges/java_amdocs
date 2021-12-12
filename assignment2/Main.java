package assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		String input = scan.nextLine();
		String[] info = input.split(",");
		
		Employee emp;
		
		if(info.length == 4) {
			employeeId = info[0];
			employeeName = info[1];
			departament = info[2];
			monthlySalary = Double.parseDouble(info[3]);
		} else if(info.length == 5) {
			employeeId = info[0];
			employeeName = info[1];
			departament = info[2];
			contractPeriod = Integer.parseInt(info[3]);
			contractAmount = Double.parseDouble(info[4]);
		}

	}

}
