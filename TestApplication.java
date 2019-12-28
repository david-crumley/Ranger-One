
public class TestApplication {
	
	public static void main (String args[])	{
		
		// init begin
		LocomotivePeripheral testMotor = new TestLocoPeriph();
		MovementControlSystem MCS = new MovementControlSystem();
		MCS.setMovement(testMotor);
		
		Sensor testSensor = new TestSensor();
		
		Map testMap = new TestMap();
		LocationAwarenessSystem LAS = new LocationAwarenessSystem ();
		LAS.setMap(testMap);
		
		ExplorationAlgorithm testAlgorithm = new TestExplorer();
		
		
		DecisionMakingSystem DMS = new DecisionMakingSystem();
		DMS.setAlgorithm(testAlgorithm);
		DMS.setLAS(LAS);
		DMS.setMCS(MCS);
		DMS.setSensor(testSensor);
		// init end
		
		
		DMS.performFindNextSpot();
		DMS.performMoveToNextSpot();
		
		LAS.performDisplay();
		
		
		
	}

}
