package Day7;

public class Highs {
public void testStr(String s){
	if (s.length()>0){
		System.out.println("before recursion="+s);
		testStr(s.substring(1));
		System.out.println("after recursion="+s);
		System.out.println(s.charAt(0));
	}
}
public static void main(String[] arg){
	Highs r1=new Highs();
	r1.testStr("Madam");
}
}
