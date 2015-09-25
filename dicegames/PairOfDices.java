package dicegames;

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
	 * Constructor for objects of class PairOfDices
	 */
	public PairOfDices() {
		die1 = New Die();
		die2 = New Die();
	}
	
	public PairOfDices(int sides1, int sides2) {
		die1 = New Die(sides1);
		die2 = New Die(sides2);
	}
	

}
