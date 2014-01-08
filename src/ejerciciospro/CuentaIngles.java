/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospro;

public class CuentaIngles {
    public static void main(String[] args){
        String traduccion="";
        for(int i=1;i<=10;i++){
            switch(i){
                case 1: traduccion="one";
                    break;
                case 2: traduccion="two";
                    break;
                case 3: traduccion="three";
                    break;
                case 4: traduccion="four";
                    break;
                case 5: traduccion="five";
                    break;
                case 6: traduccion="six";
                    break;
                case 7: traduccion="seven";
                    break;
                case 8: traduccion="eight";
                    break;
                case 9: traduccion="nine";
                    break;
                case 10: traduccion="ten";
                    break;
            }
            System.out.println(traduccion);
        }
    }
}
