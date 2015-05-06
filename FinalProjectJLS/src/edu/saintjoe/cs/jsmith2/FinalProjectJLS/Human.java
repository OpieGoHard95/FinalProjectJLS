package edu.saintjoe.cs.jsmith2.FinalProjectJLS;

public class Human extends Mammal {
	public String career;
	
	public Human(String thisSpecies, String thisName, int thisAge, String thisCareer) {
		super(thisSpecies, thisName, thisAge);
		career = thisCareer;
	}
	
	public String toString() {
		String output = "";
		output = "This animal is a " + species + " named " + name + " and it is " + age + " years old. It has chosen " + career + " as a career path.";
		return output;
	}

}
