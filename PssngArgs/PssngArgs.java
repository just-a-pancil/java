public class PssngArgs
{
	public static void main(String[] args) 
	{
		int largs = args.length;
		switch (largs)
		{
			case 0 : System.out.println("please enter the args");break;
			case 1 :if (args[0].equals("print"))
							{
								System.out.println("please enter more args");
							}
							else System.out.println("unknown args");break;
			case 2 :
				if (args[0].equals("print")) 
				{
					System.out.println(args[1]);
				}
				else System.out.println("unknown args");break;
			default : System.out.println("unknown command");break;
		}
	}
}