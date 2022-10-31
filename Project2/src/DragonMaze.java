/* Name: Ethan Glenn
* File Name: DragonMaze.java
* Date: 30 October, 2022
* Program Description: Main class harboring the loading & printing of the maze, movement, etc. */
import java.util.Random;
public class DragonMaze {
	
	private Random rand;
	private GameBoard board;
	private GamePiece hero;
	private GamePiece princess;
	private GamePiece dragon;
	
	public DragonMaze() {
		
	}
	@SuppressWarnings("unused")
	private void reset() {
		
	}
	@SuppressWarnings("unused")
	private GamePiece makeMove(GamePiece from, GamePiece to) {
		return null;
	}
	public boolean loadMazeFile(String filname) {
		return true;
	}
	public void printMaze() {
		
	}
	public boolean moveHero(String direction) {
		return true;
	}
	public boolean moveDragon() {
		return true;
	}
}
