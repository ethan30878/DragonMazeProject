/* Name: Ethan Glenn
* File Name: GamePiece.java
* Date: 30 October, 2022
* Program Description: This class is dedicated to defining what a game piece is and how it functions on the board. */
public class GamePiece {
	
	private int row;
	private int col;
	private char symbol;
	
	public GamePiece() {
		row = col = -1;
		symbol = '\0';
	}
	public GamePiece(GamePiece original) {
		
	}
	public GamePiece(int row, int col, char symbol) {
		this.row = row;
		this.col = col;
		this.symbol = symbol;
	}
	public String toString() {
		// switch statement
		return null;
	}
	public boolean equals(GamePiece gp) {
		return true;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	public void moveUp() {
		row--;
	}
	public void moveDown( ) {
		row++;
	}
	public void moveLeft() {
		col--;
	}
	public void moveRight() {
		col++;
	}
	public boolean adjacentTo(GamePiece check) {
		return true;
	}
}
