
public class ZProstokat {

	private int w, h;
	private char in, out;
	public static int p = 0, k = 0;
	//private int nr =0;
	private String desc;
	private String desc1;
	
	
	public ZProstokat(int w, char in, char out) {
		this.w = w;
		this.h = w;
		this.in = in;
		this.out = out;
		k++;
		this.k = k;
		this.desc = "Kwadrat(" + k + ") " + w + "x" + h +", " + out + " = " + (2*w+2*h-4) + ", " + in + " = " + ((w-2)*(h-2));
		
	}
	public ZProstokat(int w, int h, char in, char out) {
		this(w, in, out);
		this.h = h;
		if (w == h) {
			k++;
			this.k = k;
			this.desc = "Kwadrat(" + k + ") " + w + "x" + h +", " + out + " = " + (2*w+2*h-4) + ", " + in + " = " + ((w-2)*(h-2));
		}
		else
		p++;
		this.p = p;
		this.desc = "Prostokat(" + p + ") " + w + "x" + h +", " + out + " = " + (2*w+2*h-4) + ", " + in + " = " + ((w-2)*(h-2));
		this.desc1 = "Prostokat(" + p + ") " + w + "x" + h;
	}
	
	public void rysuj() throws ZProstokatException {
		if((h<1 || w<1) || ((h ==1 || w ==1) || in == out)) {
			System.out.println(desc1);
			throw new ZProstokatException();
		}
		else {
		System.out.println(desc);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if((i == 0) || (i == h-1) || (j == 0) || (j == w-1)) {
				System.out.print(out);
					}
				else {
					System.out.print(in);
					}
				}
			System.out.println();
			}
		}
		System.out.println();
	}
	
	
}
