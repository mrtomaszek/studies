package zadanie9;

public class ChorTest {

    public static void main(String[] args) throws InterruptedException {
      Chor chor = new Chor("ABC");
      for (Thread t : chor.getThreads()) System.out.println(t.getName());
	      
      for (Thread t : chor.getThreads()){
    	  t.start();
    	     	  
      }

      Thread.sleep(10000);
      
      for (Thread t : chor.getThreads()){
    	  t.interrupt();
    	  //((Spiewak) t).stopRunning();
    	  
      }
      /*<- tu trzeba zapisaæ
         fragment, który koñczy dzia³anie kodów, wypisuj¹cych znaki 
      */
      System.out.println("\nProgram skoñczy³ dzia³anie");
    }

  }