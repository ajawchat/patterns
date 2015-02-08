package Command;

public class MessageEngineTest {

	public static void main(String[] args) {
		
		MessageEngine engine1 = new MessageEngine();
		
		// Using a list to traverse through the names. The last column contains the preferred mode of notification
		String[][] dbList = {{"A","7676","SMS"},
							 {"B","c@hsd.com","EMAIL"},
							 {"C","7676","NA"},
							 {"D","c@hsd.com","EMAIL"}};
		
		// Create an instance of the interface for reference
		IMessageType personObj;
		
		// Create an instance of the Factory Class to dynamically allocate the object type
		MessageTypeFactory messageTypeFact = new MessageTypeFactory();
		
		for(int i=0;i<dbList.length;i++){
			
			// The client does not need to change if a new preference for receiving messages is added in the future
			personObj = messageTypeFact.createObject(dbList[i]);			
			engine1.addMessageObject(personObj);
		}
		
		
		// Execute the method to start sending the messages as per preferred method
		engine1.execute();
		
		

	}

}
