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
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("a sayısı alınız");
        double a = input.nextDouble();
        
        
        if (a>0) {
            System.out.println("a pozitiftir");
        }
        
        else if (a==0){
            System.out.println("a sıfırdır");
           
        }
        else if (a<0)  {
            System.out.println("a negatiftir");
        }
        }
        
    }

   
    

