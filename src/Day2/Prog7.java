/*Programming Assignment 2-9
 * 
 */
package Day2;

import java.util.Random;

public class Prog7 {
	
	public static void main(String[] args){
		int max=100;
		int min=0;
		Random r = new Random();
		
		System.out.println("      "+(r.nextInt(max)%(max-min+1) + min)+"      "+(r.nextInt(max)%(max-min+1) + min)+"      "+(r.nextInt(max)%(max-min+1) + min)+"      "+(r.nextInt(max)%(max-min+1) + min));
		System.out.println();
		System.out.println("     +"+(r.nextInt(max)%(max-min+1) + min)+"     +"+(r.nextInt(max)%(max-min+1) + min)+"     +"+(r.nextInt(max)%(max-min+1) + min)+"     +"+(r.nextInt(max)%(max-min+1) + min));
		System.out.println();
		System.out.println("   "+"------ "+"   "+"------"+"   "+"------"+"   "+"------");
		
		
		
	}

}
