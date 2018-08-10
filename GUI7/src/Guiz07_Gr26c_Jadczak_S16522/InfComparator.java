package Guiz07_Gr26c_Jadczak_S16522;

import java.util.Comparator;

public class InfComparator implements Comparator<Informatyk> {

	
	@Override
	public int compare(Informatyk o1, Informatyk o2) {
		int result = o1.getStaz() > o2.getStaz() ? 1 : o1.getName().equals(o2.getName()) ? o1.getId() > o2.getId() ? 1 : 0 : 0;
		return result;
	}
	public int compare(Administrator o1, Administrator o2) {
		int result = o1.getStaz() > o2.getStaz() ? 1 : o1.getName().equals(o2.getName()) ? o1.getArch().equals(o2.getArch()) ? 0 : 1 : 1;
		return result;
	}
	
	public int compare(Kierownik o1, Kierownik o2) {
		int result = o1.getStaz() > o2.getStaz() ? 1 : o1.getName().equals(o2.getName()) ? o1.getProj() > o2.getProj() ? 1 : 0 : 0;
		return result;
	}
}
