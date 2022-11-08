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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       System.out.println("sayi1 alınız");
       double sayi1= input.nextDouble();
       System.out.println("sayi2 alınız");
       double sayi2= input.nextDouble();
       System.out.println("sayi3 alınız");
       double sayi3= input.nextDouble();
       
       
       if (sayi1 > sayi2 && sayi1 > sayi3){
           System.out.println ("sayi1 en büyüktür");
       }
       else if (sayi2 > sayi1 && sayi2 > sayi3){
           System.out.println("sayi2 en büyüktür");
       }
       else if (sayi3 > sayi2 && sayi3 > sayi1){
           System.out.println("sayi3 en büyüktür");
       }
       else {
           System.out.println ("büyüklük kıyaslanamaz");
       }
    
    
           
           
       }
        
       
    }
    
