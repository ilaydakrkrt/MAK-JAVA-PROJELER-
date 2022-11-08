/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author user
 */import java.util.Scanner ;
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("n sayısı giriniz");
        int n =input.nextInt();
        int S=1;
        int tek=0;
        int cift=0;
        while (S<=n){
            if (S%2 ==0){
            cift=cift+S;
            S=S+1;
            }
        
           else { tek=tek+S;
           S=S+1;
             }
                }System.out.println("cift"+cift+ "tek"+tek);
        }
        

    
}
