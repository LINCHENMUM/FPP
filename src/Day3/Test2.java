package Day3;

public class Test2{
    public static void main(String[] args) {
        //String str = "123";
    	//String str=new String("123");
    	char data[]={'a','b','c'};
    	String str=new String(data);
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
    public static void change(String str){
        str = "abc";
    }
}
