package Day2.ReExercise;

public class Prog4 {
public static void main(String[] args){
	String myString=Data.records;
	String[] rowString=myString.split(":");
	for(int i=0;i<rowString.length-1;i++){
		System.out.println(rowString[i].split(",")[0]);
	}
}
}
