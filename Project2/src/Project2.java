/* Name: Ethan Glenn
* File Name: Project2.java
* Date: 4 November, 2022
* Program Description: Executes the maze game and checks for maze file. */
import java.util.Scanner;
import java.io.*;

public class Project2 {
    
    /**
     * The main method for the primary class of program, effectively checks for maze file, loads, and runs the game
     * @param args contains the name of the default maze file used
     * @throws Exception
     */
	public static void main(String[] args) throws Exception { // java Project2 maze.txt, Run Config -> maze.txt
		Scanner input = new Scanner(System.in);
		DragonMaze game = new DragonMaze();
		String mazeFile = "";

		if (args.length > 0) {
			mazeFile = args[0];

		} else {
			System.out.println("No command line argument entered. Please enter the name of the maze file: ");
			mazeFile = input.nextLine();
		}
		
		boolean gameOver = false;

		System.out.println("Reading file: " + mazeFile);
		game.loadMazeFile(mazeFile); 
		
		while (!gameOver) {

			// Print the maze
			game.printMaze();

			// Obtain user input and move the hero
			switch ((char) input.next().charAt(0)) {
				case 'w':
					game.moveHero("up");
					break;
				case 'a':
					game.moveHero("left");
					break;
				case 's':
					game.moveHero("down");
					break;
				case 'd':
					game.moveHero("right");
					break;
				case 'f':
				    System.out.println("You chose to wait!");
				    game.moveHero("");
				    break;
				default:
					System.out.println("Invalid input. You automatically waited.");
					game.moveHero("");
					break;
			}
			// Moves dragon
			game.moveDragon();
			
			if (game.gameOver() == true)
			    gameOver = true;
		}
		input.close();
	}
}
