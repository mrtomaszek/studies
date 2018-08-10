
public class Testowa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rakieta rakieta = new Rakieta("Saturn", 0);
		
		rakieta.zatankuj();
		try {
		rakieta.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		Drzewo [] las = new Drzewo[5];
		DzewoIglaste sosna = new DzewoIglaste(true, 24, "duzy", 400, 4.5);
		DrzewoLisciaste klon = new DrzewoLisciaste(false, 18, "sredni", 4);
		DzewoIglaste swierk = new DzewoIglaste(true, 26, "spory", 1400, 8.2);
		DrzewoOwocowe jablon = new DrzewoOwocowe(false, 14, "maly", 7, "jablko");
		DrzewoLisciaste wierzba = new DrzewoLisciaste(false, 17, "duzy", 6);
		las[0] = sosna;
		las[1] = klon;
		las[2] = swierk;
		las[3] = jablon;
		las[4] = wierzba;
		
		
		for (int i = 0; i < las.length; i++)
			System.out.println("Kolejne drzewo:\n " + las[i]);
		
		jablon.zerwijOwoc();
		swierk.zerwijOwoc();
	}

}
