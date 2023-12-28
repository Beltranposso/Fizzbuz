/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Alejandro
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        for(int i = 0 ; i <= 100; i++){
            System.out.println(i);
            
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println("fizzbuz");
            }
             if(i % 3 == 0 ){
                System.out.println("fizz");
            }
             if(i % 5 == 0){
                System.out.println("buzz");
            }
        }
    }
    
}
