/*
 * Rellena una tercera matriz sumando los valores de otras dos
 */

package ejerciciosMatrices;

import java.util.Scanner;


public class sumamatrices {
    static Scanner teclado=new Scanner(System.in);
    
    public static void rellenar_matriz(int[][] m){
        System.out.println("Rellena la matriz:");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=teclado.nextInt();
            }
        }
    }
    
    public static void mostrar_matriz(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void suma_matrices(int[][] m1, int [][] m2, int[][] resultado){
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                resultado[i][j]=m1[i][j]+m2[i][j];
            }
        }
    }
    
    public static void main(String[] args){
        int[][] m1=new int[3][3];
        int[][] m2=new int[3][3];
        int[][] resultado=new int[3][3];
        
        rellenar_matriz(m1);
        rellenar_matriz(m2);
        suma_matrices(m1,m2,resultado);
        mostrar_matriz(resultado);
    }
}
