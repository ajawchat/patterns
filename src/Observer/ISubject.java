package Observer;

import java.util.ArrayList;

public interface ISubject {
	void registerObservers(User u);
	void notifyObservers();
	void removeObservers(User u);
	
}




// Consider a page to which users can subscribe for information
class Page implements ISubject{

	private ArrayList<User> obs;
	
	// create a constructor for declaring the ArrayList
	public Page(){
		obs = new ArrayList<User>();
	}
	
	public void registerObservers(User o) {
		obs.add(o);
	}

	public void notifyObservers() {
		
		for(int i = 0; i < obs.size(); i++){
			User u = (User) obs.get(i);
			u.updateNotifications();
		}
	}

	public void removeObservers(User o) {
		int i = obs.indexOf(o);
		if(i >= 0)
			obs.remove(i);
	}
	
	
	// Method to update the page contents
	public void updateContents(){
		System.out.println("Page1 is now updated");
		
		// Notify all the observers once that is done
		notifyObservers();
	}
}
