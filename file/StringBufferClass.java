class StringBufferClass
{
	public static void main(String [] args)
	{  
	     String s=new String("preeti");
	     String s1= s.concat("preeti");
	     String s2=s;
	     System.out.println(s.equals(s1));//false
	     System.out.println(s.equals(s2));//true
	    StringBuffer sb=new StringBuffer("hello");
		StringBuffer sb1=new StringBuffer("hello");
	    StringBuffer sb1=sb;
	    System.out.println(sb);
	    System.out.println(sb1);
		System.out.println(sb==sb1);//true
		System.out.println(sb.equals(sb1));//true
		String s1="preeti";
		String s2="khatana";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
	}
}