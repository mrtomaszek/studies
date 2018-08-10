package zadanie2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Samochod extends Pojazd{
	private int dayOfMonth;
	private int month;
	private int year;
	private LocalDate inspectionDate ;
	private LocalDate insuranceValidDate;
	
	public Samochod(String mark, String model, int prodDate, int year, int month, int dayOfMonth) {
		super(mark, model, prodDate, year, month, dayOfMonth);
		
	}

	public void setInspectionDate(int year, int month, int dayOfMonth) {
		this.inspectionDate = LocalDate.of(year, month, dayOfMonth);
	}

	public void setInsuranceValidDate(int year, int month, int dayOfMonth) {
		this.insuranceValidDate = LocalDate.of(year, month, dayOfMonth);
	}
	
	public void checkInspection() {
		LocalDate localDate = LocalDate.now();
		long days = ChronoUnit.DAYS.between(inspectionDate, localDate);
		if (days < 365) {
			System.out.println("Przeglad wazny");
		}
		else {
			System.out.println("Przeglad niewazny");
		}
	}
	public void checkInsuranceValidity() {
		LocalDate localDate = LocalDate.now();
		if(localDate.compareTo(insuranceValidDate) <= 0) {
			System.out.println("Ubezpieczenie wazne");
		}
		else {
			System.out.println("Ubezpieczenie niewazne");
		}
	}
	
	public String toString() {
		return super.toString() + ", Data przegladu: " + inspectionDate + ", Data waznosci ubezpieczenia: " + insuranceValidDate;
	}
	
}
