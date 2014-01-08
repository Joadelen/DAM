/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosVectores;

import java.util.Scanner;

public class EjercicioNiño2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cadena = teclado.nextLine();
        char[] c = new char[cadena.length()];
        int pos = 0;
        int posc=0;
        while(pos<cadena.length()){
            if((cadena.charAt(pos) == 'n') && (cadena.charAt(pos+1) == 'y')){
                c[posc]='ñ';
                pos=pos+2;
                posc++;
            } else {
                c[posc]=cadena.charAt(pos);
                posc++;
                pos++;
            }
        }
        while(posc<pos){
            c[posc]=' ';
            posc++;
        }
        
        System.out.println(c);
    }
    
}
