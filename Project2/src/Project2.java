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

		System.out.println("Reading file: " + mazeFile);

		game.loadMazeFile(mazeFile);
		game.printMaze();

		input.close();
	}

}
