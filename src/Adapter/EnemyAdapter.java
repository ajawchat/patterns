package Adapter;

public class EnemyAdapter implements IEnemyAttacker {
	
	// Include an object of the EnemyRobot - composition
	EnemyRobot newRobot;
	
	// constructor instantiates the composed robot class
	public EnemyAdapter(EnemyRobot newRobot){
		this.newRobot = newRobot;
	}

	@Override
	public void moveForward() {
		newRobot.walkForward();
		
	}

	@Override
	public void fireWeapon() {
		newRobot.smashWithHands();
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
