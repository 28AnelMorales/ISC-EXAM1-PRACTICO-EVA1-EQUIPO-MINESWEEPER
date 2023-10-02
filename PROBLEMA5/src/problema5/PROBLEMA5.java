
package problema5;

import java.util.Scanner;

public class PROBLEMA5 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
    
    
    double a = 45,vely,altura,distancia,tiempo,tiempototal;
    double b = Math.toRadians(a),seno,cos;
    
    
    
        System.out.println("digite la velocidad: ");
        vely=sc.nextDouble();
        seno=   Math.sin(b)*vely;
        cos= Math.cos(b)*vely;
                
        altura= -(seno*seno)/-19.6;
        
        tiempo=seno/9.8;
        tiempototal=2*tiempo;
        distancia=cos*tiempototal;
        
        

System.out.println("la altura es: "+altura);
System.out.println("la distancia recorrida es: "+distancia);
                
        
     
        
        
        
        
        
    }
    
}
