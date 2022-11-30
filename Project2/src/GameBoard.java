/* Name: Ethan Glenn
* File Name: GameBoard.java
* Date: 30 October, 2022
* Program Description: This particular class controls the game board and identifies what goes on in the board itself. */
public class GameBoard {
	
	private int numRows;
	private int numCols;
	char[][] board;
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
	
	public boolean setCharAt(GamePiece piece, char newSymbol) {
		int row = piece.getRow();
		int col = piece.getCol();
		if (row >= 0 && row <= numRows && col >= 0 && col < numCols) {
			board[row][col] = newSymbol;
			return true;
		}
		return false;
	}
	
	public char getCharAt(GamePiece piece) {
		int row = piece.getRow();
		int col = piece.getCol();
		char charAt = '\0';
		if (row >= 0 && row <= numRows && col >= 0 && col < numCols)
			charAt = board[row][col];
		return charAt;
	}
	
	public int getRow() {
		return numRows;
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
		for (int row = 0; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				if (board[row][col] == symbol) {
					return new GamePiece(row, col, symbol);
				}
			}
		}
		return null;
	}
}
