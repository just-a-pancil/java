import jhg.*;
class Mainn
{
public static void main(String[] args) 
{
	Budlo budlo0 = new Budlo();
	Budlo budlo1 = new Budlo(true, 5, "man");
	budlo1.draka(2);
	System.out.println(budlo1.Say("bolno"));
}
}