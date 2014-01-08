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
public class Numamigos {
    public static boolean son_amigos(int num1, int num2){
        boolean perfecto=false;
        int suma=0;
        for(int i=1;i<=num1/2;i++){
            if(num1 % i == 0) suma+=i;
        }
        if(suma==num2) perfecto=true;
        return perfecto;
    }
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce dos números: ");
        num1=teclado.nextInt();
        num2=teclado.nextInt();
        System.out.println("¿Son números amigos? " +(son_amigos(num1, num2)&&son_amigos(num2,num1)));
    }
}
