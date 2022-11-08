/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("1. sayıyı giriniz");
        double a = input.nextDouble();
        System.out.println("2.sayıyı giriniz");
        double b = input.nextDouble();
        System.out.println("3.sayıyı giriniz");
        double c = input.nextDouble();
        //double kullanma sebebimiz ondalıklı sayılar olursa sonucun tam çıkması için. int kullanılırsa ondalıklı sayıların sadece tam kısmını alır ve hata verir
        
        double toplam = a + b +c ;
        double carpım = a * b * c;
        double ortalama = toplam/3;
        
        System.out.println("toplam"+toplam); //sözel ifadeler için çift tırnak
        System.out.println("carpım"+carpım);
        System.out.println("ortalama"+ortalama);
        
        
        
   
                
}
    }
    

