package zadanie2;

public class Zad2Test {

	public static void main(String[] args) {
		
		Samochod kia = new Samochod("Kia", "rio", 2006, 2006, 10, 11);
		
		kia.setInspectionDate(2011, 11, 7);
		kia.setInsuranceValidDate(2018, 12, 8);
		
		System.out.println(kia);
		kia.checkInspection();
		kia.checkInsuranceValidity();
		
		System.out.println();
		
		
		Taksowka taksa = new Taksowka("Toyota", "Avensis", 1999, 1999, 7, 11);
		taksa.setInspectionDate(2017, 11, 22);
		taksa.setInsuranceValidDate(2018, 6, 12);
		taksa.setTaxValidityDate(2018, 2, 14);
		
		System.out.println(taksa);
		taksa.checkInspection();
		taksa.checkInsuranceValidity();
		taksa.checkTaxometer();
	}

}
