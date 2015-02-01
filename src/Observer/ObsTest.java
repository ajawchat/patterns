package Observer;

public class ObsTest {

	public static void main(String[] args) {
		
		// Create a sample page about car information
		Page carPage = new Page();
		
		// Create sample users
		User u1 = new User("aj");
		u1.followPage(carPage);
		
		User u2 = new User("ss");
		u2.followPage(carPage);
		
		u1.displayNotifications();
		u2.displayNotifications();
		
		carPage.updateContents();
		System.out.println();
		u1.displayNotifications();
		u2.displayNotifications();
		
		carPage.updateContents();
		System.out.println();
		u1.displayNotifications();
		u2.displayNotifications();
		
		

	}

}
