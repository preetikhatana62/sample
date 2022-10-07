class Strings
{
	public static void main(String[] args)
	{
		String str="preeti";
		String str1="khatana";
		String str2= "My ,name, is, preeti";
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('e'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String s=str.concat("khatana");
	    System.out.println(s);
        System.out.println(s.substring(6));
        String  s2=(s.substring(6,13));
        System.out.println(s2);
	    System.out.println(str.lastIndexOf('i'));
	    System.out.println(str.equals(str1));
		boolean b=(str2.contains("khatana"));
	    boolean c = (b==true)?true:false;
		  
		
		
     	   
	}	
}