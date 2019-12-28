package roboMapper;

public class DecisionMakingSystem {
	
	private ExplorationAlgorithm algorithm;
	private MovementControlSystem MCS;
	private LocationAwarenessSystem LAS;
	private Sensor sensor;
	
	IntPoint nextSpot;
	
	public void setSensor (Sensor sensor)	{
		this.sensor = sensor;
	}
	
	public void setLAS (LocationAwarenessSystem LAS)	{
		this.LAS = LAS;
	}
	
	public void setMCS (MovementControlSystem MCS)	{
		this.MCS = MCS;
	}
	
	public void setAlgorithm (ExplorationAlgorithm algorithm)	{
		this.algorithm = algorithm;
	}
	
	public void performFindNextSpot()	{
		nextSpot = algorithm.findNextSpot(MCS, LAS, sensor);
	}
	public void performMoveToNextSpot()	{
		algorithm.moveToNextSpot(MCS, LAS, nextSpot);
	}
	public void performReturnHome()	{
		algorithm.returnHome(MCS, LAS);
	}

}
