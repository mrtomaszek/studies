
public class Zad1 {

	public static void main(String[] args) {
		char [] tab = {'a', 'b', 'c', 'e', 'f'};
		for (int i = 0; i < tab.length; i++)
			if (i==0){
				int z = tab.length - 1;{
				System.out.println(tab[z] + " " + tab[i] + " " + tab[i+1]);}
			}
				else if (i == tab.length - 1) {
					System.out.println(tab[i-1] + " " + tab[i] + " " + tab[0]);
				}
				else
					System.out.println(tab[i-1] + " " + tab[i] + " " + tab[i +1]);
				

	}

}
