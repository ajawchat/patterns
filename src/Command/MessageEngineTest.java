package Command;

public class MessageEngineTest {

	public static void main(String[] args) {
		
		MessageEngine engine1 = new MessageEngine();
		
		IMessageType person1 = new SMS("A","76786");
		IMessageType person2 = new SMS("B", "768278");
		IMessageType person3 = new Email("C", "c@hsd.com");
		IMessageType person4 = new Email("D", "dd@kskd.com");
		
		
		engine1.addMessageObject(person1);
		engine1.addMessageObject(person2);
		engine1.addMessageObject(person3);
		engine1.addMessageObject(person4);
		
		engine1.execute();
		
		

	}

}
