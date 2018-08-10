package zadanie2;
import java.time.LocalDate;
import java.time.Month;

public class Pojazd {
	
	private String mark;
	private String model;
	private int prodDate;
	private int dayOfMonth;
	private int month;
	private int year;
	static LocalDate regDate;
	public Pojazd(String mark, String model, int prodDate, int year, int month, int dayOfMonth) {
		this.mark = mark;
		this.model = model;
		this.prodDate = prodDate;
		this.regDate = LocalDate.of(year, month, dayOfMonth);
	}
	
	
	public String toString() {
		return "Marka: " + mark + ", Model: " + model + ", Rok produkcji: " + prodDate + ", Data rejestracji: " + regDate;
	}
	
}
