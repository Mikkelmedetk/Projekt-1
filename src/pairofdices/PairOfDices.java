package pairofdices;

/**
 * This class models one pair of dices.
 *
 */
public class PairOfDices {
	/**
     * The first die in the pair.
     */
	private Die die1;
	/**
	 * The second die in the pair.
	 */
	private Die die2;
	
	/**
	 * Saves the sum of rolls
	 */
	
	private int sumOfRolls = 0;
	private int numberOfOneEyes = 0;
	private int numberOfTwoEyes = 0;
	private int numberOfThreeEyes = 0;
	private int numberOfFourEyes = 0;
	private int numberOfFiveEyes = 0;
	private int numberOfSixEyes = 0;
	private int numberOfEquals = 0;

	/**
	 * Constructor for objects of class PairOfDices
	 */
	public PairOfDices() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public PairOfDices(int sides1, int sides2) {
		die1 = new Die(sides1);
		die2 = new Die(sides2);
	}
	
	public void rollBothDices() {
		die1.roll();
		die2.roll();
		sumOfRolls++;
		setHighestDie();
		countDies(die1);
		countDies(die2);
	}
	
	
	public int sumOfDices() {
		return die1.getFaceValue() + die2.getFaceValue();
	}
	
	public void setHighestDie() {
		int highestDie = 0;
		if (die1.getFaceValue() > die2.getFaceValue()) {
			highestDie = die1.getFaceValue();
		} else  {
			highestDie = die2.getFaceValue();
		}
	}
	
	public void countDies(Die kast) {
		switch(kast.getFaceValue()) {
		case 1: numberOfOneEyes++;
		case 2: numberOfTwoEyes++;
		case 3: numberOfThreeEyes++;
		case 4: numberOfFourEyes++;
		case 5: numberOfFiveEyes++;
		case 6: numberOfSixEyes++;
		}
	}
	
	
	public String getNumberOfEyes() {
		return "Antal 1ere" + numberOfOneEyes + "Antallet af to øjne" + numberOfTwoEyes + "Antallet af tre øjne" + numberOfThreeEyes + "Antallet af fire øjne" + numberOfFourEyes + " Antallet af fem øjne" + numberOfFiveEyes + "Antallet af seks øjne" + numberOfSixEyes; 
	}
	
	public String getNumberOfEquals() {
		return "Antallet af ens øjne" + numberOfEquals;
	}
	
	public int getDie1Value() {
		return die1.getFaceValue();
	}
	
	public int getDie2Value() {
		return die2.getFaceValue();
	}
	
	public void resetPairOfDice() {
		this.sumOfRolls = 0;
		this.numberOfOneEyes = 0;
		this.numberOfTwoEyes = 0;
		this.numberOfThreeEyes = 0;
		this.numberOfFourEyes = 0;
		this.numberOfFiveEyes = 0;
		this.numberOfSixEyes = 0;
		this.numberOfEquals = 0;
	}
	
	

}
