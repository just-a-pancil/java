class If_else

{
	public static void main ( String[] args )
	{
		int hour = 23;
		if (hour<=12) 
		{
			System.out.println("������ ���") ;
		}
		else if ((hour>12)&&(hour<=21))
		{
			System.out.println("������ ����") ;
		}
		else if (hour>21)
		{
			System.out.println("������ �����") ;
		}
	}
}