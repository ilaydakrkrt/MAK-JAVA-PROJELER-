/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       System.out.println("kürenin yarıçapını giriniz");
       double r= input.nextDouble();
       double hacim= 4*3.14*r*r*r/3;
       double alan=4*3.14*r*r;
       System.out.println("hacim"+hacim);
       System.out.println("alan"+alan);
 
    }
    
}
