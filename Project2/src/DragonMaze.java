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
	
	/**
	 * Default constructor for DragonMaze class
	 */
	public DragonMaze() {
		rand = new Random(System.currentTimeMillis());
		board = null;
		hero = new GamePiece();
		princess = new GamePiece();
		dragon = new GamePiece();
	}
	
//	@SuppressWarnings("unused")
//	private void reset() {
//		
//	}
	
	/**
	 * Checks surroundings and moves the GamePiece to new spot;
	 * Can also allow user to win or lose game by checking certain conditions
	 * @param from represents GamePiece in initial position
	 * @param to represents temporary GamePiece in new position
	 * @return the temporary GamePiece with new position
	 */
	private GamePiece makeMove(GamePiece from, GamePiece to) {
	    if (board.getCharAt(to) == ' ' || board.getCharAt(to) == 'P' || board.getCharAt(to) == 'F') {
	        if (Character.toLowerCase(from.getSymbol()) == 'h') {
	            if (board.getCharAt(to) == 'P') {
	                hero.setSymbol('H');
	            }
	            if (board.getCharAt(to) == 'F') {
	                if (hero.getSymbol() == 'H') {
	                    System.out.println("\n******\nYou win! You saved the princess!\n******\n");
	                    System.exit(0);
	                }
	                System.out.println("\n******\nYou lose! You forgot to get the princess!\n******\n");
	                System.exit(0);
	            }
	        }
            board.setCharAt(to, from.getSymbol());
            board.setCharAt(from, ' ');
        }
		return to;
	}
	
	/**
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public boolean loadMazeFile(String fileName) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		StringBuilder boardSTR = new StringBuilder();
		while (in.ready())
			boardSTR.append(in.readLine() + '\n');
		in.close();
		board = new GameBoard(boardSTR.toString());
		hero = board.findGamePiece('h');
		princess = board.findGamePiece('P');
		dragon = board.findGamePiece('D');
		return true;
	}
	public void printMaze() {
		System.out.println(board);
		System.out.println(GamePiece.getPieceCount() + " pieces in play:");
		System.out.println(hero);
		System.out.println(princess);
		System.out.println(dragon);
		System.out.println("\nMake your move! Valid moves are W, A, S, D, or F to wait.");
	}
	public boolean moveHero(String direction) {
		GamePiece ghostHero = new GamePiece(hero);
		switch (direction) {
			case "up":
					ghostHero.moveUp();
				break;
			case "left":
					ghostHero.moveLeft();
				break;
			case "down":
					ghostHero.moveDown();
				break;
			case "right":
					ghostHero.moveRight();
				break;
			default:
				return false;
		}
		makeMove(hero, ghostHero);
		hero = board.findGamePiece(hero.getSymbol());
		ghostHero = null;
		return true;
	}
	public boolean moveDragon() {
		int randy = rand.nextInt(4);
		GamePiece ghostDragon = new GamePiece(dragon);
		switch (randy) {
			case 0:
				ghostDragon.moveUp();
				break;
			case 1:
				ghostDragon.moveLeft();
				break;
			case 2:
				ghostDragon.moveDown();
				break;
			case 3:
				ghostDragon.moveRight();
				break;
			default:
			    // Funny unreachable code
			    break;
		}
		makeMove(dragon, ghostDragon);
		ghostDragon = null;
        dragon = board.findGamePiece('D');
		return true;

	}
	public boolean gameOver() {
	    if (dragon.adjacentTo(hero)) {
            System.out.println("\n******\nYou lose! The dragon made you his dinner!\n******\n");
            return true;
        }
	    return false;
	}
}
