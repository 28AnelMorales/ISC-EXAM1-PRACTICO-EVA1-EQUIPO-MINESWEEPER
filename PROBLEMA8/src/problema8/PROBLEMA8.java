
package problema8;

import java.util.Scanner;


public class PROBLEMA8 {

   
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
            
double a,b; 
        double c,y; 

        System.out.println("Valor a:");
        a = sc.nextDouble();
        System.out.println("Valor b:");
        b = sc.nextDouble();
       
      
        
        c=Math.sqrt((a*a)+(b*b));
        y=(c*c);
        
        
        
        System.out.println("la distancia del centro del foco: "+c);
        System.out.println("Las coordenadas son ("+a+",0) (-"+a+",0)");
        System.out.println("las coordenadas del centro es (0,"+y+")");
        
        
    }
    
}  
        
        
      
    

