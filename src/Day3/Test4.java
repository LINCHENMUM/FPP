package Day3;

public class Test4 {
public static void main(String[] args){
	StringBuffer str=new StringBuffer("123");
	System.out.println(str);
	change(str);
	System.out.println(str);
}
public static void change(StringBuffer str){
	//str=new StringBuffer("abc");
	str.append("abc");
}
}
