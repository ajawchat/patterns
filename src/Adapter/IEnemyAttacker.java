package Adapter;

public interface IEnemyAttacker {

	public void moveForward();
	public void fireWeapon();
	public void drive();
}



class EnemyAttacker implements IEnemyAttacker{

	@Override
	public void moveForward() {
		System.out.println("moving forward");
		
	}

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		System.out.println("firing weapon");
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("driving attack vehicle");
	}
	
}