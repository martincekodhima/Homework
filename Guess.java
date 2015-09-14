/*
 * Martin Cekodhima and Xander Wessels
 * September 10, 2015
 */
import java.util.*;
class Guess {
 
  public static void main(String[] args) {
    // Initialize of Scanner and Random
    Scanner in = new Scanner(System.in);
    Random random = new Random(); 
    
    // Declare array of guesses
    int[] guesses = new int[7];
    // Declare wheter correct boolean
    boolean correct = false;
    int i = 0;
    
    // Ask for secret code and take user input
    System.out.println("Secretly type the code or -1 if you want me to choose");
    int code = in.nextInt();
    // Check if user input is equal to -1 and if so create a random number
    if(code == -1){
      code = random.nextInt(100);
    }
    
    System.out.println("Start guessing!");
    // loop through the 7 tries and check if answer was guessed correctly
    while(i < 7 && !correct) {
      
      guesses[i] = in.nextInt();
      
      if (guesses[i] == code) {
        correct = true;
        System.out.println("Good guess! You won.");
      }else if (guesses[i] < code) {
        System.out.println("higher");
      }else if (guesses[i] > code) {
        System.out.println("lower");
      }
      i++;
    }
    // If not guessed correctly display no more guesses
    if (correct == false){
      System.out.println("No more guesses, you lost.");
    }
    System.out.println(i + " guesses:");
    // Print out guesses
    for (int l = 0; l < i; l++) {
      for (int k = 0; k < 100; k++) {
        if (k == guesses[l]) {
          System.out.print("X");
        }else if (k == code) {
          System.out.print("|");
        }else{
          System.out.print(".");
        }
      }
      System.out.println("");
    }
    
    
    
    
  }
  
  
  
  
}