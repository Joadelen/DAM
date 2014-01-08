/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosMatrices;


public class Diagonal_secundaria {
    public static void mostrar_secundaria1(int[][] m){
        for(int i=0, j=m[i].length-1;i<m.length;i++, j--){
            System.out.println(m[i][j]);
        }
    }
    
    public static void mostrar_secundaria2(int[][] m){
        int j=m.length-1;
        for(int i=0;i<m.length;i++){
            System.out.println(m[i][j-i]);
        }
    }
    
    public static void main(String[] args){
        int[][] m={{1,2,3,689},{4,5,656745,7},{7,85674,9,7},{54536,6,7,0}};
        mostrar_secundaria1(m);
    }
}
