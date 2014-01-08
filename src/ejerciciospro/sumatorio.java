/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class sumatorio {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int n;
        int sumatorio = 0;
        do{
        System.out.println("Introduce un número mayor que 0: ");
        n=teclado.nextInt();
        }while(n<=0);
        while(n>0){
            sumatorio+=n;
            n--;
        }
        System.out.println("Resultado del sumatorio= "+sumatorio);
    }
}
