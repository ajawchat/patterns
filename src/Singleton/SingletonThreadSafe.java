// singleton object creation using thread safe logic. The method getInstance() has synchronized keyword, which means
// if more than one thread access the method at the same time, only one gets complete access and all other threads have 
// to wait their turn. 
// It also has a flag which gives the time when it was last accessed. This flag is shared across all the threads


package Singleton;

public class SingletonThreadSafe {
	private static SingletonThreadSafe singletonObj;
	
	// Private so no code outside this class can instantiate it. Also, this class cannot be inherited
	private SingletonThreadSafe(){}
	
	//A static method to instantiate the class
	public static synchronized SingletonThreadSafe getInstance(){
		System.out.println("Inside the getInstance() method of Singleton");
		if(singletonObj == null){
			singletonObj = new SingletonThreadSafe();
		}
		
		return singletonObj;
	}
	

}
