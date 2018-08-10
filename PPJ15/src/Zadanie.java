import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie {
	
	public static void main (String [] args){
		
		String date1 = "1999-01144-13";
		String date2 = "191-12-1";
		Pattern date = Pattern.compile("\\d{4}-\\d{1,2}-\\d{1,2}");
		Matcher dateMatch1 = date.matcher(date1);
		Matcher dateMatch2 = date.matcher(date2);
		System.out.println(dateMatch1.matches());
		System.out.println(dateMatch2.matches());
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Podaj adres e-mail: ");
		String mail1 = sc.nextLine();
		
		
		Pattern mail = Pattern.compile("\\w+(\\.\\w+)*@\\w+(\\.\\w+)*");  
		Matcher mailMatch1 = mail.matcher(mail1);
		System.out.println(mailMatch1.matches());
		*/
		
		
		StringBuilder logi = new StringBuilder();
		FileInputStream inputFileStream = null;
		try {
			inputFileStream = new FileInputStream("serverLog.txt");
			int nextByte;
			while ((nextByte = inputFileStream.read()) != -1){
				logi.append((char)nextByte);
			}
			
		
			
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
		
		Pattern ipPattern = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");
		Matcher ipMatch = ipPattern.matcher(logi);
		int i = 1;
		while (ipMatch.find()) {
			
			System.out.println(i + "\t" + Integer.toHexString(Integer.parseInt(ipMatch.group(1))) +"." +
					Integer.toHexString(Integer.parseInt(ipMatch.group(2))) +"." +
					Integer.toHexString(Integer.parseInt(ipMatch.group(3))) +"." +
					Integer.toHexString(Integer.parseInt(ipMatch.group(4))));
			i++;
		}
	}

}
