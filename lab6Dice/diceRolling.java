package lab6Dice;

import java.util.*;

public class diceRolling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int sidesDice;
		int rollCount = 1;
		String userInput;

		
		System.out.println("Welcome to the Grand Circus Casino!");


		do {
			System.out.println();
			System.out.println("How many sides should each dice have? ");
			sidesDice = scnr.nextInt();
			System.out.println("Roll " + rollCount + ":");
			
			int dice1 = generateRandomDiceRoll(sidesDice);
			int dice2 = generateRandomDiceRoll(sidesDice);

			System.out.println(dice1);
			System.out.println(dice2);


			boxCars(dice1, dice2);
			snakeEyes(dice1, dice2);
			craps(dice1, dice2);



			System.out.println("Roll again? (y/n):" );
			userInput = scnr.next();
			++rollCount;
		}
		while(userInput.equals("y") || userInput.equals("Y"));
		System.out.println("Thank you for playing!");
		scnr.close();
	}


	public static int generateRandomDiceRoll(int numOfSides) {
		Random rand = new Random();
		return (rand.nextInt(numOfSides - 1) + 1);

	}



	public static void boxCars(int dice1, int dice2) {
		if (dice1 == 6 && dice2 == 6) {
			System.out.println("box cars");
		}
	}

	public static void snakeEyes(int dice1, int dice2){ 
		if(dice1 == 1 && dice2 == 1) { 
			System.out.println("Snake Eyes");
		}	
	}	


	public static void craps (int dice1, int dice2) {
		if ((dice1 == 2 && dice2 == 3) || (dice2 == 2 && dice1 == 3)){
			System.out.println("CRAPS" );
		}
	}


}
