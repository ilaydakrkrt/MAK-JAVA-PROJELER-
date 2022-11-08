/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("b sayısı giriniz");
        int b=input.nextInt();
        
        for (int a=1; a<100; a++){
            if(b== (a*a*a)-(a*a)){
            System.out.println(a);
            }
            
        }
        
    }
    
}
