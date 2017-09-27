package Day2.ReExercise;

public class Prog6 {

	public static String[] removeDups(String[] duplicateArray){
		String[] tempArray=new String[duplicateArray.length];
		int count=0;
		for (int i=0;i<=duplicateArray.length-1;i++){
			boolean insertFlag=true;
			
			for (int j=0;j<=tempArray.length-1;j++){
				if (duplicateArray[i].equals(tempArray[j])){
					insertFlag=false;
				}
			}
			if (insertFlag){
			tempArray[count]=duplicateArray[i];
			count++;
			}
		}
		String[] returnArray=new String[count];
		System.arraycopy(tempArray,0,returnArray,0,count);
		return returnArray;
	}
	public static void main(String[] args){
		String[] duplicateArray={"horse", "dog", "cat", "horse","dog"};
		String[] result=removeDups(duplicateArray);
		for (int i=0;i<=result.length-1;i++)
		System.out.println(result[i]);
	}
}
