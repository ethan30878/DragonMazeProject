/* Name: Ethan Glenn
* File Name: GamePiece.java
* Date: 30 October, 2022
* Program Description: This class is dedicated to defining what a game piece is and how it functions on the board. */
public class GamePiece {
	
	private int row;
	private int col;
	private char symbol;
	
	public GamePiece() {
		
	}
	public GamePiece(GamePiece original) {
		
	}
	public GamePiece(int row, int col, char symbol) {
		
	}
	public String toString() {
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
		
	}
	public void moveDown( ) {
		
	}
	public void moveLeft() {
		
	}
	public void moveRight() {
		
	}
	public boolean adjacentTo(GamePiece check) {
		return true;
	}
}
