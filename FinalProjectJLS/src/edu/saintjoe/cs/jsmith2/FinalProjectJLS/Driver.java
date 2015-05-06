package edu.saintjoe.cs.jsmith2.FinalProjectJLS;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal testMammal = new Mammal();
		System.out.println(testMammal.toString());
		Mammal whale = new Mammal("whale", "Jeffery", 23);
		System.out.println(whale.toString());
		Human jared = new Human("Human", "Jared", 19, "Computer Scientist");
		System.out.println(jared.toString());
	}

}
