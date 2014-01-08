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
public class Esprimo {
    public static boolean es_primo(int a){
        boolean primo=true;
        for(int i=2;i<=a/2 && primo; i++){
            if(a % i ==0) primo=false;
        }
        return primo;
    }
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=teclado.nextInt();
        System.out.println("¿Es primo? "+es_primo(num));
    }
}
