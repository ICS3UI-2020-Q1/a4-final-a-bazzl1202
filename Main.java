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

    do{
      // ask the user for a postivie integer
    System.out.println("Please enter a positive integer to determine its factors:");
    posInt = input.nextInt();
    } while(posInt <= 0);

  

    
  }
}