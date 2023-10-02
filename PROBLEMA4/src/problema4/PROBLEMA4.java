
package problema4;

import com.sun.source.tree.IfTree;
import java.util.Scanner;

public class PROBLEMA4 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     double r1,r2,r3,r4,r5,voltaje;
     double resequi,formula,intensidad;
        System.out.println("digite el voltaje: ");
        voltaje=sc.nextDouble();
        System.out.println("digite el valor de las resistenci 1 : ");
        r1=sc.nextDouble();

         System.out.println("digite el valor de las resistenci 2 : ");
        r2=sc.nextDouble();
         System.out.println("digite el valor de las resistenci 3 : ");
        r3=sc.nextDouble();
         System.out.println("digite el valor de las resistenci 4 : ");
        r4=sc.nextDouble();
         System.out.println("digite el valor de las resistenci 5 : ");
        r5=sc.nextDouble();
     
        double mayor = r1;
 
if (r2 > mayor)
mayor = r2;
if (r3 > mayor)
mayor = r3;
if (r4 > mayor)
mayor = r4;
if(r5 > mayor)
mayor = r5;
                
        
     
        
        
        resequi = (mayor/r1)+(mayor/r2)+(mayor/r3)+(mayor/r4)+(mayor/r5);
        formula=mayor/resequi;
        intensidad = voltaje/formula;
        double i1=voltaje/r1,i2=voltaje/r2,i3=voltaje/r3,i4=voltaje/r4,i5=voltaje/r5;
        System.out.println( "\nla resistencia equivalente es de "+ formula + " oms");
        System.out.println("El resultado de la intesidad es de: "+intensidad+" mA");
        
        System.out.println("la intesidad i1 es de: "+i1);
        System.out.println("la intesidad i2 es de: "+i2);
        System.out.println("la intesidad i3: es de: "+i3);
        System.out.println("la intensidad i4 es de: "+i4);
        System.out.println("la intesidad i5 es de: "+i5);
        
        
    }
    
}
