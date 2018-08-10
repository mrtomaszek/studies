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
	
	public String getResult(){           //- zwracaj�c� wynik konkatenacji
		return result;
	}
	
	public TaskState getState(){  // - zwracaj�c� stan zadania
		return state;		
	}
	
	Thread thread;
	public void start(){   // - uruchamiaj�c� zadanie w odr�bnym watku
		thread = new Thread(this);
		thread.start();
		this.state = TaskState.RUNNING;
	}
	public void abort(){  // - przerywaj�c� wykonanie kodu zadania i dzia�anie w�tku
		this.flag = false;
		thread.interrupt();
	}
	public boolean isDone(){  // - zwracaj�c� true, je�li wykonanie zadania si� zako�czy�o normalnie lub przez przerwanie, false w przeciwnym razie
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
