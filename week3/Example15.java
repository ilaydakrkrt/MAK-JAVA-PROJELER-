/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author user
 */ import java.util.Scanner;
public class Example15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" bir n sayı giriniz");
        int n = input.nextInt();
        int toplam=0;
        while(n>0){
            int kalan= n%10;
            toplam= toplam+kalan;
            n/=10;
            
        }
        System.out.println("basamaklar toplamı"+toplam);
        
        
        
         
    }
    
}
