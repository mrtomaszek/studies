package Zadanie20;

import javax.swing.AbstractListModel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyModel extends AbstractListModel<String>{
	
	private static final long serialVersionUID = 1L;
	
	static Calendar calendar = Calendar.getInstance();
	
	String [] days = new String[calendar.getActualMaximum(calendar.DAY_OF_MONTH)];
	
	public MyModel(){
		for(int i = 0; i < days.length; i++) {
			days[i] = i+1 +" - " + dayName(i);
		}
	}
	
	public String dayName(int day) {
		calendar.set(2018, 6, 1);
		Date dateDay = (new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), day +1)).getTime();
		String dateName = new SimpleDateFormat("EEEE", new Locale("pl")).format(dateDay);
		return dateName;
	}
	
	
	public String getMonth() {
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		return month+"."+year;
	}
	
	
	@Override
	public String getElementAt(int x) {
		
		return days[x];
	}

	@Override
	public int getSize() {
		return days.length;
	}
	
	
	
	
}
