/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciospro;
import java.util.*;

public class MuestraRectangulo {
    public static void muestraRectangulo(int a, int b){
        muestraBase(a);
        muestraAltura(a,b);
        muestraBase(a);        
    }
    public static void muestraBase(int base){
        for(int i=0; i<base;i++){
            System.out.print('*');
        }
        System.out.println("");
    }
    public static void muestraAltura(int base, int altura){
        while(altura>2){
        System.out.print('*');
        for(int i=0; i<base-2;i++){
            System.out.print(' ');
        }
        System.out.println('*');
        altura--;
        }
    }
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int base, altura;
        System.out.println("Introduce una base y una altura");
        base=teclado.nextInt();
        altura=teclado.nextInt();
        muestraRectangulo(base,altura);
    }
}
