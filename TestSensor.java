
public class TestSensor implements Sensor	{
	
	private IntPoint orientation;
	
	public void setOrientation (IntPoint orientation)	{
		this.orientation = orientation;
	}
	
	public IntPoint getOrientation ()	{
		return orientation;
	}
	
	public int calcDistance()	{
		System.out.println ("calulating distance");
		return 0;
	}

}
