package Arrays_And_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class permuterPalindrome {
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the string:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		isPermPal(str);
		System.out.println("Exting");
	}

	private static void isPermPal(String str) {
		HashMap<Character, Integer> checker= new HashMap<>();
		char[] ar = str.toCharArray();
		boolean count = true;
		for (char val : ar)
		{
			if(val!=' ')
			{
			if(!checker.containsKey(val))
					checker.put(val,1);
			else checker.put(val, checker.get(val)+1);
			}
		}
		
		System.out.println(checker.size());
	
		for (char ch : checker.keySet())
		{	
			if ((checker.get(ch)%2)!=0&& count==false)
			{
				System.out.println("Not a permuted palindrome");
				return;
			}
			if((checker.get(ch)==1 && count==true))
					{
						count=false;
					}
		}
		
		System.out.println("Permuted palindrome");
	
	}

}
