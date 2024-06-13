package practice;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Sushma", reverse = "";
		
//		Scanner scr= new Scanner(System.in);
//		System.out.println("Enter string to reverse");
//		
//		str1=scr.nextLine();
		
		for(int i= str1.length()-1; i>=0; i--)
		{
		  reverse= reverse + str1.charAt(i);
		  
		}
		 if(str1.toLowerCase().equals(reverse.toLowerCase()))
		       System.out.println(str1 + " is a Palindrome String.");
		    else
		       System.out.println(reverse + " is not a Palindrome String.");
		

}
}