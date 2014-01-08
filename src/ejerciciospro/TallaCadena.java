/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;

public class TallaCadena {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        String cadena;
        System.out.print("Introduce una cadena de caracteres (4 max): ");
        cadena=teclado.nextLine();
        switch(cadena.length()){
            case 0: System.out.println("No has escrito nada.");
                    break;
            case 1:case 2: case 3: case 4: System.out.println("Tamaño de la cadena: "+cadena.length());
                                            break;
            default: System.out.println("Cadena demasiado grande. Max 4 caracteres.");
        }
    }
}
