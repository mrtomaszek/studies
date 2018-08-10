
public class ZbiorMetod {

	public static void main(String[] args) {
		ZbiorMetod m;
		m = new ZbiorMetod();
		m.ustalWartosc(1);
		m.ustalWartosc(2.3f);
		m.ustalWartosc('a');
		m.ustalWartosc((byte)0);
		

	}


public void ustalWartosc (int x) {
	System.out.println("Int " + x);
}
public void ustalWartosc (float x){
	System.out.println("Float " + x);
}
}