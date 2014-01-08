/*
 * Suma los valores de cada columna y lo almacena en la última posición 
 * de cada columna
 */

package ejerciciosMatrices;

import java.util.Scanner;


public class sumacolumnas {
    static Scanner teclado=new Scanner(System.in);
    
    public static void rellenar_matriz(int[][] m){
        System.out.println("Rellena la matriz:");
        for(int i=0;i<m.length-1;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=teclado.nextInt();
            }
        }
    }
    
    public static void suma_columnas(int[][] m){
        int i=0, contador=0;
        for(int j=0;j<m[i].length;j++){
            while(i<m.length-1){
                contador+=m[i][j];
                i++;
            }
            m[i][j]=contador;
            i=0;
            contador=0;
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
    
    public static void main(String[] args){
        int[][] m=new int[4][3];
        rellenar_matriz(m);
        System.out.println("");
        suma_columnas(m);
        System.out.println("");
        mostrar_matriz(m);
    }
    
}
