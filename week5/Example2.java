/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int vize,fnl;
            
            do
            {
                System.out.println("vize notu girin");
                vize=input.nextInt();
                System.out.println("fnl notu girin");
                fnl=input.nextInt();
            }
            while (vize<0 || fnl<0 || fnl>100 || vize>100);
            
                double ort=(vize*40)/100+(fnl*60)/100;
               
                if(ort>=80 && ort<=100)
                {
                   System.out.println("A");
                }
                
                else if(ort>=60 && ort<=79)
                {
                    System.out.println("B")  ;
                }

                else if(ort>=50 && ort<=59)
               {
                   System.out.println("C");
               }
                    
              else if(ort>=0 && ort<=49)
              {
                  System.out.println("D");
              }
                
                
            }
    }
