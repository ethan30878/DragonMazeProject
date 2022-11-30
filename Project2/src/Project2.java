/* Name: Ethan Glenn
* File Name: Project2.java
* Date: 4 November, 2022
* Program Description: Executes maze game. */
import java.util.Scanner;
import java.io.*;

public class Project2 {

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
		boolean win = false;

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
				default:
					game.moveHero("");
					break;
			}

			// Moves dragon
			game.moveDragon();

		}

		// Need to make figure out how to set win condition
		if (win)
			System.out.println("You won the game! Hooray! :)");
		else
			System.out.println("You lost the game! Oh no! :(");
		
		input.close();
	}

}
