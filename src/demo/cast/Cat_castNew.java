package demo.cast;

class Dogs extends Mammal {
    String furColor;	  
    int speed;
    int barkVolume;
    int puppies = 0;
	  
    Dogs(String f, int n, int s, int b){
        this.furColor = f;		  
        this.speed = s;
        this.puppies=n;
        this.barkVolume = b;		  
    }	
    public String toString(){
    	return "Color is"+furColor+"speed is"+speed+"bark Volume is"+barkVolume+"number is"+puppies;
    }
}
public class Cat_castNew extends Mammal {
    String furColor;
    int numberOfLives;
    int speed;
    int balance;
    int kittens = 10;
	  
    Cat_castNew(String f, int n, int s, int b){
        this.furColor = f;
        this.numberOfLives = n;
        this.speed = s;
        this.balance = b;		  
    }	  

    public Dogs toDog(int barkVolume){		  
        Dogs d = new Dogs(furColor, speed, numberOfLives,barkVolume);
        d.puppies = kittens;
        return d;		  
    }
	public static void main(String[] args) {
		 Cat_castNew c = new Cat_castNew("black", 9, 20, 40);
		    Dogs d = c.toDog(50);	
		    System.out.println(c.toDog(50));
		    
		    Cat_cast b=new Cat_cast("black", 9, 20, 40);
		    
	}

}
