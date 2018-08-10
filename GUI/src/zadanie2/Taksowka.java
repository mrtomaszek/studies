package zadanie2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Taksowka extends Samochod{
	
	private LocalDate taxValidityDate;
	
	public Taksowka(String mark, String model, int prodDate, int year, int month, int dayOfMonth) {
		super(mark, model, prodDate, year, month, dayOfMonth);
		
	}

	public void setTaxValidityDate(int year, int month, int dayOfMonth) {
		this.taxValidityDate = LocalDate.of(year, month, dayOfMonth);
	}
	public void checkTaxometer() {
		LocalDate localDate = LocalDate.now();
		long months = ChronoUnit.MONTHS.between(taxValidityDate, localDate);
		if (months > 6) {
			System.out.println("Taksometr wazny");
		}
		else {
			System.out.println("Taksometr niewazny");
		}
	}
	
	public String toString() {
		return super.toString() + " Wa¿noœc taksometru: " + taxValidityDate;
	}
	
	
}
