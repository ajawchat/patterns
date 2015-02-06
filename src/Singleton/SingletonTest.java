package Singleton;

class SingletonClass {
	
	private static SingletonClass singletonObj;
	
	// Private so no code outside this class can instantiate it. Also, this class cannot be inherited
	private SingletonClass(){}
	
	//A static method to instantiate the class
	public static SingletonClass getInstance(){
		System.out.println("Inside the getInstance() method of Singleton");
		if(singletonObj == null){
			singletonObj = new SingletonClass();
		}
		
		return singletonObj;
	}
	
	
	public void displayStatus(){
		System.out.println("Displaying status");
	}
	
}


// Testing code for Singleton 

public class SingletonTest{
	public static void main(String args[]){
		
		SingletonClass singleObj = SingletonClass.getInstance();
		singleObj.displayStatus();
	}	
}
