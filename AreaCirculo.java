import java.util.Scanner;
 
public class AreaCirculo11 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Imput radius: ");
  double radius = in.nextDouble();
  double area = Math.PI * radius * radius;  
  double perimeter = 2 * Math.PI * radius;
  System.out.print("The area of the circle is : " + area + ", and the perimeter is : " + perimeter );
   
  
 }
}