/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;
/**
 *
 * @author User
 */
public class sumadivisores {
    public static int sumadivisores(int a){
        int resultado=0;
        for(int i=1;i<=a;i++){
            if(a%i==0) resultado+=i;
        }
        return resultado;
    }
    
    public static void main(String[] args){
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un número:");
        num=teclado.nextInt();
        System.out.println("La suma de sus divisores es= " +sumadivisores(num));
    }
}
