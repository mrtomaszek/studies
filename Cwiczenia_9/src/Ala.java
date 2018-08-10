
public class Ala {
		
		public static void main(String[] args){
			String s = "Ala ma kota";
			System.out.println(s.charAt(3) + " " + s.charAt(5));
						
			System.out.println(s.indexOf(" ", 0));
			
			int z = 0;
			for(int i = 0; i < s.length(); i++){
				int k = s.indexOf(" ", z);
					System.out.println(s.substring(z, k));
					
			}
		}
}
