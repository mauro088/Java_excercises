import java.util.Scanner;
 
public class VariableC15 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Imput value for variable 1: ");
  double v1 = in.nextDouble();
  System.out.print("Imput value for variable 2: ");
  double v2 = in.nextDouble();

  double v3 = 0;

  v3 = v1;
  v1 = v2; 
  v2 = v3;  
   
  System.out.print("The variable 1 now is : " + v1 );
  System.out.print("\nThe variable 2 now is : " + v2);
    
 }
}