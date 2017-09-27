class Animal {
	int health = 100;
}

class Mammal extends Animal {
	
}

class Cat extends Mammal {
	String color="Brown";
}

class Dog extends Mammal {
}

public class Test_cast {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.health);
		
		Dog d = new Dog();
		System.out.println(d.health);
	}
}
//When running the Test class, it will print "100" and "100" to the console, 
//because both, Cat and Dog inherited the "health" from Animal class.