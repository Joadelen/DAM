/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class TerminaNumero {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int numero, acaba;
        do{
        System.out.print("Introduce un número: ");
        numero=teclado.nextInt();
        switch(numero%10){
            case 4:case 7: case 9: System.out.println(numero*5);
                                    break;
            case 2: case 5:case 8: System.out.println(numero*numero);
                                    break;
            default: System.out.println(numero);
        }
    }while(numero!= -1);
    }
}
