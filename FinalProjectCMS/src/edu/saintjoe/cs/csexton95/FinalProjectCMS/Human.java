package edu.saintjoe.cs.csexton95.FinalProjectCMS;

public class Human extends Mammal {
	private Human newHuman;
	public Human(String name, int babies) {
		super(name, babies);
		}

	public Human setBabies (Human newBabies) {
		super.setBabies(newBabies.toString());
		Human oldBabies = newHuman;
		newHuman = newBabies;
		return oldBabies;
		}
	
	
}
