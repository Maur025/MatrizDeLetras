
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauro
 */
public class JavaMatrizLetras {

    /**
     * @param args the command line arguments
     */
    public static void mostrar(String mat[][],int n){
        for(int i = 0;i < n; i++)
        {
            for(int j = 0;j < n; j++){
                System.out.print("   " + mat[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una letra: ");
        String dato = entrada.next();
        String mz[][] = new String[3][3];
        //String [] diccionario = new String[18];
        String diccionario[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q"};
        //System.out.println("Entrada: " + dato);
        int valorIn = 0; 
        for(int i = 0;i < diccionario.length; i++){
            //System.out.println(diccionario[i]);
            //System.out.println(dato);
            if( diccionario[i].equals(dato) ){
                System.out.println(i);
                valorIn = i;
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 2; j > -1; j--){
                valorIn = valorIn + 1;
                mz[i][j] = diccionario[valorIn] ;
            }
        }
        System.out.println("Resultado: ");
        mostrar(mz,3);
        
        //System.out.println("elegiste la : " + valorIn);
    }
    
}
