/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Capicua {
    public static boolean es_capicua(int a){
        boolean capicua=false;
        int invertido=0, aux=a;
        while(aux>=1){
            invertido*=10;
            invertido+=(aux%10);
            aux/=10;
        }
        if(invertido==a) capicua=true;
        return capicua;
    }
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num=teclado.nextInt();
        System.out.println("¿Es capicua? "+es_capicua(num));
    }
}
