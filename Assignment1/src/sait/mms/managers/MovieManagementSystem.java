package sait.mms.managers;
import java.util.*;
import sait.mms.problemdomain.Movie;

public class MovieManagementSystem {
	private Scanner keyboard;
	private ArrayList<Movie> movies = new ArrayList<Movie>();
	public static final String DIR_PATH = "res/movies.txt";

	public MovieManagementSystem()
			throws java.io.FileNotFoundException {
	}

	public void addMovie​(int duration, String title, int year) {
		movies.add(new Movie(keyboard.nextInt(), keyboard.next(), keyboard.nextInt()));
	}

	public void displayMenu() {
		System.out.println("1.	Add a new movie.");
		System.out.println("2.	Generate list of movies released in a year.");
		System.out.println("3.	Generate list of random movies.");
		System.out.println("4.	Exit the program.");
	}

	public void generateMoviesInYear​(int year) {
		try (Scanner input = new Scanner("res/movies.txt"))
		{
			while (input.hasNext()) {
				int duration = input.nextInt();
				String title = input.nextLine();
				int year2 = input.nextInt();
				if (year2 == year) System.out.println(title + ", " + duration);
			}
		}
	}


	public void generateRandomMovies​(int count) {

	}

	public void loadMovies() throws java.io.FileNotFoundException {
		Scanner input = new Scanner(DIR_PATH); {
			while (input.hasNext()) {
				input.useDelimiter(",");
				movies.add(new Movie( input.nextInt(), input.next(), input.nextInt()));
			}
			input.close();
		}
	}

	public void writeMoviesToFile() {

	}
}
