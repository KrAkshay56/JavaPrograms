package arrayPrograms;

import java.time.LocalDate;
import java.time.Period;

public class AgeConverter {
	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		LocalDate birthDay=LocalDate.of(1998, 4, 5);
		int year = Period.between(birthDay, today).getYears();
		System.out.println(year);
	}

}
