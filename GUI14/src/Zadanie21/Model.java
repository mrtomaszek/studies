package Zadanie21;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;

public class Model extends AbstractListModel<String>{
private static final long serialVersionUID = 1L;
	
	private ArrayList<String> list = new ArrayList<String>();
	
	public Model(){
		
		}
	
	public boolean check(String s) {
		for(int i = 0; i < list.size(); i++) {
			if(s.equals(list.get(i))) {
				return false;
			}
		}
		return true;
	}
		
	
	
	public void addCity(String s) {
		if(check(s)) {
			list.add(s);
		}
	}
	
	public void sortList() {
		Collections.sort(list);
	}
	
	public void rmCity(String s) {
		for(int i = 0; i < list.size(); i++) {
			if(s.equals(list.get(i))){
				list.remove(i);
			}
		}
		
	}
	
	public void selected(ArrayList<String> s) {
			
		for(int i = 0; i < s.size(); i++) {
			System.out.println("Selected " + s.get(i));
		}
	}
	
	
	@Override
	public String getElementAt(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}


	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return list.size();
	}
	
	public void update() {
        this.fireContentsChanged(this, 0, list.size() - 1);
    }
	
}
