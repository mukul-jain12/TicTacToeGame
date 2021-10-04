package tictactoegame;

public class TicTacToeGame {
	
	public static void main(String args[]) {
		
		System.out.println("Let's Play Tic Tac Toe Game");
		//calling UC1 method
		UC1();
	}
	
	private static void UC1() {
		
		//define array
		char[] board= new char[10];
		
		//assign elements in empty array
		for (int a = 1; a < 10; a++) {
		    board[a] = (char)a;
		}
		
		System.out.println(board);
		
	}
}
