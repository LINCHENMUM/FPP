package Day2.ReExercise;

public class Prog8 {
static int min(int[] inArray){
	int temp=inArray[0];
	for (int i=0;i<inArray.length;i++){
		if (inArray[i]<temp){
			temp=inArray[i];
		}
	}
	return temp;
}
public static void main(String[] args){
	int[] intArray={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
	int minInt=min(intArray);
	System.out.println(minInt);
	
}
}
