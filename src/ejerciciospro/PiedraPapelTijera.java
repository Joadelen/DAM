/*
 *  Ejercicio de Teresa y Joan
 *  Versión utilizando un String al seleccionar una opción
 * 
 */

package ejerciciospro;
import java.util.*;

public class PiedraPapelTijera {
   
    public static void main(String[] args){
        
        int puntosuser=0, puntospc=0, npc;
        String opcion1="", opcionpc="";
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Bienvenido al juego de piedra, papel y tijera.");
        System.out.println("Se jugará al mejor de 5 partidas.");
        System.out.println();
        
        for(int i=0;i<5;i++){
            System.out.println("Partida número: " +(i+1));
            System.out.println("Introduce un elemento: (la palabra, no el número).");
            System.out.println("1. Piedra.");
            System.out.println("2. Papel.");
            System.out.println("3. Tijera.");
            System.out.print("Opción del usuario: ");
            opcion1=teclado.next();
           
            while(!opcion1.equals("Tijera") && !opcion1.equals("Papel") && !opcion1.equals("Piedra")){
                System.out.println("Vaya, te has equivocado al escribir. Recuerda que debes introducir la");
                System.out.println("palabra, no el número (¡y la primera letra mayúscula!). Prueba de nuevo: ");
                System.out.print("Opción del usuario: ");
                opcion1=teclado.next();
            }
            npc= (int) Math.floor(Math.random()*(3-1)+1);
            switch(npc){
                case 1: opcionpc="Piedra";
                    break;
                case 2: opcionpc="Papel";
                    break;
                case 3: opcionpc="Tijera";
                    break;
            }
            System.out.println("Opción de la máquina: "+opcionpc);
            if((opcion1.equals("Piedra") && opcionpc.equals("Tijera")) ||
               (opcion1.equals("Papel") && opcionpc.equals("Piedra")) ||
               (opcion1.equals("Tijera") && opcionpc.equals("Papel"))){
                System.out.println("Has ganado.");
                puntosuser++;
            }
            else{
                if(opcion1.equals(opcionpc)) System.out.println("Habéis empatado.");
                else{
                    System.out.println("Gana la máquina.");
                    puntospc++;
                  }
            }
            System.out.println("Tanteo: Usuario = "+puntosuser+" PC = "+puntospc);
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Resultado final:");
        System.out.println("Usuario = "+puntosuser+" PC = "+puntospc);
    }
}