
import java.util.Arrays;
 
public class BinaryS17 {
 
 public static void main(String[] args) {

  
    String t1=  "0101011", t2 = "0101010";

        
     
     int suma [] = new int [7];

     int acarreo [] = new int [7];

     int total [] = new int [7];

     for(int i = 6; i>=0; i--){

           suma [i] =  Integer.parseInt(String.valueOf(t1.charAt(i))) + Integer.parseInt(String.valueOf(t2.charAt(i)));
            
           if (suma [i] == 2) {

            suma [i] = 0;
            acarreo [i-1] = 1 ;
                              
                                              
            }

            total [i] = suma [i] + acarreo [i];

            if (total [i] == 2) {

               acarreo [i-1] = 1 ;
               total [i] = 0;

            }

           }
          

           
      System.out.println( "acarreo : "  + acarreo [0]+ ""+ acarreo [1]+ ""+acarreo [2]+ ""+ acarreo [3]+ ""+acarreo [4]+ ""+acarreo[5]+ ""+acarreo[6]);
      System.out.println (("          "+ Integer.parseInt(String.valueOf(t1.charAt(0)))) +""+ ( Integer.parseInt(String.valueOf(t1.charAt(1))))+""+ ( Integer.parseInt(String.valueOf(t1.charAt(2))))+""+ ( Integer.parseInt(String.valueOf(t1.charAt(3))))+""+ ( Integer.parseInt(String.valueOf(t1.charAt(4))))+""+ ( Integer.parseInt(String.valueOf(t1.charAt(5))))+""+ ( Integer.parseInt(String.valueOf(t1.charAt(6))))); 
      System.out.println (  "+"); 
      System.out.println (("          "+ Integer.parseInt(String.valueOf(t2.charAt(0)))) +""+ ( Integer.parseInt(String.valueOf(t2.charAt(1))))+""+ ( Integer.parseInt(String.valueOf(t2.charAt(2))))+""+ ( Integer.parseInt(String.valueOf(t2.charAt(3))))+""+ ( Integer.parseInt(String.valueOf(t2.charAt(4))))+""+ ( Integer.parseInt(String.valueOf(t2.charAt(5))))+""+ ( Integer.parseInt(String.valueOf(t2.charAt(6)))));
      System.out.println( "---------------------");
     //System.out.println( "          " + suma [0]+ ""+ suma  [1]+ ""+suma  [2]+ ""+ suma  [3]+ ""+suma  [4]+ ""+suma [5]+ ""+suma [6]);
     System.out.println( "Total suma binaria: " + total [0]+ ""+ total  [1]+ ""+total  [2]+ ""+ total  [3]+ ""+total  [4]+ ""+total [5]+ ""+total [6]);
     

        
    }
    
 }
