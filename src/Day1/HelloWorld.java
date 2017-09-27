package Day1;

import java.math.BigInteger;
import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] argusments) {

		System.out.println("Hello World!");

		int[][] arrayInt = new int[10][2];
		arrayInt[0][0]=1;
		arrayInt[1][0]=2;
		int row=arrayInt.length;
		int col=arrayInt[0].length;
		System.out.println("row="+row);
		System.out.println("col="+col);
		System.out.println(Arrays.deepToString(arrayInt));
		
		BigInteger a=BigInteger.valueOf(2);
		BigInteger b=a.pow(3);
		System.out.println(b);
		
		final int intTest;
		intTest=1;
		System.out.println(intTest);
		//intTest=2;
		System.out.println(intTest);
		char ch='a';
		System.out.println("(int)ch"+(int)ch);
		
		int[][] arrayI= new int[2][2];
		arrayI[0][0]=1;
		arrayI[1][0]=2;
		System.out.println("arrayI.length"+arrayI.length);
		System.out.println(arrayI[0].length);
		System.out.println(Arrays.toString(arrayI));
		
		int[] arrayII={1};
		System.out.println(Arrays.toString(arrayII));
		
	}
}
