class Digit
{
	public static void main(String [] args)
	{
		String n="234";
		int sum=0;
		for(int i=0;i<n.length();i++)
		{
			char c=n.charAt(i);
			if(c%2==0)
			{
			  System.out.print(c);

			}
		}
		
		
	}
}