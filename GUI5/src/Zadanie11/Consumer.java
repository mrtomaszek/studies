package Zadanie11;

import java.util.LinkedList;

public class Consumer implements Runnable{
	private Buffer b;
	private LinkedList<Integer> consumed = new LinkedList<Integer>();
	private boolean run = true;
	
	public Consumer(Buffer b) {
		this.b = b;
	}
	@Override
	public void run() {
		
			try {
				while(run) {
				consume();
				System.out.println("Konsumuje" + " ----" + consumed.peekLast() + "----");
				Thread.sleep((long)(Math.random()*2000));
				
				}
			}
			catch (InterruptedException e) {
			}
		}
	private void consume() throws InterruptedException {
		synchronized(b) {
			while(b.getSize() == 0)
				b.wait();
			consumed.add(b.get());
			b.notifyAll();
		}
	}
	
	public void abort() {
		this.run = false;
	}

	
	
}
