public class StringApp
{	 
	public static void main(String x[])
	{	
		//a)-------------->String();
		//String name =new String ();
		//System.out.println(name);
		
		
		
		
		//b)-------------->String (String)
		//String name =new String ("GOOD");
		//System.out.println(name);
		

		
		//c)--------------->String (char [])
		//char ch []= new char[]{'a','b','c','d'};
		//String s1=new String (ch);
		//System.out.println(s1);
		
		
		//d)---------------->String(byte [])
		
		//byte b[]=new byte[]{97,98,99,110};
		//String s1 =new String (b);
		//System.out.println(s1);
		
		//e)----------------->(char [],int offset,int length)
		//char ch[]=new char []{'a','b','c','d','e','f','g'};
		//String s1 =new String (ch,2,3);
		//System.out.println(s1);
		
		//<____________int length()________________>
		//int length()---------->return length of String or size of String
		//String s="GOOD";
		//int l=s.length();
		//System.out.println(l);
		
		
		//char charAt(int index)
		//String s="JAVA";
		//int l =s.length();
		//for(int i=0;i<l;i++)
		//{
		//	char ch=s.charAt(i);
		//	System.out.printf("s[%d]--->%c\n",i,ch);
		//}
		
		//calculate string ----------->without length() function
		//String s ="Good";
		//int count =0;
		//try
		//{
		//	do
		//	{
		//		s.charAt(count);
		//		count++;
		//		
		//	}while(true);
		//}
		//catch(Exception ex)
		//{
		//	System.out.println("Length of String is :"+count);
		//}
		
		//------------------->String concat(String )
		//String s="abc";
		//String s1="mno";
		//s.concat(s1);
		//String l=s.concat(s1);
		//System.out.println(s);
		
		
		//-------------->Identify Memory address
		//String s="abc";
		//String s1="mno";
		//String s2=s.concat(s1);
		//System.out.println("Hash Code of s"+System.identityHashCode(s));
		//System.out.println("Hash code of s1"+System.identityHashCode(s1));
		//System.out.println("Hash code of s2"+System.identityHashCode(s2));
		
		//Lower case String To----->Upper Case
		//String s="Good";
		//System.out.println("Before COnversion"+s);
		//String s1 =s.toUpperCase();
		//System.out.println("After Conversion"+s1);
		
		//Upper case String To------>Lower case 
		//String s="LAL BAG";
		//System.out.println("Before COnversion"+s);
		//String s1=s.toLowerCase();
		//System.out.println("After conversion"+s1);
		
		//Extract String ------------>  SUBSTRING
		//String s="Good Morning India";
		//String s1=s.substring(5,12);
		//System.out.println(s1);
		
		
		String str ="abc@gmail.com,mno@gmail.com,pqr@gmail.com,stv@gmail.com";
		
		String emails[]=str.split("com");
		for(String email:emails)
		{
			System.out.printf(email);
			
		}
	
	}
}