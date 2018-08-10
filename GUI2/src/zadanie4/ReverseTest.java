package zadanie4;

public class ReverseTest {
	 public static void main(String[] args) {
	        
         Reversible[] revers = new Reversible[] {
             new ReversibleString("Kot2018"),
             new ReversibleInt(2),
             new ReversibleInt(3),
             new ReversibleString("Pies"),
             new ReversibleString("Ala ma kota i psa"),
             new ReversibleInt(10)
         };

         System.out.println("Normalne:");
         for (Reversible r : revers) {
           System.out.println(r);
         }

         for (Reversible r : revers) {
           r.reverse();
         }

         System.out.println("Odwr�cone:");
         for (Reversible r : revers) {
           System.out.println(r);
         }

         System.out.println("Przywr�cone i zmienione:");
         for (Reversible r : revers) {
        	 r.reverse();
        	 r.change();
        	 System.out.println(r);
        	 
         }
       }
}
