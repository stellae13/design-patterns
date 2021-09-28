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
    play();
  }

  public static TriviaGame getInstance() {
      return new TriviaGame();
  }

  public void play() {
    boolean keepPlaying = true;
    String answer;
    boolean correct;

   
    while(keepPlaying) {
        correct = playRound();
        if(correct)
            score++;

        System.out.println("(P)lay or (Q)uit: ");
        answer = reader.nextLine();
        
        if(answer.equals("P"))
            keepPlaying = true;
        else 
            keepPlaying = false;
            
    }
    System.out.println("You won " +  score + " game(s)!");
    System.out.println("Thanks for playing! Goodbye");
  }

  public boolean playRound() {
      int ques = rand.nextInt(questions.size());
      System.out.println(questions.get(ques));
      System.out.println("Enter answer: ");
      int userAnswer = reader.nextInt();
      
        if(questions.get(ques).isCorrect(userAnswer)) {
            System.out.println("YAY! you got it right!");
            return true;
        } else {
            System.out.println("You got it wrong!");
            System.out.println("The correct answer is" + questions.get(ques).getCorrectAnswer());
            return false;
        }
  }

}
