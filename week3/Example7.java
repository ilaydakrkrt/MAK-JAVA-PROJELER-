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
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("1 ile 7 arasında bir sayi giriniz");
        double sayi = input.nextDouble();
        if ( sayi==1) {
             System.out.println ("günlerden pazartesidir");
         }
         else if ( sayi==2) {
             System.out.println("günlerden salıdır");
         } 
         else if ( sayi==3) {
             System.out.println("günlerden çarşambadır");
         }
         else if (sayi==4){
             System.out.println("günlerden perşembedir");
         }
         else if (sayi==5){
             System.out.println("günlerden cumadır");
         }
         else if( sayi==6){
             System.out.println("günlerden cumartesidir");
         }
         else if (sayi==7){
             System.out.println("günlerden pazardır");
         
             }
    
        
    }
    
}
