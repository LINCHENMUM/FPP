package Day3;

public class Dog {
	static {
		
		System.out.println("\nI'm static test block 1.");
		setTestString("This is static block's String");
		setTestValue(2);
	}
	static{
		System.out.println("second block 2");
	}
	private static int testValue=9999;
	
	//System.out.println("9999 testValue="+testValue);
	
	public int getTestValue(){
		return testValue;
	}
	public static void setTestValue(int testValue){
		if(testValue>0)
			Dog.testValue=testValue;
		System.out.println("setTestValue of method="+testValue);
	}
	public static String testString="I is not changed";
	public static void setTestString(String testString){
		Dog.testString=testString;
		System.out.println("setTestString method:"+testString);
	}

	public static String getTestString(){
		return testString;
	}
	public static void main(String[] args){
		Dog.setTestValue(5);
		Dog.testString="\nAssigning testString a value";
		Dog dog=new Dog();
		System.out.println(dog.getTestString());
		
		System.out.println("\nCheck if Class and Instance Static Variable are same:");
		System.out.println(Dog.testString==dog.testString);
		System.out.println("Why? Because: Dog.testString==dog.testString");
		
		
	}
	
}


