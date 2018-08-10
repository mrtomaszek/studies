package Guiz07_Gr26c_Jadczak_S16522;

import java.util.Arrays;

public class kolokwiumTest {
	
	public static void main (String[] args){
		
		Informatyk info[] = {
				new Informatyk("Stefan", 13),
				new Informatyk("Marian", 10),
				new Informatyk("Andrzej", 17),
				new Informatyk("Tomasz", 3),
				new Informatyk("Maciej", 7)
		};
		
		Administrator admin[] = {
				new Administrator("Stefan", 5, "SNA"),
				new Administrator("Mariusz", 1, "DNA"),
				new Administrator("Antoni", 7, "TCPIP"),
				new Administrator("Krzysztof", 11, "TCPIP"),
				new Administrator("Maciej", 17, "SNA")
		};
		
		Kierownik kier[] = {
				new Kierownik("Szymek", 33, 13),
				new Kierownik("Mateusz", 4, 1),
				new Kierownik("Arek", 7, 2),
				new Kierownik("Krzysztof", 13, 4),
				new Kierownik("Patryk", 17, 21)
		};
		
		Informatyk miks[] = {
				new Informatyk("Stefan", 13),
				new Administrator("Mariusz", 1, "DNA"),
				new Administrator("Antoni", 7, "TCPIP"),
				new Informatyk("Tomasz", 3),
				new Informatyk("Maciej", 7),
				new Kierownik("Krzysztof", 13, 4),
				new Kierownik("Patryk", 17, 21)
		};
		
		Arrays.sort(info, new InfComparator());
		Arrays.sort(admin, new InfComparator());
		Arrays.sort(kier, new InfComparator());
		Arrays.sort(miks, new InfComparator());
		
		for (Informatyk k : info){
			System.out.println(k.toString());
		}
		System.out.println("----------");
		
		for (Administrator k : admin){
			System.out.println(k.toString());
		}
		System.out.println("----------");
		
		for (Kierownik k : kier){
			System.out.println(k.toString());
		}
		System.out.println("----------");
		
		for (Informatyk k : miks){
			System.out.println(k.toString());
		}
		System.out.println("----------");
		
		
	}
}
