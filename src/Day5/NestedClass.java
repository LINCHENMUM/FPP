package Day5;

public class NestedClass {
	private static String name = "javaJohn";
    private String id="X001";
    static class Person{
    	private String address="Swjtu,chendu,China";
    	public String mail="abc@gmail.com";
    	public void display(){
    		//System.out.println(id);
    		System.out.println("name="+name);
    		System.out.println("Address="+address);
    	}
    }
    public void printInfo(){
    	Person person=new Person();
    	//System.out.println(address);
    	//System.out.println(mail);
    	//person=new Person();
    	//System.out.println(address);
    	System.out.println(person.address);
    	System.out.println(person.mail);
    }
    public static void main(String[] args){
    	NestedClass nestedClass=new NestedClass();
    	nestedClass.printInfo();
    }
}
