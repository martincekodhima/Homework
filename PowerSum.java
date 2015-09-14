/*
 * September 08, 2015 
 * Martin Cekodhima
 */

class PowerSum {
  
  // The sum of the sequence initialized to 1 since that is lowest value it can have
  public int sum = 1;
  // The previous number initialized to 1 since that is the strating value
  public int previousNumber = 1;
  // d counts through the recursive loop like i in a for loop
  public int d = 1;
  
  void powerSumLoop(int n){
    
    // run a loop through all the values of n
    for (int i = 1; i < n; i++) { 
      // The sum is equal to the previous sum plus the previous number * 2
      sum = sum + previousNumber * 2;
      previousNumber = previousNumber * 2;
    }
    
    System.out.println(sum);
    
  }
  void recursivePowerLoop(int n){

    if (!(d == n)) {
        // The sum is equal to the previous sum plus the previous number * 2
        sum = sum + previousNumber * 2;
        previousNumber = previousNumber * 2;
        d++;
        recursivePowerLoop(n);
    }else{
      System.out.println(sum);
    }
  }
  
}