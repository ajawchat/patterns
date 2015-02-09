package MVC;


public class Model extends java.util.Observable {
	
	private int cntr;
	
	// constructor
	public Model(){
		// printing on console
		System.out.println("Model()");
		
	}
	
	// Function to update the value for the first time
	public void setValue(int val){
		this.cntr = val;
		System.out.println("Model : initialized...calling setChanged()");
		setChanged();
	}
	
	// Function to increment the value by 1
	public void incrementVal(){
		this.cntr += 1;
		System.out.println("Model : UPDATED...calling setChanged()");
		setChanged();
		notifyObservers(cntr);
	}
	
	
	
	

}
