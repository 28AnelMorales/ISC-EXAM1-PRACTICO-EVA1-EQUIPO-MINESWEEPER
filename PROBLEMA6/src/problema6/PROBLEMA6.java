
package problema6;

import java.util.Scanner;


public class PROBLEMA6 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       double veliniang,velfinang,tiempo,radio;
       double distang,distanmetros,velangprom,velmetro,aceleracionang,acelarametro,frecuencia;
       
       
       
       
        System.out.println("digite la velocidad angular inicial en radianes: ");
        veliniang=sc.nextDouble();
        System.out.println("digite la velocidad angular final en radianes: ");
        velfinang=sc.nextDouble();
        System.out.println("digite el tiempo en segundos: ");
        tiempo=sc.nextDouble();
        System.out.println("digite el radio de la rueda en metros: ");
        radio=sc.nextDouble();
        
        
        aceleracionang=(velfinang-veliniang)/tiempo;
        distang=((veliniang+velfinang)/2)*tiempo;
        velangprom=aceleracionang/tiempo;
        frecuencia=velangprom/(2*3.1416);
        acelarametro=(velangprom*velangprom)*(2*3.141593654);
        velmetro=velangprom*(2*3.141592654);
        distanmetros=(radio*2)*3.141592654;
        
        
        System.out.println("La aceleracion angular es: "+aceleracionang);
        System.out.println("La distancia angular es: "+distang);
        System.out.println("La velocidad angula promedio es de: "+velangprom);
        System.out.println("La frecuencia es de: "+frecuencia);
        System.out.println("La aceleracion en m/s↑2 es de: "+acelarametro);
        System.out.println("La velocidad en metro es de:  "+velmetro);
        System.out.println("la distancia en metros recorridos "+distanmetros);
       
       
        
        
    }
    
}
