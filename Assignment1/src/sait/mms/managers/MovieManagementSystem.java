package sait.mms.managers;
import java.util.*;
import sait.mms.problemdomain.Movie;

public class MovieManagementSystem {
	private Scanner keyboard;
	private ArrayList<Movie> movies;
	public static final String DIR_PATH = "res/movies.txt";

	public MovieManagementSystem()
			throws java.io.FileNotFoundException {
	}

	public void addMovie​(int duration, String title, int year) {
		ArrayList<Movie> movies;
		String addMovie = keyboard.next();
		movies.add(addMovie);
	}

	public void displayMenu() {

	}

	public void generateMoviesInYear​(int year) {
		try (Scanner input = new Scanner("res/movies.txt"))
		{
			while (input.hasNext()) {
				int duration = input.nextInt();
				String title = input.nextLine();
				int year2 = input.nextInt();
				if (year2 == year) System.out.println(title + duration);
			}
		}
	}


	public void generateRandomMovies​(int count) {

	}

	public void loadMovies() throws java.io.FileNotFoundException {
		Scanner input = new Scanner("res/movies.txt"); {
		ArrayList<Movie> movies;
		while (input.hasNext()){
		    movies.add(input.next());
		}
		input.close();
		}
		}
	

	public void writeMoviesToFile() {

	}
}
