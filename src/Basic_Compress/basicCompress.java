package Arrays_And_Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class basicCompress {


public static void main(String[] args) {
	
	try
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String str = br.readLine();
		String result = isComp(str);
		System.out.println("The result string is :"+result );
		
		
		
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
}

private static String isComp(String str) {

	StringBuilder b = new StringBuilder();
	int count=0;
	
	for (int i = 0 ; i<str.length();i++)
	{
		count++;
		
		
		if( i>=str.length()-1 || str.charAt(i)!=str.charAt(i+1))
		{
			b.append(str.charAt(i));
			b.append(count);
			count=0;
			System.out.println(b);
		}

	}
	
	String result = (b.toString().length() <= str.length() ) ? b.toString():str;
	return result;
	
}

}
