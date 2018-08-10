package kwiaciarnia;

public class FloristsTest {
	  
	// definicja metody sumowania warto�ci kwiat�w o podanym kolorze 
  static int valueOf(Box box, String color) {	  
	  return (int)box.getValueByColour(color);
	  
  }

  public static void main(String[] args) {
    
		// Kwiaciarnia samoobs�ugowa
    		
		// ustalenie cennika
	PriceList pl = PriceList.getInstance();
 
    	pl.put("r�a", 8.0, 5, 7.0);	// r�a kosztuje 8 z�/sztuka je�li klient kupi nie wi�cej ni� 5 sztuk, 
    					// w innym przypadku kosztuje 7 z�/stuk�
 
    	pl.put("bez", 12.0);		// bez kosztuje 12 z�/sztuka niezale�nie od ilo�ci
 
    	pl.put("piwonia", 8.0);		// piwonia kosztuje 8 z�/sztuka niezale�nie od ilo�ci

    		// Przychodzi klient Janek. Ma 200 z�
    	Customer janek = new Customer("Janek", 200);

    		// Bierze r�ne kwiaty: 5 r�, 5 piwonii, 3 frezje, 3 bzy
    	janek.get(new Rose(5));
    	janek.get(new Peony(5));
    	janek.get(new Freesia(3));
    	janek.get(new Lilac(3));
    	
    		// Pewnie je umie�ci� na w�zku sklepowym
    		// Zobaczmy co tam ma
    	ShoppingCart wozekJanka = janek.getShoppingCart();
    	
    	System.out.println("Przed p�aceniem " + wozekJanka);
    	
    		// Teraz za to zap�aci...
    	janek.pay(true);	// true = p�aci got�wk�, bez prowizji

    		// Czy przypadkiem przy p�aceniu nie okaza�o si�,
    		// �e w koszu s� kwiaty na kt�re nie ustalono jeszcze ceny?
    		// W takim razie zosta�yby usuni�te z w�zka i Janek nie p�aci�by za nie
    		// R�wnie� mo�e mu zabrakn�� pieni�dzy, wtedy te� kwiaty s� odk�adane.
    	System.out.println("Po zap�aceniu " + janek.getShoppingCart());

    		// Ile Jankowi zosta�o pieni�dzy? 
    	System.out.println("Jankowi zosta�o : " + janek.getCash() + " z�");

    		// Teraz jako� zapakuje kwiaty (mo�e do pude�ka)
    	Box pudelkoJanka = new Box(janek);
    	janek.pack(pudelkoJanka);

    		// Co jest teraz w w�zku Janka...
    		// (nie powinno ju� nic by�)
    	System.out.println("Po zapakowaniu do pude�ka " + janek.getShoppingCart());

    		// a co w pude�ku
    	System.out.println(pudelkoJanka);

    		// Zobaczmy jaka jest warto�� czerwonych kwiat�w w pude�ku Janka
    	System.out.println("Czerwone kwiaty w pude�ku Janka kosztowa�y: "
        	+ valueOf(pudelkoJanka, "czerwony"));

    
		// Teraz przychodzi Stefan
    		// ma tylko 60 z�
    	Customer stefan = new Customer("Stefan", 60);

    		// Ale nabra� kwiat�w nieco za du�o jak na t� sum�
    	stefan.get(new Rose(6));
    	stefan.get(new Lilac(3));
    
    		// co ma w w�zku
    	System.out.println(stefan.getShoppingCart());

    		// p�aci i pakuje do pude�ka
    	stefan.pay(false);	// false = p�aci kart� p�atnicz�, prowizja = 1%
    	Box pudelkoStefana = new Box(stefan);
    	stefan.pack(pudelkoStefana);

    		// co ostatecznie uda�o mu si� kupi�
    	System.out.println(pudelkoStefana);
    		// ... i ile zosta�o mu pieni�dzy
    	System.out.println("Stefanowi zosta�o : " + stefan.getCash() + " z�");
   }
}