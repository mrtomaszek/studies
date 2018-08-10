import java.util.Random; 
public class Zadanie2 {
		
		public static void main(String[] args) {
			String str = "kajak";
			int strLength = str.length();
			char[] strArray = str.toCharArray();
			/*char[][] array = new char[30][30];
			Random r = new Random();
			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array.length; j++) {
			     array[i][j] = (char)(r.nextInt(26) +97);
			     if (i == j)
			     System.out.print(array[i][j]);
			     else 
			     System.out.print(" ");
			     }
				System.out.println();
			}
			*/
			char[][] array = {
					  { 'k', 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					  { 0, 'a', 0, 0, 0, 0, 0, 0, 0, 0 },
					  { 0, 0, 'j', 0, 0, 0, 0, 0, 0, 0 },
					  { 0, 0, 0, 'a', 0, 0, 0, 0, 0, 0 },
					  { 0, 0, 0, 0, 'k', 0, 0, 0, 0, 0 },
					  { 0, 0, 0, 0, 0, 'a', 0, 0, 0, 0 },
					  { 0, 0, 0, 0, 0, 0, 'j', 0, 0, 0 },
					  { 0, 0, 0, 0, 0, 0, 0, 'a', 0, 0 },
					  { 0, 0, 0, 0, 0, 0, 0, 0, 'k', 0 },
					  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 'a' }
					};
			int count = 0;
			int k = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = i; j < array[i].length; j++) {
					while (array[i][j] == str.charAt(k))
						if	(k < strLength)
							k++;	        
		                }
		                count = count + 1;
		            		}
		            
		        }
			
			
	}

