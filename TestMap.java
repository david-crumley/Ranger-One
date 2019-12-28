package roboMapper;

public class TestMap implements Map		{
	
	private int size = 5;
	private char map[][] = new char[size][size];
	
	public void update (IntPoint point, char marker)	{
		System.out.println ("updating map");
		map[point.getX()][point.getY()] = marker;
	}
	
	public void display()	{
		int i, j;
		for (i = 0; i < size; i++)	{
			for (j = 0; j < size; j++)	{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
