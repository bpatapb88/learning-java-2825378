import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "Who is the best?";
        String choiceOne = "you";
        String choiceTwo = "me";
        String choiceThree = "somebody else";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
System.out.println("Choose one of the following: " + choiceOne + "," + choiceTwo +
        " or " + choiceThree);
        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();
        // If the user's input matches the correctAnswer...
        if (correctAnswer.equals(input.toLowerCase())){
            System.out.println("Correct!");
        } else {
            System.out.println("Not correct");
        }
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
