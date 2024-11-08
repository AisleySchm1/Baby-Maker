package babymaker;

public class Baby 
{
	private String name;
    private double weight;

    public Baby (String n, double w)
    {
      name = n;
      weight = w;
    }
    public String getName()
    {
      return name;
    }
    public void setName(String n)
  {
    name = n;
  }
public double getWeight()
  {
  return weight;
  }
    public void setWeight(double w)
    {
      weight = w;
    }
}
