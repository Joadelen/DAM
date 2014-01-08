/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;

/**
 *
 * @author User
 */
public class contador5digitos {
    public static void main(String[] args){
        int k, digitos_i=0;
        for(int i=0; i<100000; i++){
            k=i;
            do{
                digitos_i++;
                k/=10;
            }while(k>0);
            for(int j=0;j<5-digitos_i;j++) System.out.print("0");
            System.out.println(i);
            digitos_i=0;
        }
    }
}
