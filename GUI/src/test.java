
public class test {

	public static void main(String[] args) {
		
		ZProstokat test = new ZProstokat(1, 1, 'a', 'a');
		
		ZProstokat test1 = new ZProstokat(4, 'a', 'b');
		
		ZProstokat test2 = new ZProstokat(8, 5, 'a', 'b');
		
		try {
			test.rysuj();
			test1.rysuj();
			test2.rysuj();
		}
		catch (ZProstokatException e) {
            e.printStackTrace();
       }
		try {
			test1.rysuj();
			}
		catch (ZProstokatException e) {
            e.printStackTrace();
       }
		try {
			test2.rysuj();
		}
		catch (ZProstokatException e) {
            e.printStackTrace();
       }
	}

}
