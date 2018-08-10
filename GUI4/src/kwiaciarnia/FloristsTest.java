package kwiaciarnia;

public class FloristsTest {
	  
	// definicja metody sumowania wartoœci kwiatów o podanym kolorze 
  static int valueOf(Box box, String color) {	  
	  return (int)box.getValueByColour(color);
	  
  }

  public static void main(String[] args) {
    
		// Kwiaciarnia samoobs³ugowa
    		
		// ustalenie cennika
	PriceList pl = PriceList.getInstance();
 
    	pl.put("ró¿a", 8.0, 5, 7.0);	// ró¿a kosztuje 8 z³/sztuka jeœli klient kupi nie wiêcej ni¿ 5 sztuk, 
    					// w innym przypadku kosztuje 7 z³/stukê
 
    	pl.put("bez", 12.0);		// bez kosztuje 12 z³/sztuka niezale¿nie od iloœci
 
    	pl.put("piwonia", 8.0);		// piwonia kosztuje 8 z³/sztuka niezale¿nie od iloœci

    		// Przychodzi klient Janek. Ma 200 z³
    	Customer janek = new Customer("Janek", 200);

    		// Bierze ró¿ne kwiaty: 5 ró¿, 5 piwonii, 3 frezje, 3 bzy
    	janek.get(new Rose(5));
    	janek.get(new Peony(5));
    	janek.get(new Freesia(3));
    	janek.get(new Lilac(3));
    	
    		// Pewnie je umieœci³ na wózku sklepowym
    		// Zobaczmy co tam ma
    	ShoppingCart wozekJanka = janek.getShoppingCart();
    	
    	System.out.println("Przed p³aceniem " + wozekJanka);
    	
    		// Teraz za to zap³aci...
    	janek.pay(true);	// true = p³aci gotówk¹, bez prowizji

    		// Czy przypadkiem przy p³aceniu nie okaza³o siê,
    		// ¿e w koszu s¹ kwiaty na które nie ustalono jeszcze ceny?
    		// W takim razie zosta³yby usuniête z wózka i Janek nie p³aci³by za nie
    		// Równie¿ mo¿e mu zabrakn¹æ pieniêdzy, wtedy te¿ kwiaty s¹ odk³adane.
    	System.out.println("Po zap³aceniu " + janek.getShoppingCart());

    		// Ile Jankowi zosta³o pieniêdzy? 
    	System.out.println("Jankowi zosta³o : " + janek.getCash() + " z³");

    		// Teraz jakoœ zapakuje kwiaty (mo¿e do pude³ka)
    	Box pudelkoJanka = new Box(janek);
    	janek.pack(pudelkoJanka);

    		// Co jest teraz w wózku Janka...
    		// (nie powinno ju¿ nic byæ)
    	System.out.println("Po zapakowaniu do pude³ka " + janek.getShoppingCart());

    		// a co w pude³ku
    	System.out.println(pudelkoJanka);

    		// Zobaczmy jaka jest wartoœæ czerwonych kwiatów w pude³ku Janka
    	System.out.println("Czerwone kwiaty w pude³ku Janka kosztowa³y: "
        	+ valueOf(pudelkoJanka, "czerwony"));

    
		// Teraz przychodzi Stefan
    		// ma tylko 60 z³
    	Customer stefan = new Customer("Stefan", 60);

    		// Ale nabra³ kwiatów nieco za du¿o jak na tê sumê
    	stefan.get(new Rose(6));
    	stefan.get(new Lilac(3));
    
    		// co ma w wózku
    	System.out.println(stefan.getShoppingCart());

    		// p³aci i pakuje do pude³ka
    	stefan.pay(false);	// false = p³aci kart¹ p³atnicz¹, prowizja = 1%
    	Box pudelkoStefana = new Box(stefan);
    	stefan.pack(pudelkoStefana);

    		// co ostatecznie uda³o mu siê kupiæ
    	System.out.println(pudelkoStefana);
    		// ... i ile zosta³o mu pieniêdzy
    	System.out.println("Stefanowi zosta³o : " + stefan.getCash() + " z³");
   }
}