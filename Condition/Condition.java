class Condition
{
	public static void main(String[] args)
	{
		int n1=1567230;
		int n2=386021;
		String result1 = "n1 - ";
		String result2 = "n2 - ";
		result1+=(n1 % 2 ==1) ?"нечет":"чет";
		result2+=(n2 % 2 ==1) ?"нечет":"чет";
		System.out.println(result1 + "\n" + result2);
	}
}