
public class Zadanie4 {

		public static int nmd(int x, int y){
			while (x != y) {
				if (x > y)
				x -= y;
				else
				y -= x;
				}
				return x;
		}
		
		public static void main (String[] args)	{
			for(int i = 0; i <10; i++)
		{int x = (int)(Math.random()*100);
		int y = (int)(Math.random()*100);
		System.out.println(x + " " + y);
		System.out.println((x*y)/nmd(x, y));}
		}
		
}
