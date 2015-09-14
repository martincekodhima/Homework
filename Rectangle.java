/* Rectangle
 * Martin Cekodhima and Wouter Leeuw
 * September 3, 2015
 */
import java.util.Scanner;
class Rectangle {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int xMax = sc.nextInt(); // X-coordinate of top left
    int yMax = sc.nextInt(); // Y-coordinate of top left
    int xMin = sc.nextInt(); // X-coordinate of bottom right
    int yMin = sc.nextInt(); // Y-coordinate of bottom right
    int xPoint = sc.nextInt(); // X-coordinate of point
    int yPoint = sc.nextInt(); // Y-coordinate of point
    
    if (!(xMax >= xMin || yMax <= yMin)) {
      // Check if the rectangles is ill defined
      if ((xPoint >= xMax && xPoint <= xMin) && (yPoint <= yMax && yPoint >= yMin)) {
        System.out.println("inside");
      } else {
        System.out.println("outside");
      }
    } else {
      System.out.println("error");
    }
    
    
    
  }
  
}