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
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {int i,n; float t1=0,t2=1,t3=0;
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif n tam sayısı giriniz");
        n=input.nextInt();
        for(i=1; i<=n; i++) t1+=i;
        for(i=1; i<=n; i+=2) t2+=i;
        for (i=2; i<=n; i+=2) t3+=i;
        System.out.println("1 den n e kadarki sayıların toplamı"+t1);
        System.out.println("1 den n e kadarki tek sayıların toplamı"+t2);
        System.out.println("1 den n e kadarki çift sayıların toplamı"+t3);
                
            
        }
        
    }
    
}
