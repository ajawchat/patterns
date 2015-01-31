package Strategy1;

// Represents the department administrator object
class SOIC{
	
	private String studName;
	private String studID;
	
	
	
	public void setDetails(String name, String ID){
		studName = name;
		studID = ID;
	}
	
	public String getName(){
		return this.studName;
	}

	public String getID(){
		return this.studID;
	}

	// create an instance of the interface so that we can set it dynamically
	private ILindleyHallAccess accessType;
	
	public void setAccessType(ILindleyHallAccess accessType){
		this.accessType = accessType;
	}
	
	
	public void getAccessAllowed(){
		String[] studAccess = accessType.allowedAccess();
		
		System.out.println("Hi "+studName+", You have access to the below rooms");
		
		for(int i = 0; i < studAccess.length; i++)
			System.out.println(studAccess[i]);
		
	}
	
	
}

// **********************************************************************
// Inherit the classes [ type of students ] from the SOIC

class Grad extends SOIC{
	
	public Grad(String name, String ID){
		setDetails(name, ID);
		setAccessType(new FirstFloor());
	}
}


class UnderGrad extends SOIC{
	
	public UnderGrad(String name, String ID){
		setDetails(name, ID);
		setAccessType(new FirstFloor());
	}
}


class PhD extends SOIC{
	
	public PhD(String name, String ID){
		setDetails(name, ID);
		setAccessType(new SecondFloor());
	}
}


class Professor extends SOIC{
	
	public Professor(String name, String ID){
		setDetails(name, ID);
		setAccessType(new All());
	}
}

class Visitor extends SOIC{
	
	public Visitor(String name){
		setDetails(name, "NA");
		setAccessType(new VisitorAccess());
	}
}




//**********************************************************************
//Class to test the code of SOIC

public class Strategy1 {
	
	
	public static void main(String[] args) {
		
		Grad newStud = new Grad("ajinkya", "73673");
		newStud.getAccessAllowed();
	
		PhD newStud1 = new PhD("rohan", "84789");
		newStud1.getAccessAllowed();
		
		Professor prof1 = new Professor("J", "873847");
		prof1.getAccessAllowed();
		
		Visitor v1 = new Visitor("John Wick");
		v1.getAccessAllowed();
		
	}

}
