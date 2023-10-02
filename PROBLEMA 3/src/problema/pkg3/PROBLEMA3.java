
package problema.pkg3;

import java.util.Scanner;


public class PROBLEMA3 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      float diametro,velocidad,formula;
      double area;
      
        System.out.println("digite el radio de la tuberia: ");
        diametro=sc.nextFloat()*2;
        System.out.println("digite la velocidad del agua: ");
        velocidad = sc.nextFloat();
        
        area=(3.1416/4)*(diametro*diametro);
        formula=(float) (area*velocidad);
        System.out.println("La cantidad de metros cubicos que fluye es de: "+formula+" metros cubicos");
       
        
    }
    
}
