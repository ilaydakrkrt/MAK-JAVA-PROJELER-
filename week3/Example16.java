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
public class Example16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif n sayısı giriniz");
        int n =input.nextInt();
        boolean asalmi= true; //varsaydık
        for(int i =2; i<n; i++){
            if(n%i==0) {
                asalmi=false;
            }
        }
        if (asalmi==true && n!=1){
            System.out.println("sayı asaldır");
        }
        else {
            System.out.println("sayı asal değildir");
            
        }
    }
    
}
