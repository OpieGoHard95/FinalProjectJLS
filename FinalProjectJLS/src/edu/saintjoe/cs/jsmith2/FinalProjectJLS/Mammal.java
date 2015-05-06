package edu.saintjoe.cs.jsmith2.FinalProjectJLS;

public class Mammal {
	public String species;
	public String name;
	public int age;

	Mammal() {
		species = "No species indicated";
		name = "unnamed";
		age = 0;
	}
	
	Mammal(String thisSpecies, String thisName, int thisAge) {
		species = thisSpecies;
		name = thisName;
		age = thisAge;
	}
	
	Mammal(String thisSpecies, String thisName) {
		this();
		species = thisSpecies;
		name = thisName;
	}
	
	Mammal(String thisSpecies) {
		this();
		species = thisSpecies;
	}
	
	public String toString() {
		String output = "";
		output = "This animal is a " + species + " named " + " and it is " + " years old!";
		return output;
	}

}