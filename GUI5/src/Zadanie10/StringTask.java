package Zadanie10;

public class StringTask implements Runnable{
	
	private String tekst;
	private int liczba;
	private String sequence = "";
	private String result = "";
	private boolean flag = true;
	private TaskState state;
		
	public StringTask(String tekst, int liczba){
		this.tekst = tekst;
		this.liczba = liczba;
		this.state = TaskState.CREATED;
	}
	
	public String getResult(){           //- zwracaj¹c¹ wynik konkatenacji
		return result;
	}
	
	public TaskState getState(){  // - zwracaj¹c¹ stan zadania
		return state;		
	}
	
	Thread thread;
	public void start(){   // - uruchamiaj¹c¹ zadanie w odrêbnym watku
		thread = new Thread(this);
		thread.start();
		this.state = TaskState.RUNNING;
	}
	public void abort(){  // - przerywaj¹c¹ wykonanie kodu zadania i dzia³anie w¹tku
		this.flag = false;
		thread.interrupt();
	}
	public boolean isDone(){  // - zwracaj¹c¹ true, jeœli wykonanie zadania siê zakoñczy³o normalnie lub przez przerwanie, false w przeciwnym razie
		if(liczba == 0 || getState() == TaskState.ABORTED) {
			return true;
		}
		else
			return false;
	}
	public void reverse() {
		StringBuilder temp = new StringBuilder(tekst).reverse();
		sequence = temp.toString();
	}
	public void concat() {
		result += sequence;
	}
	
	@Override
	public void run() {
		try {
			
			// if (thread.isInterrupted())
		while(flag) {
			reverse();
				while(0 < liczba) {
					concat();
					liczba--;
				}
			this.state = TaskState.READY;
			abort();
			}
		}
		catch (Exception e) {
			
			this.state = TaskState.ABORTED;
			
		}
	}
	
	public String getTxt() {
		return sequence;
	}
	public enum TaskState{
		CREATED, RUNNING, ABORTED, READY;
	}
	
	
	

}
