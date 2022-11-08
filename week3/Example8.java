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
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.println("n sayısı girin");
        double n = input.nextDouble();
        
        int toplam=0;
        int S=1;
        while (S<=n) {      
            toplam= toplam+S ;
            S =S+2;
        }
            System.out.println("toplam"+toplam);
            
            
        
        
            
               
    }
    
   
}
