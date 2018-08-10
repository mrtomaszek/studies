package Zadanie11;

public class Zad11Test {

	public static void main(String[] args) {
		
		Buffer b = new Buffer();
		Producer p1 = new Producer(b);
        Consumer c1 = new Consumer(b);
        Thread pt1 = new Thread(p1);
        Thread ct1 = new Thread(c1);
        Thread countdown = new Thread();
        pt1.start();
        ct1.start();
        countdown.start();
        	try {
        		Thread.sleep(15000);
        		p1.abort();
        		c1.abort();
        		System.out.println("Program skoñczy³ dzia³anie");
        	}
        	catch (InterruptedException e) {
        		
        	}
        
		
	}

}
