public class Zad2 {

	public static void main(String[] args) {
		int [] tab;
		tab = new int [100];
		for (int i = 0; i < tab.length; i++){
			tab [i] = (int)(Math.random()*100);
		}
		
	    double sum = 0;
	    for (int i = 0; i < tab.length; i++) {
	        sum += tab[i];
	    }
	    int mean = (int) (sum/tab.length);
	    int count = 0;
	    for (int i = 0; i < tab.length; i++){
	    	  	if (tab[i] < mean)
	    		count = count +1;
	    }
	   int less = 100 - count;
	   int[] tab1 = new int [100 - less];
	   int[] tab2 = new int [less];
	   
	   int x=0;
	   int z=0;
	   for (int i = 0; i < 100; i++)
		   if (tab[i] < mean)
				   tab1[x++] = tab[i];
	   				
		   else
			   tab2[z++] = tab[i];
		   
		for (int i = 0; i < tab1.length; i++)
			System.out.print(tab1[i] + " ");
		System.out.println(x);
		for (int i = 0; i < tab2.length; i++)
			System.out.print(tab2[i] + " ");
	}
			
		
		
}


