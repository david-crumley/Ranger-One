
public class TestExplorer implements ExplorationAlgorithm	{

	public IntPoint findNextSpot(MovementControlSystem MCS, LocationAwarenessSystem LAS, Sensor sensor)	{
		System.out.println ("finding next spot");
		return new IntPoint (2,2);
	}
	
	public void moveToNextSpot(MovementControlSystem MCS, LocationAwarenessSystem LAS, IntPoint nextSpot)	{
		System.out.println ("moving to nextSpot");
		LAS.setX(nextSpot.getX());
		LAS.setY(nextSpot.getY());
		LAS.performUpdate('#');
		
	}
	
	public void  returnHome(MovementControlSystem MCS, LocationAwarenessSystem LAS)	{
		System.out.println ("returning home");
	}
}
