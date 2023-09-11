
public class Dog { // class header, defines the Datatype
	
	//a class is a blueprint for creating OBJECTS
	//objects have properties like the examples below
	private String name;
	private String breed;
	//default constructor
	public Dog() { //constructors take the name of the class
		//the job of a constructor is to assign values to the attributes
		//initializes the variable
		name = "Jack";
		breed = "French Bulldog";
	}
	//another constructor, again take note that there is no return type and is named after the class name
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	//after the constructors you will typically see the methods
	//"behaviors" - methods/functions
	public void bark() {
		System.out.println("Woof");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public static void main(String[] arg) {
		Dog d = new Dog("lilzheng", "goober");
		
		String kyle = d.getName(); 
		System.out.println(kyle);
		
		Dog jak = new Dog("Jak", "dog");
		System.out.println(jak.getName());
		for (int i = 0; i == 0; i+=1) {jak.bark();}
		Dog alex = new Dog("alex","poodle");
		System.out.println(alex.getBreed());
	}
}
