/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosVectores;

import java.util.Scanner;


public class JuntaVectores {
    final static int TAMAÑO=3;
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int[] a=new int[TAMAÑO];
        int[] b=new int[TAMAÑO];
        System.out.println("Rellena el primer vector:");
        for(int i=0; i<a.length;i++){
            a[i]=teclado.nextInt();
        }
        System.out.println("Rellena el segundo vector:");
        for(int i=0; i<a.length;i++){
            b[i]=teclado.nextInt();
        }
        int[] c=unevectores(a,b);
        System.out.println("");
    }
    
    public static int[] unevectores(int[] a, int[] b){
        int[] c=new int[a.length+b.length];
        
        for(int i=0,j=0;i<c.length; i=i+2, j++){
            c[i]=a[j];
            System.out.print(c[i]+" ");
            c[i+1]=b[j];
            System.out.print(c[i+1]+" ");
        }
        return c;
    }
    
}
