package edu.saintjoe.cs.jsmith2.FinalProjectJLS;

public class Mammal {
	public String species;
	public String name;
	public int age;

	Mammal() {
		species = "No species indicated";
		name = "no name";
		age = 1;
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
		output = "This animal is a " + species + " named " + name + " and it is " + age + " years old!";
		return output;
	}

}