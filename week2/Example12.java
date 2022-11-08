//* Adım1= gaz basıncını yazınız.
//* Adım2= gaz hacmini yazınız.
//* Adım3= sıcaklığı yazınız.
//* Adım4= mol formülünü yazınız.
//* Adım5= molü hesaplayınız.
//* Adım6= bitir.
 

/**
 *
 * @author user
 */import java.util.Scanner;
public class Example12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("gaz basıncını yazınız");
        double basınç = input.nextDouble();
        System.out.println("gaz hacmini yazınız");
        double hacim = input.nextDouble();
        System.out.println("sıcaklığı yazınız");
        double sıcaklık = input.nextDouble();
        double mol = (basınç * hacim)/ 0.082 * sıcaklık;
        System.out.println("gazın mol sayısı"+mol); 
        
    }
    
}
