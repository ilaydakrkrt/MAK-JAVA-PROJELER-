/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Üçgenin bir kenar uzunluğunu giriniz");
        double a = input.nextDouble();
        System.out.println("üçgenin yüksekliğini giriniz");
        double h = input.nextDouble();
        double işlem = a*h/2;
        System.out.println("işlem"+işlem);
    }
    
}
