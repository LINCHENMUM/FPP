class Animal {
	int health = 100;
}

class Mammal extends Animal {

}

class Cat extends Mammal {
	String color = "Brown";

	public void getColor() {
		System.out.println(color);
	}
}

class Dog extends Mammal {
}

public class Test_cast {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.health);

		Dog d = new Dog();
		System.out.println(d.health);
		Animal a = c; // upcasting to animal
		//a.getColor();//as getColor is no not available to a
		
		//Cat c1=(Animal)a;//Animal cannot be casted as Cat
		Cat c1=(Cat)a;// down casting to cat

		c1.getColor();
	}
}
// When running the Test class, it will print "100" and "100" to the console,
// because both, Cat and Dog inherited the "health" from Animal class.