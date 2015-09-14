/*
 * September 8, 2015
 * Martin Cekodhima
 */

class Perfect {
  
  void printDivisors(int n) {
    // Create an array to store the divisors
    int[] divisors = new int[10];
    int a = 0; // Array max length of numbers
    // Run a loop that checks all numbers smaller than n if they divisors
    for (int d = 1; d < n; d++){
      // Check using the modulo whether d is a divisor of n
      if (n % d == 0 && d != n) {
        divisors[a] = d;
        a++;
      }
    }
    
    for (int g = 0; g < a; g++) {
      System.out.print(divisors[g] + " ");
      
    }
  }
  
  boolean isPerfect(int n) {
    // Create an array to store the divisors
    int[] divisors = new int[10];
    int a = 0; // Array max lengt of numbers
    int d = 1; // Number thats checked whether divisor or not
    // Run a loop that checks all numbers smaller than n if they divisors
    do { 
      // Check using the modulo whether d is a divisor of n
      if (n % d == 0 && d != n) {
        divisors[a] = d;
        a++;
      }
      d++;
    }while(d < n);
    
    int divisorsSum = 0;
    
    for (int g = 0; g < a; g++) {
      divisorsSum += divisors[g];
    }
    
    if (divisorsSum == n) {
      return true;      
    }else {
      return false;
    }
  }
  
  void allPerfect() {
        int n = 0; 
    do{
      // Create an array to store the divisors
      int[] divisors = new int[50];
      int a = 0; // Array max lengt of numbers
      int d = 1; // Number thats checked whether divisor or not
      // Run a loop that checks all numbers smaller than n if they divisors
      do { 
        // Check using the modulo whether d is a divisor of n
        if (n % d == 0 && d != n) {
          divisors[a] = d;
          a++;
        }
        d++;
      }while(d < n);
      
      int divisorsSum = 0;
      
      for (int g = 0; g < a; g++) {
        divisorsSum += divisors[g];
      }
      
      if (divisorsSum == n) {
        System.out.println(n);     
      }
      n++;
    }while(n<1000);
  }
}