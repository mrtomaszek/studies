
public class Zad4 {

	public static void main(String[] args) {
		double[][] punkt = {
				{1},
				{0},
				{0}
		};
		double [][] odbicie = {
				{1, 0, 0},
				{0, -1, 0},
				{1, 0, 1}
		};
		double [][] rezultat = new double[odbicie.length][odbicie[0].length];
		for(int i = 0; i<odbicie.length; i++)
			for (int j = 0; j < odbicie.length; j++){
				rezultat[i][j] = punkt [i][0] * odbicie[i][j];
	}
		for(int i = 0; i<rezultat.length; i++)
			for (int j=0; j<rezultat[i].length; j++)
				System.out.println((int)rezultat[i][j] + " ");
		
}

}


