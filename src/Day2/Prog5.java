/**Programming Assignment 2-5
 * 
 */
package Day2;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args){
		
		System.out.println("Please input:");
		Scanner sc=new Scanner(System.in);
		String userInput="";
		if (sc.hasNext())
			userInput=sc.next();
		String reverse="";
		for (int i=0;i<userInput.length();i++)
		{
			reverse=userInput.charAt(i)+reverse;
		}
		System.out.println("Reverse output:"+reverse.trim());
		
	}

}
