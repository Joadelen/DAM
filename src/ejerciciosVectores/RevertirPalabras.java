/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosVectores;

import java.util.Scanner;


public class RevertirPalabras {
    public static void main(String[] args){
        Scanner teclado=new Scanner (System.in);
        String cadena=teclado.nextLine();
        char[] vector=cadena.toCharArray();
        char aux;
        int j=0,i=0,ind;
        do{
           while(j < vector.length && vector[j]!= ' '){
               j++;
           }
           ind=j-1;
           for(;i<ind;i++, ind--){
               aux=vector[ind];
               vector[ind]=vector[i];
               vector[i]=aux;
           }
           j++;
           i=j;
        }while(j<vector.length);
        System.out.println(vector);
    }
}
