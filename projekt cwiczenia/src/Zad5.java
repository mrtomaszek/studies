
public class Zad5 {

	public static void main(String[] args) {
		int x = 10;
		int z = 0;
		int a = 1;
		int[][] tab = new int [x][x];
		for(int i = 0; i<tab.length; i++){
			for(int j = 0; j<tab.length; j++){
				if (a<x){
				if (j>0 && j<x-a && i >0 && i < x-a)
			tab[i][j] = a;
			a++;}
			
				
										
				}
		}
		for (int i = 0; i<tab.length; i++){
			for (int j = 0; j<tab.length; j++)
			System.out.print(tab[i][j] + " ");
		System.out.println();
	}
	}

}
