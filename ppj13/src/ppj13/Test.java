package ppj13;

public class Test {
	
	public static void main(String[] args){
		Osoba[] osoby = new Osoba[5];
		
		Przedmiot[] przedmioty = new Przedmiot[3];
		przedmioty[0] = new Przedmiot("Matematyka", true);
		przedmioty[1] = new Przedmiot("Programowanie", true);
		przedmioty[2] = new Przedmiot("WSI", true);
		
		Przedmiot[] przedmioty1 = new Przedmiot[3];
		przedmioty[0] = new Przedmiot("Matematyka", true);
		przedmioty[1] = new Przedmiot("Programowanie", false);
		przedmioty[2] = new Przedmiot("WSI", true);
		
		
		
		osoby[0] = new Student("Tomasz", 1990, 12345, 3, przedmioty);
		osoby[1] = new Student("Kamil", 1995, 12346, 4, przedmioty1);
		osoby[2] = new Absolwent("Jan", 1993, 12347, 5, przedmioty);
		osoby[3] = new Student("Maciej", 1994, 12348, 1, przedmioty);
		osoby[4] = new Absolwent("Patryk", 1997, 12349, 2, przedmioty);
		
		System.out.println(osoby[1]);
		System.out.println(osoby[2]);
		
		Student sss = new Student("Tomasz", 1990, 12345, 3, przedmioty);
		
		try{
		Absolwent aaa = sss.obrona();
		System.out.println(aaa.toString());
		}
		catch (ITNException e){
			System.out.println(e);
		}
	}
}
