/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class diasmesanyo {
    public static void main (String[] args){
        Scanner teclado=new Scanner(System.in);
        int año, num_dias, mes;
        System.out.println("Introduce el número correspondiente a un mes: ");
        mes=teclado.nextInt();
        System.out.println("Ahora introduce un mes: ");
        año=teclado.nextInt();
        switch(mes){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("Tiene 31 dias");
                break;
            case 4:case 6:case 9:case 11:
                System.out.println("Tiene 30 días");
                break;
            case 2:
                if((((año % 4)==0) && (año % 100)>0) || (año % 400 ==0))
                    System.out.println("Tiene 29 días");
                else System.out.println("Tiene 28 días");
        }
    }
}
