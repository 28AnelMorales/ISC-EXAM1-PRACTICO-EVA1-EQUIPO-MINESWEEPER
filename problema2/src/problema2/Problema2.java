
package problema2;

import java.util.Scanner;


public class Problema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //variables
        float kelvin,centigrados,Fahrenheit;
        System.out.println("Digite la temperatura en fahrenheit: ");
        Fahrenheit = sc.nextFloat();
        
        //conversiones
        centigrados= (Fahrenheit-32)*(5/9);
        
        kelvin= (float) ((Fahrenheit-32) * (5/9) + (273.15));
       
        
        //impresion de datos
        
        
        System.out.println("los "+Fahrenheit+" grados fahrenheit equivalen a "+centigrados+" grados centigrados");
        System.out.println("los "+Fahrenheit+" grados fahrenheit equivalen a "+kelvin+" grados kelvin");
        
        
    }
    
}
