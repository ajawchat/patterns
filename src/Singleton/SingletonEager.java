package Singleton;

public class SingletonEager {
	
	// This prevents two threads from accessing at once, and two instances getting created
	private static SingletonEager singletonObj = new SingletonEager();
	
	// Private so no code outside this class can instantiate it. Also, this class cannot be inherited
	private SingletonEager(){}
	
	//A static method to instantiate the class
	public static SingletonEager getInstance(){
		System.out.println("Inside the getInstance() method of Singleton");
		
		// No need to check, as the object is created when the application starts
		return singletonObj;
	}
}
