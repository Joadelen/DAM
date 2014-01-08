/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosVectores;

import java.util.Scanner;

public class Palindroma {

    public static void main(String[] args) {
        boolean palindroma = true;
        Scanner teclado = new Scanner(System.in);
        char[] vector, vector2;
        System.out.println("introduce una cadena");
        String cadena = teclado.nextLine();
        vector = cadena.toCharArray();
        vector2= new char[vector.length];
        int j=0;
        
        for(int i=0; i<vector.length;i++){
            if(vector[i]!=' ') {
                vector2[j]=vector[i];
                j++;
            }
        }
        
        j--;
        
        for(int i=0; i<j && palindroma;i++,j--){
            if(vector2[i] != vector2[j]) palindroma=false;
        }
        System.out.println("¿Es palindroma? "+palindroma);
    }

}
