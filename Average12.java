import java.util.Scanner;
 
public class Average12 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Imput the first number: ");
  double num1 = in.nextDouble();
  System.out.print("Imput the second number: ");
  double num2 = in.nextDouble();
  System.out.print("Imput the third number: ");
  double num3 = in.nextDouble();

  double average = (num1+num2+num3)/3;
 
  System.out.print("average of the three digits is : " + average );
   
  
 }
}