package cwiczenia14;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testregex {

	public static void main(String[] args) throws IOException {

		String a = "bbaaaabbh";

		Pattern p = Pattern.compile("[abc]+h");
		Matcher m = p.matcher(a);
		m.find();
		System.out.println(m.group());

		String b = "wies w Polsce polozona w wojewodztwie wielkopolskim, w powiecie kolskim, w gminie Olszowka. W latach 1975-1998 miejscowosc polozona	byla w wojewodztwie koninskim.";
		Pattern z = Pattern.compile("[0-9][0-9]");
		Matcher x = z.matcher(b);
		int count = 0;
		while (x.find()) {
			count += 1;

		}
		System.out.println(count);
		
		Slowo word = new Slowo("witampana");
		
		word.stringTest();
		word.stringBuilderTest();
		StringBuilder rzecz = new StringBuilder();
		FileInputStream inputFileStream = null;
		try {
			inputFileStream = new FileInputStream("1.txt");
			int nextByte;
			while ((nextByte = inputFileStream.read()) != -1){
				rzecz.append((char)nextByte);
			}
			inputFileStream.close();
			
			System.out.println(rzecz);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (inputFileStream != null) {
				try {
					inputFileStream.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		Pattern q = Pattern.compile("[\\w]");
		Matcher r = q.matcher(rzecz);
		int counts = 0;
		while (r.find()) {
			counts += 1;

		}
		System.out.println(counts);
		
		System.out.println("==================");
		
		StringBuilder logi = new StringBuilder();
		String[][] tab = new String[100][3];
		
		FileInputStream inputStream = null;
		try {
		inputStream = new FileInputStream("serverLog.txt");
		int nextByt;
		while ((nextByt = inputStream.read()) != -1){
			logi.append((char)nextByt);
		}
		inputFileStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Pattern ip = Pattern.compile("[\\d\\d\\d][\\d\\d\\d][\\d\\d\\d][\\d\\d\\d]");
		Matcher ipMatch = ip.matcher(logi);
		
		for (int i = 0; i<tab.length; i++){
		    ipMatch.find();
			tab[i][0] = ipMatch.group();
		}
		
		
		
		
	}
}
	
	
		