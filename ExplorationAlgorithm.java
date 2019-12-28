package roboMapper;

public interface ExplorationAlgorithm {
	
		
	public IntPoint findNextSpot(MovementControlSystem MCS, LocationAwarenessSystem LAS, Sensor sensor);
	
	public void moveToNextSpot(MovementControlSystem MCS, LocationAwarenessSystem LAS, IntPoint nextSpot);
	
	public void returnHome(MovementControlSystem MCS, LocationAwarenessSystem LAS);

}
