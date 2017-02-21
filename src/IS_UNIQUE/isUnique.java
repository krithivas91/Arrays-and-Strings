package Arrays_And_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isUnique {
	
public static void main(String[] args)
{
	try
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

while (true)
{
	System.out.println("Enter the string: ");
	String str = br.readLine();
		str = str.trim();
	checkUnique(str);
	
	
	}

	}
	catch (IOException ioe) {
		System.out.println("Please enter valid string");
	}
}

public static void checkUnique(String str)
{
	
	if(str.length() > 128)
	{
		System.out.println("not unique");
		return;
	}
	
	boolean[] check = new boolean[128];
	
	char[] words  = str.toCharArray();
	
	for(char letter: words)
	{
		int value = 0;
		value = (int)letter;
		
		if(check[value]==true)
		{
			System.out.println("not unique");
			return;
		}
		else
			check[value]=true;
		
	}
	
	System.out.println("unique");
	return;
	
}






}
