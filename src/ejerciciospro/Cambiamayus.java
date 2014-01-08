/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciospro;

/*para cambiar las letras de minusculas a mayusculas podemos usar el metodo
 * toUpperCase(); y para cambiar de mayusculas a minusculas toLowerCase()
 */

public class Cambiamayus {
    public static void main(String[] args){
        System.out.println(cambia("AaA 567 aAa"));
    }
    
    public static String cambia(String cadena){
        String aux="";
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)>=65 && cadena.charAt(i)<=90){
                aux+= (char) (cadena.charAt(i)+ 32);
            }
            else if(cadena.charAt(i)>=97 && cadena.charAt(i)<=122){
                aux+= (char) (cadena.charAt(i)- 32);
            }else aux+=cadena.charAt(i);
        }
        return aux;
    }
}
