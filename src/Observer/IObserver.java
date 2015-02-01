package Observer;


// This observer contains the method update() which sends an update to the profile
public interface IObserver {
	
	// Update the number of notifications on the profile
	public void updateNotifications();
		
	
	// We have to print all the notifications for every update
	public void displayNotifications();
}
