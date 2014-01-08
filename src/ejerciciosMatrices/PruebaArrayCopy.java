/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosMatrices;


public class PruebaArrayCopy {
        public static void main(String[] args){
            double[][] m={{10,20,30},{40,50,60},{70,80,90}};
            double[][] m2=new double[m.length][m[0].length];
            
            for(int i=0;i<m.length;i++){
                System.arraycopy(m[i], 2, m2[i], 2, m[0].length-2);
            }
            
            for(int i=0;i<m2.length;i++){
                for(int j=0;j<m2[0].length;j++){
                    System.out.print(m2[i][j]+" ");
                }
                System.out.println("");
            }
        }
}
