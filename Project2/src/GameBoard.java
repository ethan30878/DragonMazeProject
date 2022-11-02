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
		numCol = mazeArray[0].length();
		for (String line : mazeArray)
			System.out.println(line);
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
		return null;
	}
	public GamePiece findGamePiece(char symbol) {
		return null;
	}
}
