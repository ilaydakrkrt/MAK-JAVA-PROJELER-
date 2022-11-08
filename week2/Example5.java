/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("açıyı derece cinsinden giriniz");
        double açı = input.nextDouble();
        final double pi = 3.1415;
        double radyan = açı*3.1415/180;
        System.out.println("açının radyan cinsinden değeri: "+radyan);
        double grad = açı*10/9;
        System.out.println("açının grad cinsinden değeri: "+grad);
                        
                
               
        
    }
    
}
