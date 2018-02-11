
/**
 * A program to find the average test score for five tests given to a single user.
 *
 * @Lance Barto
 * @v1.0
 */
import java.util.Scanner;

public class Test
{
    
    
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        String firstName, lastName;
        double testTally, secondTest, thirdTest, fourthTest, fifthTest;
        System.out.println("Enter the test subject's first name: ");
        firstName = userInput.nextLine();
        System.out.println("Enter the test subject's last name: ");
        lastName = userInput.nextLine();
        System.out.println("Enter the test subject's first test score: ");
        testTally = userInput.nextDouble();
        System.out.println("Enter the test subject's second test score: ");
        testTally = testTally + userInput.nextDouble();
        System.out.println("Enter the test subject's third test score: ");
        testTally = testTally + userInput.nextDouble();
        System.out.println("Enter the test subject's fourth test score: ");
        testTally = testTally + userInput.nextDouble();
        System.out.println("Enter the test subject's fifth test score: ");
        testTally = testTally + userInput.nextDouble();
        System.out.println(firstName + " " + lastName + "\t" + "Test Average: " + testTally / 5);
    }
}
