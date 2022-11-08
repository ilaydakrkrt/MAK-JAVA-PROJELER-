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
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("satır sayısı giriniz");
        int satır=input.nextInt();
        
        System.out.println("sütun sayısı giriniz");
        int sütun=input.nextInt();
        
        for (int i=1; i<=satır; i++){
             for (int j =1; j<=sütun; j++){
        
            System.out.print("*");
            
             }
            System.out.println("*");
    }
    
    }
}
    