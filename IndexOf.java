public class IndexOf
{
public static void main(String x[])
{  	

	// return their index Value -----------> 5 (output)
	//String s="Good Morning India";
	//int index=s.indexOf("Morning");
	//if(index!=-1)
	//{
	//	System.out.println("Data  Found"+index);
	//}
	//else
	//{
	//System.out.println("Data Not found ");
	//}
	
	//String trim()----------------> remove space begining and end of the String
	//String s="                   Good Morning       India        ";
	//String s1=s.trim();
	//System.out.println(s1);
	

	//-------------------->int compareTO(String)
	//String s="abc";
	//String s1="abc";
	
	//int r=s.compareTo(s1);
	//if (r==0)
	//{
	//	System.out.println("Strings Are Equal"+r);
	//}
	//else
	//	System.out.println("String  Are not Equal"+r);
	
	
	
	//boolean endsWith(String)------->
	//String s="ganesh";
	//boolean b=s.endsWith("sh");
	//if (b)
	//{
	//	System.out.println("String Ends With sh");
	//}
	//else
	//	System.out.println("Sring Not Ends With sh");
	
	
	//boolean startswith(string )
	//String s="ganesh";
	//boolean b =s.startsWith("R");
	//if (b)
	//{
	//	System.out.println("String Starts with g ");
	//}
	//else
	//{
	//	System.out.println("String not start with g");
	//}
	
	
	//CompareToIgnore Case (String)
	//String s ="abc";
	//String s1="ABC";
	//int result =s.compareToIgnoreCase(s1);
	//if(result==0)
	//{
	//System.out.println("Strings are Equal");
	//}
	//else
	//{
	//System.out.println("Strings Are Not Equal ");
	//}
	
	
	//------------------->boolean equals(object)
	String s="abc";
	String s1="abc";
	
	boolean b=s.equals(s1);
	if(b)
	{
		System.out.println("String  are equal");
	}
	else
	{
		System.out.println("Strings are Not equal");
	}
	
}
}