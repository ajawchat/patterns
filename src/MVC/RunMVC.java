package MVC;

public class RunMVC {
	public static void main(String[] args){
		
		int startVal = 5;
		
		Model myModel = new Model();
		View myView = new View();
		
		// Add a View obj as an observer in model
		myModel.addObserver(myView);
		
		Controller controller = new Controller(myModel, myView);
		// Set the initial value in the model
		controller.modelSetVal(startVal);
		
		// Add controller to view
		myView.addController(controller);
		
	}
}
