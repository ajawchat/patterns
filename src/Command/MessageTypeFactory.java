// This factory class is used to dynamically return the correct object based on user preference provided
// The client does not need to change if a new preference for receiving messages is added in the future

package Command;

public class MessageTypeFactory {
	
	public IMessageType createObject(String[] personData){
		IMessageType personObj = null;
		
		if(personData[2].equals("SMS"))
			personObj = new SMS(personData[0],personData[1]);
		else if(personData[2].equals("EMAIL"))
			personObj = new Email(personData[0],personData[1]);
		else if(personData[2].equals("NA"))
			personObj = new NoMessage(personData[0],personData[1]);
		else{
			System.out.println("Invalid data entry for record No");
			personObj = new NoMessage(personData[0],personData[1]);
		}
		
		return personObj;
		
	}
}
