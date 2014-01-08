/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;
import java.util.*;
/**
 *
 * @author User
 */
public class EjerciciosPRO {
    
    static int var;
    static boolean bol;
    static String cadena;
    static float valor;
    
    public static void main(String[] args) {
        int a, b, resultado;
        char op;
        Scanner teclado=new Scanner(System.in);
        System.out.println(var);
        System.out.println(bol);
        System.out.println(cadena);
        System.out.println(valor);
        
        System.out.println("Introduce un número:");
        a=teclado.nextInt();
        System.out.println(es_primo(a));
        
        System.out.println("Introduce dos números:");
        a=teclado.nextInt();
        b=teclado.nextInt();
        System.out.println("Introduce un tipo de operación: + - * /");
        op=teclado.next().charAt(0);
        resultado=operacion(a,b,op);
        System.out.println("El resultado es = "+resultado);
    }
    
    public static int operacion(int a, int b, char op){
        int resultado=0;
        switch (op){
            case '+': resultado=a+b;
                break;
            case '-': resultado=a-b;
                break;
            case '*': resultado=a*b;
                break;
            case '/': resultado=a/b;
                break;
        }
        return resultado;
    }
    
    public static String es_primo(int a){
        boolean primo=true;
        if(a % 2 == 0) primo=false;
        for(int i=3;i<=a/2 && primo; i=i+2){
            if(a % i ==0) primo=false;
        }
        return "¿Es primo? " +primo;
    }
}
