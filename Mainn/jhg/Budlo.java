package jhg;
public class Budlo
{
	public boolean say;
	public int glup;
	public String sex;

	public Budlo(){}

	public Budlo(boolean bsay, int bglup, String bsex)
	{
		say = bsay;
		glup = bglup;
		sex = bsex;

	}

	public void draka(int dath)
	{
		for(int i=0;i<dath;i++)
		{
			System.out.println("-" + dath);
		}
	}
	public String Say(String bsay)
	{
		if(say == true)
			{
			return bsay;
			}
		else return null;
	}	

}