/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciospro;
import java.util.*;

public class cuentavocal {
    public static int vocal(String cadena, char a){
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==a){
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        char c;
        String cadena;
        do{
            System.out.println("Introduce una vocal");
            c=teclado.next().charAt(0);
        }while(c!='a'&&c!='e'&&c!='i'&&c!='o'&& c!='u');
        System.out.println("Introduce una cadena");
        cadena=teclado.nextLine();
        System.out.println(vocal(cadena,c));
    }
}
