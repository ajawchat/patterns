package MVC;

import java.awt.event.ActionEvent;

public class Controller implements java.awt.event.ActionListener {

	// Initialize the model and View class references
	Model myModel;
	View myView;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// When button is pressed, increment the counter value
		System.out.println("Controller: Calling model to increment value");
		myModel.incrementVal();
		
		// When the counter is incremented, notifyObservers() is automatically called, which updates the View 
	}
	
	
	// Constructor
	public Controller(Model myModel, View myView){
		System.out.println("Controller:  created...");
		
		// Initialize the model and view references
		this.myModel = myModel;
		this.myView = myView;
	}
	
	
	// Initialize the value in model
	public void modelSetVal(int val){
		myModel.setValue(val);
	}
	
	
	

}
