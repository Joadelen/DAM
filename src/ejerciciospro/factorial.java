/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class factorial {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int n, factorial=1;
        System.out.println("Introduce un número: ");
        n=teclado.nextInt();
        while(n>=1){
            factorial*=n;
            n--;
        }
        System.out.println("El resultado es= "+factorial);
    }
}
