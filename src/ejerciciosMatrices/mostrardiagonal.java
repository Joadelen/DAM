/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosMatrices;

import java.util.Scanner;


public class mostrardiagonal {
    static Scanner teclado=new Scanner(System.in);
    
    public static void rellenar_matriz(int[][] m){
        System.out.println("Rellena la matriz:");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=teclado.nextInt();
            }
        }
        System.out.println("******************");
    }
    
    public static void mostrar_diagonal(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if(i==j) System.out.println(m[i][j]);
            }
        }
    }
    
    public static void main(String[] args){
        int[][] m=new int[3][3];
        rellenar_matriz(m);
        mostrar_diagonal(m);
    }
            
}
