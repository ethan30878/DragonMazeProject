/* Name: Ethan Glenn
* File Name: GamePiece.java
* Date: 30 October, 2022
* Program Description: This class is dedicated to defining what a game piece is and how it functions on the board. */
public class GamePiece {
	
	private static int pieceCount = 0;
	private int row;
	private int col;
	private char symbol;
	
	/**
	 * Default constructor for GamePiece class
	 */
	public GamePiece() {
		row = col = -1;
		symbol = '\0';
		pieceCount++;
	}
	
	/**
	 * Copy constructor for GamePiece class
	 * @param original acts as parameter for GamePiece to copy
	 */
	public GamePiece(GamePiece original) {
		row = original.row;
		col = original.col;
		symbol = original.symbol;
		pieceCount++;
	}
	
	/**
	 * Main constructor for GamePiece class, takes position and symbol to indicate GamePiece
	 * @param row captures the row value
	 * @param col captures the column value
	 * @param symbol indicates the single character of the piece on the game board
	 */
	public GamePiece(int row, int col, char symbol) {
		this.row = row;
		this.col = col;
		this.symbol = symbol;
		pieceCount++;
	}
	
	/**
	 * toString override method for GamePiece class 
	 * @return name of GamePiece and its position based on the single character symbol
	 */
	public String toString() {
		String type = "";
		switch (symbol) {
			case 'h':
			case 'H':
				type = "Hero";
				break;
			case 'D':
				type = "Dragon";
				break;
			case 'P':
				type = "Princess";
				break;
			default:
				type = null;
		}
		return type + ": (" + row + ", " + col + ")";
	}
	
	/**
	 * Checks whether two GamePieces are effectively duplicate
	 * @param gp acts as GamePiece being compared
	 * @return boolean value based on if GamePieces are equal or not
	 */
	public boolean equals(GamePiece gp) {
		return (row == gp.row && col == gp.col && symbol == gp.symbol);
	}
	
	/**
	 * @return row position of GamePiece
	 */
	public int getRow() {
		return row;
	}
	
	/**
	 * @return column position of GamePiece
	 */
	public int getCol() {
		return col;
	}
	
	/**
	 * @return single character symbol of GamePiece
	 */
	public char getSymbol() {
		return symbol;
	}
	
	/**
	 * @return number of GamePieces on board
	 */
	public static int getPieceCount() {
		return pieceCount;
	}
	
	/**
	 * Sets new symbol for GamePiece
	 * @param symbol represents the new symbol
	 */
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Decrements row value of GamePiece; moves it up
	 */
	public void moveUp() {
		row--;
	}
	
	/**
	 * Increments row value of GamePiece; moves it down
	 */
	public void moveDown( ) {
		row++;
	}
	
	/**
	 * Decrements column value of GamePiece; moves it left
	 */
	public void moveLeft() {
		col--;
	}
	
	/**
	 * Increments column value of GamePiece; moves it right
	 */
	public void moveRight() {
		col++;
	}
	
	/**
	 * Checks if one GamePiece is adjacent to another GamePiece
	 * @param check is the GamePiece chosen for comparison
	 * @return boolean value based on if GamePiece is adjacent to other or not
	 */
	public boolean adjacentTo(GamePiece check) {
		GamePiece up = new GamePiece(this);
		up.moveUp();
		GamePiece down = new GamePiece(this);
		down.moveDown();
		GamePiece left = new GamePiece(this);
		left.moveLeft();
		GamePiece right = new GamePiece(this);
		right.moveRight();
		return up.equals(check) || left.equals(check) || down.equals(check) || right.equals(check);
	}
	
	/**
	 * Override finalize method for GamePiece class
	 */
	public void finalize() {
		pieceCount--;
	}
}
