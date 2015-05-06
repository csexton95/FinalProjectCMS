package edu.saintjoe.cs.csexton95.FinalProjectCMS;

public class Mammal {
	
	private int babies;
	private String name;
	
	public Mammal (String mammalName, int mammalBabies) {
		name = mammalName;
		babies = mammalBabies;
		}
	
	public String toString() {
		return name  + "=" + babies + "'";
	}

	public String getName() {
		String name;
	}
	
	public int getBabies() {
		int babies;
	}
	
	public void setName(String newName) {
		name = newName;
	}
}
