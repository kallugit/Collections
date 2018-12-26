package inheritance;

public class Dog extends Animal {
	
	int numberOfEyes; 
		
	//method overloading
	public Dog() {}
	
	//method overloading
	public Dog(int eyes) {
		this.numberOfEyes = eyes;
	}
	
	public Dog(int ooooo, int xxx, String xx) {}
	
	
	//method Overriding
	public String numberLegs()
	{
		return "4";
		
	}
	
	public String animalDie(String name) {
		return "Died";
	}

	//method overloading
	public String numberLegs(int addNumber )
	{
		return String.valueOf(Integer.valueOf(numberLegs()) + addNumber);
		
	}
	
	 public static void main(String args[]) {
//		Animal animal = new Animal();
		Animal dog = new Dog(5);
		System.out.println(dog.getSound("baubau"));
		
		System.out.println(dog.numberLegs());
		
//		System.out.println(animal.numberLegs());
		
//		dog.animalDie();
//		dog.numberOfEyes;
		
		dog.animalDontDie();
		
		Dog dog2 = new Dog(7);
		System.out.println(dog2.numberOfEyes);
//		System.out.println(dog2.animalDie());
		dog2.animalDontDie();

	}

	@Override
	public String numberOfEyes() {
		// TODO Auto-generated method stub
		return "2";
	}
	 
	
	
}
