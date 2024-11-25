import java.util.*;
public class CaseString
{
	public static void main(String x[])
	{	
		
		Scanner xyz = new Scanner (System.in);
		StringBuffer sb = new StringBuffer("Good Morning");
		
		System.out.println("Enter the Choice");
		int choice =xyz.nextInt();
		
	
		switch(choice)
		{
		case 1:
		sb.insert("very");
		System.out.println(+sb);
		break;
		
		case 2:
		sb.append("India");
		System.out.println(+sb);
		break;
		
		case 3:
		sb.delete(0,4);
		System.out.println(+sb);
		break;
		
		}
	}
}