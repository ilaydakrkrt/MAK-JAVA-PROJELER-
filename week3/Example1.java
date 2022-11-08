/* Adım 1 = 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("sayi al oku");
        double sayi =input.nextDouble();
        
        if (sayi%2==0) {
            System.out.println ("çift");
        }
        else {
                System.out.println("tek");  
        }       
        
       
    }
    
}
