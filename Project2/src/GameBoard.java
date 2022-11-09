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
	public String toString() {
		StringBuilder output = new StringBuilder();
		for (char[] row : board)
			for (char col : row)
				output.append(col);
			output.append("\n");
//		for (int i = 0; i < numRows; i++)
//			for (int j = 0; j < numCols; j++)
//				output.append(board[i][j]);
//			output.append("\n");
		return output.toString();
	}
	public GamePiece findGamePiece(char symbol) {
		return null;
	}
}
