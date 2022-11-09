/* Name: Ethan Glenn
* File Name: DragonMaze.java
* Date: 30 October, 2022
* Program Description: Main class harboring the loading & printing of the maze, movement, etc. */
import java.util.Random;
import java.io.*;
public class DragonMaze {
	
	private Random rand;
	private GameBoard board;
	private GamePiece hero;
	private GamePiece princess;
	private GamePiece dragon;
	
	public DragonMaze() {
		rand = new Random(System.currentTimeMillis());
		board = null;
		hero = new GamePiece();
		princess = new GamePiece();
		dragon = new GamePiece();
	}
	@SuppressWarnings("unused")
	private void reset() {
		
	}
	@SuppressWarnings("unused")
	private GamePiece makeMove(GamePiece from, GamePiece to) {
		return null;
	}
	public boolean loadMazeFile(String fileName) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		StringBuilder boardSTR = new StringBuilder();
		while (in.ready())
			boardSTR.append(in.readLine() + '\n');
		in.close();
	//	System.out.println(boardSTR);
		board = new GameBoard(boardSTR.toString());
		hero = board.findGamePiece('h');
		princess = board.findGamePiece('p');
		return true;
	}
	public void printMaze() {
		System.out.println(board);
		System.out.println(hero);
		System.out.println(princess);
		System.out.println(dragon);
		
	}
	public boolean moveHero(String direction) {
		// if player choice is to move, return true
		// if choice is to stay, return false
		return true;
	}
	public boolean moveDragon() {
		return true;
	}
}
