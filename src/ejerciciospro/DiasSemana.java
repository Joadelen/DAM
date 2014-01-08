/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class DiasSemana {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        char opcion;
        System.out.println("Introduce el carácter correspondiente a un día:");
        opcion=teclado.next().charAt(0);
        switch(opcion){
            case 'l': System.out.println("Lunes.");
                        break;
            case 'm': System.out.println("Martes.");
                        break;
            case 'x': System.out.println("Miércoles.");
                        break;
            case 'j': System.out.println("Jueves.");
                        break; 
            case 'v': System.out.println("Viernes");
                        break;
            case 's': System.out.println("Sábado.");
                        break;
            case 'd': System.out.println("Domingo.");
                        break;
            default: System.out.println("Carácter erróneo.");
        }
       
    }
}
