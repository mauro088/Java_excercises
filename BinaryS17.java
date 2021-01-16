import java.util.Scanner;
import java.util.Arrays;
 
public class BinaryS17 {
 
 public static void main(String[] args) {


   Scanner myObj = new Scanner(System.in);
   System.out.println("Digita primer numero binario :");
   String bin1 = myObj.nextLine();

   System.out.println("Digita segundo numero binario :");
   String bin2 = myObj.nextLine();

   int t1 = bin1.length();
   int t2 = bin2.length();

   System.out.println("la longitud es :" + t1);



      if (t1 > t2){   //si t1 es mas largo que t2
             

     int dif = t1-t2;  

         
     int suma [] = new int [t1 + 1];

     int acarreo [] = new int [t1 + 1];

     int total [] = new int [t1 + 1];

     for(int i = bin1.length(); i>=0; i--){



      suma [i] =  Integer.parseInt(String.valueOf(bin1.charAt(i))) + Integer.parseInt(String.valueOf(bin2.charAt(i)));
       
      if (suma [i] == 2) {

       suma [i] = 0;
       acarreo [i-1] = 1 ;
                                                                       
       }

       total [i] = suma [i] + acarreo [i];

       if (total [i] == 2) {

          acarreo [i-1] = 1 ;
          total [i] = 0;

          System.out.print(total[i]);  

       }

      }

      } else {

         int suma [] = new int [t2 + 1];

      int acarreo [] = new int [t2 + 1];

         int total [] = new int [t2 + 1];

         for(int i = bin2.length(); i>=0; i--){

            suma [i] =  Integer.parseInt(String.valueOf(bin1.charAt(i))) + Integer.parseInt(String.valueOf(bin2.charAt(i)));
             
            if (suma [i] == 2) {
 
             suma [i] = 0;
             acarreo [i-1] = 1 ;
                                                                             
             }
 
             total [i] = suma [i] + acarreo [i];
 
             if (total [i] == 2) {
 
                acarreo [i-1] = 1 ;
                total [i] = 0;

                System.out.print(total[i]); 
 
             }
 
            }


      }

  
          
          
    

        
    }
    
 }

