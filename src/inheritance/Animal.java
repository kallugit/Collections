package inheritance;

public abstract class Animal {
		
	public String getSound(String sound)
	{
		return sound;	
	}
	
	public String numberLegs() {
		return "2";
	}
	
	public String animalDontDie() {
		return " dont die";
	}
	
	public abstract String numberOfEyes();
	
}
