class Vowel
{
	public static void main(String [] args)
	{
		String str ="preeti";
		System.out.println(str);
		System.out.println("reverse String");
		/*System.out.println(str.charAt(5));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(0));*/
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
			
		}
	}
}