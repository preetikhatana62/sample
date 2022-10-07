class WrapperClass
{
	public static void main(String [] args)
	{
		int i=10;
		float f=2.0f;
		double d=23.45;
		short s=43;
		
		System.out.println("---autoboxing----");
		Integer a=Integer.parseInt("10");
		Float l=Float.parseFloat("2.0f");
		Double o=Double.parseDouble("23.45");
		Short t=Short.parseShort("43");
		
		
		System.out.println(a);
		System.out.println(l);
		System.out.println(o);
		System.out.println(t);
		
		System.out.println("----unboxing----");
		int n=a;
		float e=l;
		double b=o;
		short y=t;
		System.out.println(n);
		System.out.println(e);
		System.out.println(b);
		System.out.println(y);
		
		
		
		
	}
}