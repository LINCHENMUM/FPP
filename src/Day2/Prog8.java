package Day2;

public class Prog8 {
	public static void main(String[] args){
		int[] arrayMin={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int min=min(arrayMin);
		System.out.println(min);
	}
	static int min(int[] arrayOfInts){
		int min=arrayOfInts[0];
		for (int i=0;i<arrayOfInts.length;i++)
		{
			if (min>arrayOfInts[i])
			{
				min=arrayOfInts[i];
			}
			
		}
		
		return min;
	}

}
