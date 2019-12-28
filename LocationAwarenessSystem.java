
public class LocationAwarenessSystem {
	
	private IntPoint currSpot = new IntPoint(0,0);
	private Map map;
	
	public void setX (int x)	{
		this.currSpot.setX(x);
	}
	
	public void setY (int y)	{
		this.currSpot.setY(y);
		
	}
	
	public void setMap (Map map)	{
		this.map = map;
	}
	
	public void performUpdate (char marker)	{
		map.update(currSpot, marker);
	}
	
	public void performDisplay ()	{
		map.display();
	}
}
