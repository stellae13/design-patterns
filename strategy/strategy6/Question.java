package strategy6;

public class Question {
   private String question;
   private String[] answers;
   private int correctAnswer; 

   public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
       answers = new String[4];
       this.question = question;
       answers[0] = ans1;
       answers[1] = ans2;
       answers[2] = ans3;
       answers[3] = ans4;
       this.correctAnswer = correctAnswer;
   }

   public String toString() {
       return question + "\n" + 
              "1. " + answers[0] + "\n" +
              "2. " + answers[1] + "\n" +
              "3. " + answers[2] + "\n" +
              "4. " + answers[3];
   }

   public boolean isCorrect(int userAnswer) {
       return (userAnswer-1) == this.correctAnswer;
   }

   public String getCorrectAnswer() {
       return answers[this.correctAnswer];
   }
}
