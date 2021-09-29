package strategy6;

/**
 * Question class
 * the data associated with a single question
 */
public class Question {
   private String question; // the question
   private String[] answers; // the answer options
   private int correctAnswer; // the index of the correct answer

   /**
    * Question constructor
    * sets all of the attributes for a Question
    * @param question String the question being asked
    * @param ans1 String the first option
    * @param ans2 String the second option
    * @param ans3 String the third option
    * @param ans4 String the fourth option
    * @param correctAnswer indexOf the correct answer (if it is ans1, this will equal 0)
    */
   public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
       this.question = question;
       this.answers = new String[4]; // 4 possible correct answers
       this.answers[0] = ans1;
       this.answers[1] = ans2;
       this.answers[2] = ans3;
       this.answers[3] = ans4;
       this.correctAnswer = correctAnswer;
   }
   /**
    * toString method
    * @return String the question printed out in the style
    * specified by the assignment 
    */
   public String toString() {
       return question + "\n" + 
              "1. " + answers[0] + "\n" +
              "2. " + answers[1] + "\n" +
              "3. " + answers[2] + "\n" +
              "4. " + answers[3];
   }

   /**
    * isCorrect method
    * sees if the user selected the right answer out of the array of answers
    * @param userAnswer int- what number the user seleceted
    * @return boolean - true if the user selected the right answer, false otherwise
    */
   public boolean isCorrect(int userAnswer) {
       return (userAnswer-1) == this.correctAnswer; // userAnswer - 1 because the answers start at 1 in the toString and 0 in the array
   }

   /**
    * getCorrectAnswer
    * returns the String stored at [correctAnswer] (so the correct answer)
    * @return String the correct answer for this question
    */
   public String getCorrectAnswer() {
       return answers[this.correctAnswer];
   }
}
