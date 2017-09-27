/**Programming Assignment 2-4
 * 
 */
package Day2;

import java.io.File;

public class Prog4 {
	public static void main(String[] args){
		
		//File Data = new File("c:/data.txt");
		String myString =Data.records;
		String[] arrayRows=new String[10000];
		arrayRows=myString.split("£º");
		for(String records:arrayRows)
		{
			String[] arrayColumns=new String[100];
			arrayColumns=records.split(",");
			String productId=arrayColumns[0];
			System.out.println(productId);
			
		}
	}

}
