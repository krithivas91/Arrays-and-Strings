package Arrays_And_Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class oneEdit {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the String1:");
			String str1 = br.readLine();
			System.out.println("Enter string2:");
			String str2 = br.readLine();
			if (str1.length() == str2.length())
				oneReplace(str1, str2);
			else if (str1.length() - str2.length() == 1 || str1.length() - str2.length() == -1)
				oneInsertDelete(str1, str2);
			else
				System.out.println("More the one Edit... False.. Exiting...");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void oneInsertDelete(String str1, String str2) {

		String testString = null;
		String orginalStr = null;
		boolean check = false;
		int j = 0;
		if (str1.length() > str2.length()) {
			testString = str1;
			orginalStr = str2;
		} else {
			orginalStr = str1;
			testString = str2;
		}

		for (int i = 0; i < orginalStr.length(); i++) {
			if (!check) {
				if (orginalStr.charAt(i) != testString.charAt(j))
				{
					check = true;
				}
				j++;
			}
			if (check) {
				if (orginalStr.charAt(i) != testString.charAt(j)) 
				{
					
					System.out.println("More than one Edit... False.. Exiting...");
					return;
				}	
				j++;
			}
				
			}
		System.out.println("True.. only one edit happened");
		return;
		}
		
	

	private static void oneReplace(String str1, String str2) {
		
		boolean check=false;
		
		
		for(int i =0;i<str1.length();i++)
		{
			if(!check)
			{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				check=true;
				i++;
			}
			}
			if(check)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					System.out.println("More than one Replace... False.. Exiting...");
					return;
				}
				
			}
		}
		System.out.println("True.. one replace happened");
		
		
		
	}

}
