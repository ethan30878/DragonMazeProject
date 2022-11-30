/* Name: Ethan Glenn
* File Name: GamePiece.java
* Date: 30 October, 2022
* Program Description: This class is dedicated to defining what a game piece is and how it functions on the board. */
public class GamePiece {
	
	private static int pieceCount = 0;
	private int row;
	private int col;
	private char symbol;
	
	public GamePiece() {
		row = col = -1;
		symbol = '\0';
		pieceCount++;
	}
	public GamePiece(GamePiece original) {
		row = original.row;
		col = original.col;
		symbol = original.symbol;
		pieceCount++;
	}
	public GamePiece(int row, int col, char symbol) {
		this.row = row;
		this.col = col;
		this.symbol = symbol;
		pieceCount++;
	}
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
	public boolean equals(GamePiece gp) {
		return (row == gp.row && col == gp.col && symbol == gp.symbol);
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
	public static int getPieceCount() {
		return pieceCount;
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
	public void finalize() {
		pieceCount--;
	}
}
