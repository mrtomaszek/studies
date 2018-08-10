
public class Zadanie1 {
			public static void kwadratXO(int side){
				char wrt1 = 'x';
				char wrt2 = 'o';
				for(int i = 0; i < side; i++){
					if (side%2==0){
					for (int j = 0; j < side; j ++){
						if (j == 0 || j%2 == 0)
							System.out.print(wrt1);
						else
							System.out.print(wrt2);
					}
						System.out.println();
					}
					else if (side%2 != 0){
						if (i==0 || i%2==0){
						for (int j = 0; j < side; j ++){
							if (j == 0 || j%2 == 0)
								System.out.print(wrt1);
							else
								System.out.print(wrt2);
						}
							System.out.println();
						}
						else if (i==1 || i%2 != 0){
							for (int j = 0; j < side; j ++){
							if (j == 0 || j%2 == 0)
								System.out.print(wrt2);
							else
								System.out.print(wrt1);
						}
							System.out.println();
						}
					}
				}
			}
			public static void main(String[] args){
				kwadratXO(4);
				kwadratXO(5);
				
			}
}
