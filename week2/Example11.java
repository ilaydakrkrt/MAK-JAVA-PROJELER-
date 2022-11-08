/*
 * Adım 1= dikdörtgenin uzun kenarını yazınız.
 * Adım 2= dikdörtgenin kısa kenarını yazınız.
 * Adım 3= dikdörtgenin çevre formülünü yazınız.
 * Adım 4 = dikdörtgenin çevresini hesaplayınız.
 * Adım 5 = bitir.


/**
 *
 * @author user
 */import java.util.Scanner;
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("dikdörtgenin uzun kenarını yazınız");
        double uzun = input.nextDouble ();
        System.out.println("dikdörtgenin kısa kenarını yazınız");
        double kısa = input.nextDouble();
        double çevre = uzun * 2 + kısa * 2 ;
        System.out.println("dikdörtgen çevresi:"+çevre);
        
    }
    
}
