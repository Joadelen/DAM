/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class raiz {
    public static void main(String[] args){
          Scanner teclado=new Scanner (System.in);
          int n, resultado;
          System.out.println("Introduce un número: ");
          n=teclado.nextInt();
          resultado= (int) Math.sqrt(n);
          if(Math.pow(resultado, 2) == n) System.out.println("Puede expresarse como una potencia entera.");
          else System.out.println("No puede expresarse como una potencia entera.");
    }

}
