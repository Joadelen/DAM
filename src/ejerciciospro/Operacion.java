/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class Operacion {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        char op;
        int n1, n2;
        System.out.println("Introduce dos números: ");
        n1=teclado.nextInt();
        n2=teclado.nextInt();
        System.out.println("Introduce la operación a realizar: + - * / ");
        op=teclado.next().charAt(0);
        switch(op){
            case '+': System.out.println(n1+n2);
                        break;
            case '-': System.out.println(n1 - n2);
                        break;
            case '*': System.out.println(n1*n2);
                        break;
            case '/': System.out.println(n1/n2);
                        break;
            default: System.out.println("Carácter incorrecto.");
        }
    }
}
