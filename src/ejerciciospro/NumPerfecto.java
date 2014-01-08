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
public class NumPerfecto {
    public static boolean es_perfecto(int a){
        boolean perfecto=false;
        int suma=0;
        for(int i=1;i<=a/2;i++){
            if(a % i == 0) suma+=i;
        }
        if(suma==a) perfecto=true;
        return perfecto;
    }
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=teclado.nextInt();
        System.out.println("¿Es un número perfecto? " +es_perfecto(num));
    }
}
