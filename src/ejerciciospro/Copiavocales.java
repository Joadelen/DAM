/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;

/**
 *  charAt(i) = recupera el caracter de la posición i
 *  toUpperCase(char c) = convierte a mayuscula un caracter c
 *  toLowerCase(char c) = convierte a minusucla un caracter c
 *  Character.digit(char c, int radix) = convierte el caracer c en un entero
 */
public class Copiavocales {
    public static void main(String[] args){
        String cadena="La ramona pechugona 456 5es la tia mas gorda de mi pueblo278";
        String cadena2="";
        String cadena3="El ninyo esta nyonyo";
        String cadena4="";
        int contador=0, sumador=0;
        
        for(int i=0;i<cadena3.length();i++){
            if(cadena3.charAt(i)!='n') cadena4+=cadena3.charAt(i);
            else if(cadena3.charAt(i+1)=='y'){
                cadena4+='ñ';
                i++;
            } else cadena4+='n';
        }
        
        System.out.println(cadena3);
        System.out.println(cadena4);
        
        for (int i=0;i<cadena.length();i++){
            if(Character.isDigit(cadena.charAt(i))){
                contador++;
                sumador+=Character.digit(cadena.charAt(i), 9);
            }
            
            
            
            switch(cadena.charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u': case ' ':
                    cadena2+=cadena.charAt(i);
            }
        }
        System.out.println(sumador);
        System.out.println(contador);
        System.out.println(cadena2);
    }
    
    
}
