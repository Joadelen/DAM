/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosMatrices;


public class matrizIdentidad {
    public static int[][] generar_matriz(){
        int[][] c=new int[3][3];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                if(j==i) c[i][j]=1;
                else c[i][j]=0;
            }
        }
        return c;
    }
    
    public static int[][] generar_matriz2(){
        int[][] c=new int[3][3]; // cuando creas una matriz con new, el propio entorno la inicializa con ceros
        for(int i=0;i<c.length;i++){
            c[i][i]=1;
        }
        return c;
    }
    
    public static void main(String[] args){
        int[][] m=generar_matriz();
        mostrar_matriz(m);
    }
    
    public static void mostrar_matriz(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
