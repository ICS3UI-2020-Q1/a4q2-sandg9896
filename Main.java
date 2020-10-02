import java.util.Scanner;
/**
 * Tell user to enter a positive number
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // declare a variable
    int upTo;
    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      upTo = input.nextInt();
    }while(upTo <= 0);
    System.out.println("All Done!");
  }
}
