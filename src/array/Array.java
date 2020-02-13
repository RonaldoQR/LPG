/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author l11m06
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] listaNumeros = {1,4,7,8,9,7,4,1,8};

        for (int i=0; i<listaNumeros.length; i++){
            //System.out.println("Número "+listaNumeros[i]);
            boolean NRepetido = false;
            for (int j=0; j<listaNumeros.length; j++){
                
                if(listaNumeros[i]==listaNumeros[j] && i!=j){
                    NRepetido=true;
                    //System.out.println("El número "+listaNumeros[i]+ " esta en la posición "+j);
                  break;
                }
                
            }
            if(!NRepetido){
                System.out.println("El primer número que no se repite es "+listaNumeros[i]+ " y esta en la posición "+i);
                break;
            }
            
        }
        
        
        
        //int[] listaNumerosLeidos = new int[listaNumeros.length];
        
   
    }
    
}
