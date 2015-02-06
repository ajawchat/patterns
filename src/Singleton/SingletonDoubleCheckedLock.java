/*
 * We use double checked locking to reduce the use of synchronization at all the times. Synchronizing a method or 
 * a class reduces the performance of the application by 100 times
 */

package Singleton;

public class SingletonDoubleCheckedLock {
	private volatile static SingletonDoubleCheckedLock singletonObj;
	
	// Private so no code outside this class can instantiate it. Also, this class cannot be inherited
	private SingletonDoubleCheckedLock(){}
	
	//A static method to instantiate the class
	public static SingletonDoubleCheckedLock getInstance(){
		System.out.println("Inside the getInstance() method of Singleton");
		if(singletonObj == null){
			//Synchronize the class only when required
			synchronized (SingletonDoubleCheckedLock.class) {
				//Check if the object is still null, then only instantiate it
				if (singletonObj == null){
					singletonObj = new SingletonDoubleCheckedLock();
				}
			}
		}
		return singletonObj;
	}
	

}
