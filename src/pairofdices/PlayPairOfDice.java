package pairofdices;

import java.util.Scanner;

public class PlayPairOfDice {
	private Scanner scan;
	private PairOfDices pairDie;
	
	public PlayPairOfDice() {
		pairDie = new PairOfDices();
		scan = new Scanner(System.in);
	}
	
	private void welcomeToGame() {
		System.out.println("Velkommen til spillet KAST terning");
	}
	
	private void gameOver() {

		System.out.println("Tak for spillet du kastede " + pairDie.sumOfDices() + " "
				+ "gange.");
		scan.close();
	}
	
	private void takeTurn() {
		pairDie.rollBothDices();
		int rollDice = pairDie.getDie1Value() + pairDie.getDie2Value();
		  
		System.out.println("Du har kastet: " + rollDice);
	}
	
	public void startGame() {
		welcomeToGame();

		boolean finished = false;

		while (!finished) {
			System.out.println("Vil du kaste en terning? Angiv Ja eller Nej: ");
			String goOn = scan.nextLine();
			if (goOn.equalsIgnoreCase("Nej")) {
				finished = true;
			} else {
				takeTurn();
			}
		}
		gameOver();
	}
		
		
		
	}
	

