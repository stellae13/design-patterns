package strategy6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * TriviaGame class
 * Singleton - you can only have one instance 
 * of this class
 */
public class TriviaGame {
  private static TriviaGame triviaGame; // static singleton object
  private int score; // user score
  private Random rand; // in order to randomize the question selection
  private Scanner reader; // read user input
  private ArrayList<Question> questions; // arrayList of questions read in using the DataLoader

  /**
   * Private TriviaGame constructor
   * private to ensure the Singleton design pattern
   */
  private TriviaGame() {
    questions = DataLoader.getTriviaQuestions(); // loads the questions in from the text file
    score = 0; // initializes the score
    rand = new Random(); // initializes the Random object
    reader = new Scanner(System.in); // initializes the Scanner object
    System.out.println("Welcome to the Trivia Game!"); // Prints out welcome message
  }

  public static TriviaGame getInstance() {
      triviaGame = new TriviaGame(); // creates the one instance of the class
      return triviaGame; // returns this instance
  }

  /**
   * Play method (void)
   * Runs the game as long as the user wants
   */
  public void play() {
    boolean keepPlaying; // will be used to continue or end the game
    char answer; // the answer to if the user wants to keep playing
    boolean correct; // did the user get the correct answer

    do {
        correct = playRound(); // playRound returns true if they got it right and false otherwise
        if(correct)
            score++;

        do {
        System.out.print("(P)lay or (Q)uit: ");
        answer = reader.next().charAt(0); // reads in the char

        if(answer != 'P' && answer != 'Q')
          System.out.println("Invalid entry! Please enter 'P' to keep playing or 'Q' to quit"); // if they didn't enter P or Q
        
        } while (answer != 'P' && answer != 'Q');

        if(answer == 'P')
            keepPlaying = true; // the user wants to keep playing
        else 
            keepPlaying = false; // the user does not want to keep playing

    } while (keepPlaying); // while the user wants to keep playing

    if(score == 1)
        System.out.println("You won " +  score + " game!"); // 1 win is singular
    else
        System.out.println("You won " +  score + " games!"); // plural otherwise
    System.out.println("Thanks for playing! Goodbye!"); 
  }

  /**
   * playRound method
   * plays a single round of trivia, asking one question
   * @return boolean - true if the user got the answer correct, false if they got it wrong
   */
  public boolean playRound() {
      int userAnswer; // the answer the user selects (number)
      int ques = rand.nextInt(questions.size()); // randomizes the question selection
      System.out.println(questions.get(ques)); // prints out the randomized question 

      do{
      System.out.println("Enter answer: ");
      userAnswer = reader.nextInt();
      
      if(userAnswer > 4 || userAnswer < 1) // makes sure that the answer selection is valid 
        System.out.println("Invalid Entry! Please select an answer by entering 1, 2, 3, or 4");

      } while(userAnswer > 4 || userAnswer < 1);
      
        if(questions.get(ques).isCorrect(userAnswer)) { // if the user got it right 
            System.out.println("YAY! you got it right!");
            return true;
        } else { // if the user got it wrong
            System.out.println("You got it wrong!"); 
            System.out.println("The correct answer is " + questions.get(ques).getCorrectAnswer());
            return false;
        }
  }

}
