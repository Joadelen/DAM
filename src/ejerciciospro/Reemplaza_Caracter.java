/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciospro;


public class Reemplaza_Caracter {
    public static String reemplazar(String cadena, char c, char d){
        String aux="";
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==c) aux+=d;
            else aux+=cadena.charAt(i);
        }
        return aux;
    }
    
    public static void main(String[] args){
        System.out.println(reemplazar("abbbba",'b','a'));
    }
}
