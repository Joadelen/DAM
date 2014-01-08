package ejerciciospro;

/*el metodo cadena.substring(int indice) || subtring(int comienzo, int final) devuelve
 * un string cuyo contenido es lo que hay en el intervalo de las posiciones que
 * se le pasan
 */

public class cambiaapellidonombre {
    
    public static String intercambiar(String cadena){
        String nombre="";
        String apellido="";
        int i=0;
        while(cadena.charAt(i)!=','){i++;}
        apellido=cadena.substring(0,i);
        nombre=cadena.substring(i+1, cadena.length()); //la propia funcion hace desde el indice de inicio
        System.out.println(cadena.length());           //hasta el indice final -1
        cadena=nombre+' '+apellido;
        return cadena;
    }
    
    public static void main(String[] args){
        System.out.println(intercambiar("de León Botella,Joan Francesc"));
        
    }
}
