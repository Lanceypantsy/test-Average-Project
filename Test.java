
/**
 * A program to find the average test score for five tests given to a single user.
 *
 * @Lance Barto
 * @v1.0
 */
import java.util.Scanner; //import scanner from library

public class Test
{
    
    
    public static void main(String args[]) //Define main method
    {
        Scanner userInput = new Scanner(System.in); //introduce scanner for user input
        String firstName, lastName; //define variables to store name
        double testTally; //define variable to store test scores
        System.out.println("Enter the test subject's first name: "); //ask for first name
        firstName = userInput.nextLine();                             // collect first name
        System.out.println("Enter the test subject's last name: ");   //ask for last name
        lastName = userInput.nextLine();                                 // store last name
        System.out.println("Enter the test subject's first test score: "); //ask for first test score
        testTally = userInput.nextDouble();                                 //store first test score
        System.out.println("Enter the test subject's second test score: "); //ask for second test score
        testTally = testTally + userInput.nextDouble();                     //input second test score, add to testTally
        System.out.println("Enter the test subject's third test score: ");   // ..
        testTally = testTally + userInput.nextDouble();                        // ..
        System.out.println("Enter the test subject's fourth test score: ");
        testTally = testTally + userInput.nextDouble();
        System.out.println("Enter the test subject's fifth test score: ");
        testTally = testTally + userInput.nextDouble();
        System.out.println(firstName + " " + lastName + "'s " + "Test Average:   " + testTally / 5); //print stored student name and calculate/disply test average
    }
}
