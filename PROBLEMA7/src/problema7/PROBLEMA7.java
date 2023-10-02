
package problema7;

import java.util.Scanner;


public class PROBLEMA7 {

   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    double a,b,x,formula,area;
    
    
System.out.println("Dime un valor de a:");
a=sc.nextDouble();

System.out.println("Dime un valor de b:");
b=sc.nextDouble();

System.out.println("Dime un valor de x:");
x=sc.nextDouble();


formula=2 * x;
area = (a*a)-(b*b);

        System.out.println("el valor de la pendiente es: "+formula);
        System.out.println("el valor del area es: "+area);




    
    
    }
}
     
    
    