import java.util.Scanner;
 
public class Rectangle13 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Imput rectangle width: ");
  double width = in.nextDouble();
  System.out.print("Imput the second heigh: ");
  double heigh = in.nextDouble();

  double area = width*heigh;
  double perimeter = 2*(width+heigh);
 
  System.out.print("The rectangle area is " + area);
  System.out.print("\nThe rectangle perimeter is " + perimeter);
    
 }
}