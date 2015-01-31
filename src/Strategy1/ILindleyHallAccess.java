package Strategy1;

public interface ILindleyHallAccess {
	public String[] allowedAccess();
}


class FirstFloor implements ILindleyHallAccess{
	
	String[] access = {"100","112"};

	public String[] allowedAccess() {
		return access;
	}
	
}


class SecondFloor implements ILindleyHallAccess{
	
	String[] access = {"215","222"};

	public String[] allowedAccess() {
		return access;
	}
	
}


class VisitorAccess implements ILindleyHallAccess{
	
	String[] access = {"Lobby","Kitchen"};

	public String[] allowedAccess() {
		return access;
	}
	
}


class All implements ILindleyHallAccess{
	
	String[] access = {"Lobby","Kitchen","100","112","215","222"};

	public String[] allowedAccess() {
		return access;
	}
	
}
