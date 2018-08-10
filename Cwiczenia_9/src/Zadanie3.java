
public class Zadanie3 {

		public static boolean isTrue(int [][] tab){
			for (int i = 0; i < tab.length; i++ )
				if (tab.length != tab[i].length)
					return false;
			
			for (int i = 0; i < tab.length; i++)
				for (int j = 0; j < tab[i].length; j++)
					if (i != j){
						if (tab[i][j] != 0)	
							return false;}						
			for (int i = 0; i < tab.length; i++)
				for (int j = 0; j < tab[i].length; j++)
					if (i == j)
						if (tab[i][j] == 0)
						return false;

			return true;
		}
		public static void main(String[] args){
					
			int[][] testTab = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
			System.out.println(isTrue(testTab));
		}
}
