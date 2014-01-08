/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PosEnFibonacci {
    public static int valor_enpos(int pos){
        if(pos<=1){
            if(pos>0) return 1;
            else return 0;
        }
        int[] v= new int[pos+1];
        v[0]=0;
        v[1]=1;
        for(int i=2;i<=pos;i++){
                v[i]=v[i-1]+v[i-2];
            }
        return v[pos];
    }
    
      public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int num;
        System.out.println("Introduce el número de una posición (cuenta el 0): ");
        num=teclado.nextInt();
        System.out.println("Valor en la posición "+num+" de la sucesión de Fibonacci= "+valor_enpos(num));
    }
}
