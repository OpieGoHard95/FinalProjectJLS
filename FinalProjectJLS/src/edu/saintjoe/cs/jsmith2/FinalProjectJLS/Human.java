package edu.saintjoe.cs.jsmith2.FinalProjectJLS;

public class Human extends Mammal {
	public String career;
	
	public Human(String thisSpecies, String thisName, int thisAge, String thisCareer) {
		super(thisSpecies, thisName, thisAge);
		career = thisCareer;
	}

}
