package Observer;

class User implements IObserver {

	private int noNotify;
	private int noFriendReq;
	private Page pageObj;
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public void followPage(Page pageObj){
		// To keep the reference of the object
		this.pageObj = pageObj;
		pageObj.registerObservers(this);
		
	}
	
	public void updateNotifications() {
		this.noNotify += 1;
		
	}

	public void displayNotifications() {
		System.out.println("Hi "+this.name+", Your profile updates");
		System.out.println("Notificaitons: "+noNotify);
		
	}

}
