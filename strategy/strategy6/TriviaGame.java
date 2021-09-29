package strategy6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {
  private static TriviaGame triviaGame;
  private int score;
  private Random rand;
  private Scanner reader;
  private ArrayList<Question> questions;

  private TriviaGame() {
    questions = DataLoader.getTriviaQuestions();
    score = 0;
    rand = new Random();
    reader = new Scanner(System.in);
    System.out.println("Welcome to the Trivia Game!");
  }

  public static TriviaGame getInstance() {
      triviaGame = new TriviaGame();
      return triviaGame;
  }

  public void play() {
    boolean keepPlaying;
    char answer;
    boolean correct;

    do {
        correct = playRound();
        if(correct)
            score++;

        do {
        System.out.print("(P)lay or (Q)uit: ");
        answer = reader.next().charAt(0);

        if(answer != 'P' && answer != 'Q')
          System.out.println("Invalid entry! Please enter 'P' to keep playing or 'Q' to quit");
        
        } while (answer != 'P' && answer != 'Q');

        if(answer == 'P')
            keepPlaying = true;
        else 
            keepPlaying = false;  

    } while (keepPlaying);
    
    if(score == 1)
        System.out.println("You won " +  score + " game!");
    else
        System.out.println("You won " +  score + " games!");
    System.out.println("Thanks for playing! Goodbye!"); 
  }

  public boolean playRound() {
      int userAnswer;
      int ques = rand.nextInt(questions.size());
      System.out.println(questions.get(ques));
      do{

      System.out.println("Enter answer: ");
      userAnswer = reader.nextInt();
      
      if(userAnswer > 4 || userAnswer < 1)
        System.out.println("Invalid Entry! Please select an answer by entering 1, 2, 3, or 4");

      } while(userAnswer > 4 || userAnswer < 1);
      
        if(questions.get(ques).isCorrect(userAnswer)) {
            System.out.println("YAY! you got it right!");
            return true;
        } else {
            System.out.println("You got it wrong!");
            System.out.println("The correct answer is " + questions.get(ques).getCorrectAnswer());
            return false;
        }
  }

}
