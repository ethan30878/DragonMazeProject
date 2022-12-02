/* Name: Ethan Glenn
* File Name: GameBoard.java
* Date: 30 October, 2022
* Program Description: Controls the game board and identifies what goes on in the board itself. */
public class GameBoard {
	
	private int numRows;
	private int numCols;
	char[][] board;
	final String MAZE_STR = "";
	
	/**
	 * Main constructor for GameBoard class
	 * Takes boardStr and converts it to a 2D array to act as the game board
	 * @param boardStr represents the raw maze file string
	 */
	public GameBoard(String boardStr) {
		String[] mazeArray = boardStr.split("\n");
		numRows = mazeArray.length;
		numCols = mazeArray[0].length();
		board = new char[numRows][numCols];
		for (int i = 0; i < numRows; i++) {
			board[i] = mazeArray[i].toCharArray();
		}
	}
	
	/**
	 * Sets a character at a new position on the GameBoard if the space is available 
	 * @param piece is the GamePiece to be moved
	 * @param newSymbol is the single character to be set in new location
	 * @return boolean value based on success or failure of being able to set character in new spot
	 */
	public boolean setCharAt(GamePiece piece, char newSymbol) {
		int row = piece.getRow();
		int col = piece.getCol();
		if (row >= 0 && row <= numRows && col >= 0 && col < numCols) {
			board[row][col] = newSymbol;
			return true;
		}
		return false;
	}
	
	/**
	 * Retrieves the character at position of GamePiece on board
	 * @param piece represents the GamePiece being utilized
	 * @return the character of a valid position on the GameBoard, otherwise null
	 */
	public char getCharAt(GamePiece piece) {
		int row = piece.getRow();
		int col = piece.getCol();
		char charAt = '\0';
		if (row >= 0 && row <= numRows && col >= 0 && col < numCols)
			charAt = board[row][col];
		return charAt;
	}
	
	/**
	 * @return number of rows on board
	 */
	public int getRow() {
		return numRows;
	}
	
	/**
	 * @return a string containing the current state of the board
	 */
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
	
	/**
	 * Finds game piece on the board and creates a GamePiece object for its data
	 * @param symbol represents the character symbol of the GamePiece to be found
	 * @return GamePiece, provided it is found; else null
	 */
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
