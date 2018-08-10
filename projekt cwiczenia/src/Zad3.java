
public class Zad3 {

	public static void main(String[] args) {
		int [][] tab = {
				{1, 0, 0, 0, 0},
				{0, 1, 0, 0},
				{0, 0, 1}
		};
		int [] tab1 = new int[12];
		int x = 0;
		for (int i = 0; i <tab.length; i++)
			for (int j = 0; j < tab[i].length; j++ )
				tab1[x++] = tab[i][j];
		for (int i = 0; i<tab1.length; i++)
			System.out.print(tab1[i] + " ");
	

	}

}
