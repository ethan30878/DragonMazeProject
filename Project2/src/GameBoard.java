/* Name: Ethan Glenn
* File Name: GameBoard.java
* Date: 30 October, 2022
* Program Description: This particular class controls the game board and identifies what goes on in the board itself. */
public class GameBoard {
	
	private int numRows;
	private int numCols;
	private char[][] board;
	final String MAZE_STR = "";
	
	public GameBoard(String boardStr) {
		String[] mazeArray = boardStr.split("\n");
		numRows = mazeArray.length;
		numCols = mazeArray[0].length();
		board = new char[numRows][numCols];
		for (int i = 0; i < numRows; i++) {
			board[i] = mazeArray[i].toCharArray();
		}
	}
	
	public void setCharAt(GamePiece piece, char newSymbol) {
	}
	
	public char getCharAt(GamePiece piece) {
		return 0;
	}
	
	public int getRow() {
		return -1;
	}
	
	// Returns a string containing the current state of the board.
	public String toString() {
		
		StringBuilder output = new StringBuilder();
		
		for (char[] row : board) {
			for (char col : row) {
				output.append(col);
			}
			output.append("\n");
		}
		
		return output.toString();
	}
	
	// Finds game piece on the board and creates a game piece object for its data.
	public GamePiece findGamePiece(char symbol) {
		char c;
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				c = board[row][col];

				if (c == symbol) {
					return new GamePiece(row, col, c);
				}
			}
		}
		return null;
	}
}
