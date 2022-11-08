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
public class Homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("pozitif bir a tam sayısı giriniz");
        int a =input.nextInt();
        int b=0;
        while (a>0){
            int k=a%10;
            b=b*10+k;
            a=a/10;
                    
        }
        System.out.println(b);
        
    }
    
}
