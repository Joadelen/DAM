/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosVectores;

import java.util.Scanner;


public class SumaVectores {
    
    final static int TAMAÑO=5;
    
    public static int[] sumavector(int[] v1, int[] v2){
        for(int i=0, j=0;i<v1.length && j<v2.length;i++, j++){
            v1[i]+=v2[j];
        }
        return v1;
    }
    
    public static int[] rellenavector(int[] a){
        Scanner teclado=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=teclado.nextInt();
        }
        return a;
    }
    
    public static void mostrar(int[] a){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args){
        int[] v1=new int[TAMAÑO];
        int[] v2=new int[TAMAÑO];
        System.out.println("rellena el primer vector");
        v1=rellenavector(v1);
        System.out.println("rellena el segundo vector");
        v2=rellenavector(v2);
        v1=sumavector(v1,v2);
        System.out.println("resultado de la suma");
        mostrar(v1);
    }
}
