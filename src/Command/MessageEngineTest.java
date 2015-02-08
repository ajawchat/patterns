package Command;

public class MessageEngineTest {

	public static void main(String[] args) {
		
		MessageEngine engine1 = new MessageEngine();
		
		// Using a list to traverse through the names. The last column contains the preferred mode of notification
		String[][] dbList = {{"A","7676","SMS"},
							 {"B","c@hsd.com","EMAIL"},
							 {"C","7676","NA"},
							 {"D","c@hsd.com","EMAIL"}};
		
		IMessageType personObj;
		for(int i=0;i<dbList.length;i++){
			personObj = null;
			
			if(dbList[i][2].equals("SMS"))
				personObj = new SMS(dbList[i][0],dbList[i][1]);
			else if(dbList[i][2].equals("EMAIL"))
				personObj = new Email(dbList[i][0],dbList[i][1]);
			else if(dbList[i][2].equals("NA"))
				personObj = new NoMessage(dbList[i][0],dbList[i][1]);
			else{
				System.out.println("Invalid data entry for record No "+i);
				personObj = new NoMessage(dbList[i][0],dbList[i][1]);
			}
			
			engine1.addMessageObject(personObj);
		}
		
		
		// Execute the method to start sending the messages as per preferred method
		engine1.execute();
		
		

	}

}
