public class Biseccion {
    public static void main(String[] args) {
    
        double a=-1,b=-0.25,p=(a+b)/2;    
      boolean a_possitive=true,b_possitive=true,fp_possitive=true;
      
        
      
        double fa = (10*(Math.pow(a, 4)))-((3)*(a)*(Math.pow((Math.E),a)))-(3*(Math.pow((Math.E),a)));
      
      double fb = (10*(Math.pow(b, 4)))-((3)*(b)*(Math.pow((Math.E),b)))-(3*(Math.pow((Math.E),b)));
      
      double fp = (10*(Math.pow(p, 4)))-((3)*(p)*(Math.pow((Math.E),p)))-(3*(Math.pow((Math.E),p)));	
      
      if(fa>0){
          a_possitive=true;
      } else {
          a_possitive=false;
      }
       if(fb>0){
          b_possitive=true;
      } else {
          b_possitive=false;
      }
      if(fp>0){
          fp_possitive=true;
      } else {
          fp_possitive=false;
      }
      
      System.out.println("f(a) is positive : " + a_possitive );
      System.out.println("f(b) is positive : " + b_possitive );  
      System.out.println("f(p) is positive : " + fp_possitive );
      
       
      System.out.println("f("+a+")= " + fa);    
      System.out.println("f("+p+")= " + fp);
      System.out.println("f("+b+")= " + fb);
      
          
      
    }
  }
  