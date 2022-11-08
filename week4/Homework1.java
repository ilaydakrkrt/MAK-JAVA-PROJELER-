/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author user
 */import java.util.Scanner;
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("bir a sayısı giriniz");
        int a= input.nextInt();
        int bölen=1;
        while(bölen<=a){
            if(a%bölen==0){
                System.out.println("bölen"+bölen);
                
            }
            bölen++;
            
        }
        
        
            }
    
}
