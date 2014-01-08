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
public class Caracter {
    public static boolean digito(char c){
        boolean enrango=false;
        switch(c){
            case '0':case '1':case '2':case '3':case '4':
            case '5':case '6':case '7':case '8':case '9': enrango=true;
        }
        return enrango;
    }
    
      public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        char c;
        System.out.println("Introduce un carácter: ");
        c=teclado.next().charAt(0);
        System.out.println("¿Está en el rango 0-9? " +digito(c));
    }
}
