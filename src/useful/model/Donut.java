package useful.model;

public class Donut
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.holeCount = 1;
		this.hasSprinkles = false;
		this.isGlazed = false;
		
	}
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor;	
	}
	public String toString()
	{
		String description = "This donut is a " + flavor + " donut";
		
		return description;
	}
	public Donut(boolean isGlazed)
	{
		this();
		this.isGlazed =isGlazed;
				
	}
	
	public String getShape()
	{
		return shape;
	}
	
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	
	public String getFlavor()
	{
		return flavor;
	}
	
}
