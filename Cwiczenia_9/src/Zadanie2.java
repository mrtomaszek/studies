
public class Zadanie2 {
		
			public static int kajak(char tab[][]){
				char [] tmp = new char[tab.length];
				for(int i = 0; i < tab.length; i++)
					for (int j = 0; j < tab[i].length; j++)
						if (i == j)
							for (int z = 0; z < tmp.length; z++)
								tmp[z] = tab[i][j];
				String chara = tmp.toString();
				
							
			}
}
