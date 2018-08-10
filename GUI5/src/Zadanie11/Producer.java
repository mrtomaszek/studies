package Zadanie11;

public class Producer implements Runnable{

	private Buffer b;
	private final int MAXCAP = 10;
	private boolean run = true;
		
	public Producer(Buffer b) {
		this.b = b;
	}
		
	@Override
	public void run() {
		try {
			while(run) {
				produce();
				System.out.println("Produkuje" + b.toString());
				Thread.sleep((long)(Math.random()*2000));
				}
			}
		catch (InterruptedException e) {
				}
	}
	
	private void produce() throws InterruptedException{
		synchronized(b) {
			while(b.getSize() == MAXCAP)
				b.wait();
			b.put((int)(Math.random()*100));
			b.notifyAll();
		}
	}
	
	public void abort() {
		this.run = false;
	}
		
}
