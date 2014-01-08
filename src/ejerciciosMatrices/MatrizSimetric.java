/*
 * comprueba si una matriz es simetrica (valor de [i][j] == al de [j][i])
 */

package ejerciciosMatrices;

import java.util.Random;
import java.util.Scanner;


public class MatrizSimetric {
    static Scanner teclado=new Scanner(System.in);
    
    public static boolean es_simetrica(int[][] m){
        boolean sim=true;
        if(es_cuadrada(m)){
            for(int i=0;i<m.length && sim;i++){
                for(int j=i;j<m[i].length && sim;j++){
                    if(m[i][j]!=m[j][i]) sim=false;
                }
            }
        }else sim=false;
        return sim;
    }
    
    public static boolean es_cuadrada(int[][] m){
        return m.length==m[0].length;
    }
    
    public static void rellenar_matriz(int[][] m){
        System.out.println("Rellena la matriz");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=teclado.nextInt();
            }
        }
    }
    
    /*
     * Rellena una matriz con números de forma aleatoria:
     * r.nextInt(int n) => r genera un número aleatorio entre 0 y n
     */
    
    public static void rellenar_matriz_random(int[][] m){
        Random r=new Random();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=r.nextInt(9);
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args){
        int[][] m=new int[3][3];
        rellenar_matriz_random(m);
        System.out.println("¿Es simétrica? "+es_simetrica(m));
    }
}
