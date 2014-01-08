/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciospro;


public class cuentavocales {
    public static void main(String[] args){
        numero_vocales("Holaa mundo");
    }
    
    public static int numero_vocales(String cadena){
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            switch(cadena.charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    contador++;
            }
        }
        System.out.println(contador);
        return contador;
    }
}
