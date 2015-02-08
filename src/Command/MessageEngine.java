package Command;

import java.util.ArrayList;

public class MessageEngine {
	
	// ArrayList to hold the objects of type IMessageType
	ArrayList<IMessageType> messageQueue = new ArrayList<IMessageType>();
	
	// Adding message objects to the queue dynamically
	public void addMessageObject(IMessageType messageObj){
		messageQueue.add(messageObj);
	}
	
	
	// Executing the method for sending messages
	public void execute(){
		for(int i = 0; i < messageQueue.size(); i++){
			// Message is sent automatically, whether it is email, SMS or None
			messageQueue.get(i).sendMessage();
		}
	}
	
}
