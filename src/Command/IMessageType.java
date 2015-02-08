package Command;

public interface IMessageType {
	
	public void sendMessage();
}

//***************************************
// Class SMS implements the interface, so that the MessageSendingEngine does not have to worry about the speicifc 
// object type
class SMS implements IMessageType{

	private String name;
	private String phoneNo;
	
	public SMS(String name, String phoneNo){
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public void sendMessage() {
		System.out.println("Sending SMS to "+name+" on "+phoneNo);
		
	}
}


//***************************************

class Email implements IMessageType{

	private String name;
	private String emailID;
	
	public Email(String name, String emailID){
		this.name = name;
		this.emailID = emailID;
	}
	
	public void sendMessage() {
		System.out.println("Sending email to "+name+" on "+emailID);
		
	}
}



//***************************************
// Class to represent that user does not want any messages
class NoMessage implements IMessageType{

	private String name;
	private String contact;
	
	public NoMessage(String name, String contact){
		this.name = name;
		this.contact = contact;
	}
	
	public void sendMessage() {
		
	}
}