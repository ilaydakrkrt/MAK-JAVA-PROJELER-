/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("alt sınır giriniz");
        int alt=input.nextInt();
        System.out.println("üst sınır giriniz");
        int üst = input.nextInt();
        
        for(int i =alt; i<=üst; i++){
            if (i%3==0||i%4==0){
                System.out.println(i);
                
       
      
        
                   
            }
        }
              
                
    }
    
}
