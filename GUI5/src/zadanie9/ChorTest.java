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
      /*<- tu trzeba zapisa�
         fragment, kt�ry ko�czy dzia�anie kod�w, wypisuj�cych znaki 
      */
      System.out.println("\nProgram sko�czy� dzia�anie");
    }

  }