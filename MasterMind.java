/*
 * September 8, 2015
 * Martin Cekodhima
 */

import java.util.Scanner;
class MasterMind {
 
  public static void main(String[] args){
    // init arrays and scanner
    Scanner in = new Scanner(System.in);
    int[] secretCode = new int[4];
    int[] score = new int[4];
    int pegsCorrect = 0;
    
    //Take user input on code and score
    
    secretCode[0] = in.nextInt();
    secretCode[1] = in.nextInt();
    secretCode[2] = in.nextInt();
    secretCode[3] = in.nextInt();
    
    score[0] = in.nextInt();
    score[1] = in.nextInt();
    score[2] = in.nextInt();
    score[3] = in.nextInt();
    
    // Check which is an x and which is a 0
    
    for (int i = 0; i < 4; i++) {
      if (secretCode[i] == score[i]) {
        pegsCorrect++;
      }
    }
    
    // Print all the pegs that are correct
    for (int i = 0; i < pegsCorrect; i++){
      System.out.print("X");
    }
    //Print all the pegs that are incorrect
    for (int i = 0; i < (4-pegsCorrect); i++){
      System.out.print("O");
    }
    
    
  }
  
}