/*
 * Adım 1= başla
 * Adım 2= ilk sayıyı yazınız.
 * Adım 3= ikinci sayıyı giriniz.
 * Adım 4= üçüncü sayıyı giriniz.
 * Adım 5= ortalama formülü yazınız.
 * Adım 6 = bitir.

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("birinci notu giriniz");
        double x = input.nextDouble();
        System.out.println("ikinci notu giriniz");
        double y = input.nextDouble();
        System.out.println("üçüncü notu giriniz");
        double z = input.nextDouble();
        double ortalama= (x + y + z) / 3;
        System.out.println("ortalama"+ortalama);
        
    }
    
}
