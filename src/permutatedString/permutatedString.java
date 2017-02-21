package Arrays_And_Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class permutatedString {
	
	public static void main(String[] args) {
		
		try
		{
			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter string1:");
		String str1 = br.readLine();
		str1=str1.trim();
		isNumeric(str1);
		System.out.println("Enter String2:");
		String str2=br.readLine();
		str2=str2.trim();
		isNumeric(str2);
		checkPermuted(str1,str2);
		}
		catch (Exception e) {
			System.out.println("Please enter valid string");
		}
		
	}

	private static void isNumeric(String str) {
	
		char[] a = str.toCharArray();
		for (char letter : a)
		{
			if(!Character.isLetter(letter))
			{
				System.out.println("Please enter Proper Characters no numbers are allowed");
				System.exit(0);
			}
		}
		return;
		
	}

	private static void checkPermuted(String str1, String str2) {
		
		if (str1.length()!=str2.length())
		{
			System.out.println("Not permuted");
			return;
		}
		
		int[] permu = new int[128];
		Arrays.fill(permu, 0);
		
		char[] wordone = str1.toCharArray();
		char[] wordtwo = str2.toCharArray();
		
		for (char one : wordone)
		{
			int a = (int)one;
			
			permu[a]=permu[a]+1;
		}
		
		for (char two : wordtwo)
		{		
			int a = (int)two;
			permu[a]=permu[a]-1;
			
		}
		
		for (int a : permu)
		{
			if(a!=0)
			{
				System.out.println("Not permuted");
				return;
			}
			
		}
		
		System.out.println("perumted string");
		
		
		
	}

	
	
	
	
}
