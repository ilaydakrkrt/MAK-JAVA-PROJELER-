

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */ 
import java.util.Scanner; //java 'nın util'kütüphanesine ait Scenner Class'ı import edildi.

public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);// Değer almak için tanımladı
        System.out.println("Lütfen km cinsinden değer giriniz");
        int km = input.nextInt();
       int metre= km * 1000;
       System.out.println("hesaplanan metre"+metre);
       
       
       
    }
    
}
