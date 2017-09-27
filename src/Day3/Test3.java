package Day3;

public class Test3 {
public static void main(String[] args){
	String str=new String("123");
	str=new String("abc");
	System.out.println(str);
	
	float f1 = 16777215f;  
	for (int i = 0; i < 10; i++) {  
	    System.out.println(f1);  
	    f1++;  
	}  
	
	float f = 2.2f;  
	double d = (double) f;  
	System.out.println(d);   
	f = 2.25f;  
	d = (double) f;  
	System.out.println(d);
	
	f = 2.2f;  
	double dd = (double) f;  
	System.out.println(f);  
	System.out.println(dd);  
	
	String s = "ABC";    
	s.toLowerCase();
	System.out.println(s); 
	String ss="";
			ss=s.toLowerCase();
	System.out.println(ss);  
}
}
