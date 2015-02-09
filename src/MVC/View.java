package MVC;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Observable;

public class View implements java.util.Observer {

	private TextField textField;
	private Button button;
	
	
	// Constructor
	public View(){
		System.out.println("View()");
		
		Frame frame = new Frame("MVC Example");
		frame.add("North", new Label("counter"));
		
		textField = new TextField();
		frame.add("Center",textField);
		
		Panel myPanel = new Panel();
		button = new Button("Press Me");
		myPanel.add(button);
		frame.add("South",myPanel);
		
		frame.addWindowListener(new CloseListener());
		frame.setSize(200,100);
		frame.setLocation(100,100);
		frame.setVisible(true);
		
		
	}
	
	
	// Update the GUI with the updated cntr value
	public void update(Observable arg0, Object arg1) {
		
		textField.setText("" + ((Integer)arg1).intValue());
	}

	
	// Function to initialize text field
	public void setValue(int val){
		textField.setText("" + val);
	}
	
	
	public void addController(Controller controller){
		button.addActionListener((ActionListener) controller);
		System.out.println("View: Adding controller reference...");
	}
	
	
	// New static class for closing the window when "x" is marked
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	} 

	
	
	
}
