/*Programming Assignment 2-6
 * 
 */
package Day2;

import java.util.Arrays;

public class Prog6 {
public static void main(String[] args){
	
	//String[] arrayDup=new String[10];
	String[] arrayDup={"horse", "dog", "cat", "horse","dog"};
	String[] arrayRemoveDup=removeDups(arrayDup);
	System.out.println(Arrays.toString(arrayRemoveDup));	
}
public static String[] removeDups(String[] arrayInput){
	String[] arrayOutput=new String[arrayInput.length];
	int index=0;
	for (int i=0;i<arrayInput.length-1;i++)
	{
		String strInput=arrayInput[i];
		boolean insertFlag=true;
		//System.out.println("strInput="+strInput);
		for (int j=0;j<arrayOutput.length-1;j++)
		{
			if (strInput.equals(arrayOutput[j])) 
			{ 
				insertFlag=false;
			    break;
			}
		}
		if (insertFlag)
		{
		arrayOutput[index]=strInput;
		//System.out.println("arrayOutput="+arrayOutput[index]);
		index++;
		}
	}
	return arrayOutput;
	
}
}
