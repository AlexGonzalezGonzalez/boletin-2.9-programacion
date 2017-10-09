
package boletin.pkg2.pkg1;
import java.util.Scanner;
public class Boletin21 {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       int billetes100,billetes20,billetes5,monedas1,dinero,r1,r2,r3;
       System.out.println("teclea dinero");
       dinero=sc.nextInt();
       billetes100=dinero/100;
       r1=dinero%100;
       billetes20=r1/20;
       r2=r1%20;
       billetes5=r2/5;
       r3=r2%5;
       monedas1=r3;
       System.out.println("billetes de 100:"+ billetes100);
       System.out.println("billetes de 20:"+ billetes20);
       System.out.println("billetes de 5:"+ billetes5);
       System.out.println("modedas de 1:"+ monedas1);
      
    
    }
}
