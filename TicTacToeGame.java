package tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
	
	public static void main(String args[]) {
		
		System.out.println("Let's Play Tic Tac Toe Game");
		//calling UC1 method
		ChooseXnO();
	}
	
	
	//choose method
	private static void ChooseXnO() {
		
		//constant
		final String playerwith_X = "X";
		
		//taking user input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Type X or O to choose:");
		String player = sc.next();
		
		//assign X or O to player and computer
		if (player.equals(playerwith_X))
			System.out.println("Player is X and computer is O");
		else
			System.out.println("Player is O and computer is X");
		
		
		//close scanner
		sc.close();
	}
	
}
