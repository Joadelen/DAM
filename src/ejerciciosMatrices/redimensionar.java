/*
 * Partiendo de una matriz p.e de 4x3,. crea otra de tamaño 3x4 con 
 * los mismos valores que la inicial
 */

package ejerciciosMatrices;
import java.util.*;

public class redimensionar {
    static Scanner teclado=new Scanner(System.in);
    
    public static void rellenar_matriz(int[][] m){
        System.out.println("Rellena la matriz:");
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=teclado.nextInt();
            }
        }
    }
    
    public static int[][] redimensionar_matriz(int[][] m){
        int[][] c=new int[m[0].length][m.length]; //tamaño 3x4
        for(int i=0;i<m.length;i++){ //i=tamaño de una columna de m = 4
            for(int j=0;j<m[i].length;j++){ //j=tamaño de una fila=3
                c[j][i]=m[i][j];
            }
        }
        return c;
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
        int filas, columnas;
       // do{
        System.out.println("Introduce el número de filas: ");
        filas=teclado.nextInt();
        System.out.println("Introduce el número de columnas: ");
        columnas=teclado.nextInt();
      //  }while(filas<columnas);
        int[][] matriz= new int[filas][columnas];
        rellenar_matriz(matriz);
        int[][] matriz2=redimensionar_matriz(matriz);
        mostrar_matriz(matriz);
        System.out.println("");
        mostrar_matriz(matriz2);
    }
}
