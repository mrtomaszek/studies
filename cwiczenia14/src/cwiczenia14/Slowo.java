package cwiczenia14;

public class Slowo {
	
	public String word;
	
	public Slowo(String word1){
		word = word1;
	}
	
	public static void stringTest(){
		long startTime = System.currentTimeMillis();
		String word = new String();
		for (int i = 0; i<10000; i++)
			word += 'a';
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("czas: " + time);
	}
	
	public static void stringBuilderTest(){
		long startTime = System.currentTimeMillis();
		StringBuilder word = new StringBuilder();
		for (int i = 0; i<10000; i++)
			word.append('a');
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("czas: " + time);
	
	
    }
}

