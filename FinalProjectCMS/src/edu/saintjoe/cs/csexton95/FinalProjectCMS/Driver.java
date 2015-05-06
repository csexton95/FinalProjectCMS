package edu.saintjoe.cs.csexton95.FinalProjectCMS;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mOne, mTwo, mTHree;
		
		mOne = newMammal("born", "Whale");
		mTwo = newMammal("born", "Cat");
		mThree = newMammal("born", "Human");
		
		System.out.println(mOne.toString());
		System.out.println(mTwo.toString());
		System.out.println(mThree.toString());
		
	}

}
