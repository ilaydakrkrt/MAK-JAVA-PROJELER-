
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
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("n sayısı giriniz");
        int n=input.nextInt();
        int s =1;
        int çarpım=1;
        while (s<=n){
            çarpım=s*çarpım;
            s=s+1;
        }
            System.out.println("çarpım"+çarpım);
        
                
    }
    
}
  