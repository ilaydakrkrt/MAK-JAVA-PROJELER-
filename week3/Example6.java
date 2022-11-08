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
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("k1 alınız");
        double k1  =input.nextDouble();
        System.out.println("k2 alınız");
        double k2 = input.nextDouble();
        System.out.println("k3 alınız");
        double k3 = input.nextDouble();
        
        if ( k1==k2 && k1==k3 && k2==k3) {
            System.out.println("üçgen eşkenardır");
            
        }
        else if (k1==k2 && k1!=k3 && k2!=k3){
            System.out.println("üçgen ikizkenardır");
               
        }
        else if (k1!=k2 && k1!=k3 && k2!=k3){
            System.out.println("üçgen çeşitkenardır");
        }
    }
}
