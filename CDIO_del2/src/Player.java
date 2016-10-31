
public class Player {
	
	private String name;
	private int points;
	
	public Player(String name)
	{
		this.name = name;
		points = 1000;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public void setPoints(int points)
	{
		this.points = points;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void resetPoints(int points)
	{
		this.points = 0;
	}
	


}
