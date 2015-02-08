package Adapter;

public class EnemyAttackerTest {
	public static void main(String[] args) {
		
		EnemyRobot newRobot = new EnemyRobot();
		
		EnemyAdapter newAdapter = new EnemyAdapter(newRobot);
		
		EnemyAttacker newAttacker = new EnemyAttacker();
		
		// For the robot using the adapter class
		newAdapter.fireWeapon();
		newAdapter.moveForward();
		
		// For the normal target class
		newAttacker.fireWeapon();
		newAttacker.moveForward();
		

	}

}
