/*
 * Calcula la media de los valores de la fila de una matriz
 * y almacena el valor en la últma posición de la celda
 */

package ejerciciosMatrices;

import java.util.Scanner;


public class calcularmedia {
    static Scanner teclado=new Scanner(System.in);
    
    public static void rellenar_matriz(double[][] m){
        System.out.println("Rellena la matriz:");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length-1;j++){
                m[i][j]=teclado.nextInt();
            }
        }
    }
    
    public static void calcula_media(double[][] m){
        int j=0;
        double contador=0;
        for(int i=0;i<m.length;i++){
            while(j<m[i].length-1){
                contador+=m[i][j];
                j++;
            }
            m[i][j]=contador/(m[0].length-1);
            j=0;
            contador=0;
        }
    }
    
    public static void mostrar_matriz(double[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args){
        double[][] m=new double[1][4];
        rellenar_matriz(m);
        System.out.println("");
        calcula_media(m);
        System.out.println("");
        mostrar_matriz(m);
    }
}
