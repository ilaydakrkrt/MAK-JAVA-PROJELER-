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
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("a pozitif tam sayısı giriniz");
       int a =input.nextInt();
       System.out.println("b pozitif tam sayısı giriniz");
       int b = input.nextInt();
       
       int toplam=0;
       int S=0;
       while (S<a){
          toplam=toplam+b;
           S=S+1;
         }
           System.out.println("toplam"+toplam);
       }
      
       
       
       
    }
    
    

