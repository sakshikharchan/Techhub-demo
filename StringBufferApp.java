public class StringBufferApp
{

	public static void main(String x[])
	{
		StringBuffer sb = new StringBuffer("GoodMorning");
		System.out.println("Before append:"+sb);
		
		sb.append("india");
		System.out.println("After Append:"+sb);
		
		sb.insert(5,"Very");
		System.out.println("After Insert:"+sb);
		
		sb.delete(0,4);
		System.out.println("After delete:"+sb);
		
	}
}
