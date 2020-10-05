import java.util.Scanner;
/**
 * Asks user for integer and tells them the factors of it
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // declare integer variable
    int posInt;
 
    // only allows user to enter positive integer
    do{
     // ask the user for a postivie integer
     System.out.println("Please enter a positive integer to determine its factors:");
     posInt = input.nextInt();
    } while(posInt <= 0);

   // declare and initilaize counting variable
    int count = 1;

    // declare factor variable
    int factor;

    // tell the user what the factors
    System.out.println("The factors of " + posInt + " are:");

    // goes through all values up to integer to check for factors
    while(count <= posInt){
      if( posInt%count == 0){
        // division to solve for factors
        factor = posInt/count;
        // prints to the user the factors
        System.out.println(factor);
      }
      // moves up one number and loop repeats unless greater than posInt
      count = count + 1;
    }

  }
}
