package tictactoegame;

public class TicTacToeGame {
	
	public static void main(String args[]) {
		
		UC1();
		
	}
	
	private static void UC1() {
		
		char[] board= new char[10];
		
		for (int a = 1; a < 10; a++) {
            board[a] = (char)a;
        }
		
		System.out.println(board);
		
	}
}
