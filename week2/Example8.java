/*
 * Adım 1= başla
 * Adım 2= iletkenin direncini giriniz.
 * Adım 3= iletkenin akımını giriniz.
 * Adım 4= iletkenin gerilimini hesaplayınız.
 * Adım 5= bitir.

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("iletkenin direncini giriniz");
        double direnç = input.nextDouble();
        System.out.println("iletkenin akımını giriniz");
        double akım = input.nextDouble();
        double gerilim = direnç * akım;
        System.out.println("gerilim"+gerilim);
        
              
    }
    
}
