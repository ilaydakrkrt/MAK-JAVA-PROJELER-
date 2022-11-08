/*
 *Adım 1= başla
 *Adım 2= Maddenin yüksekliğini giriniz.
 *Adım 3= Maddenin kütlesini giriniz.
 *Adım 4= Maddenin hızını giriniz.
 *Adım 5= Potansiyel enerji ve kinetik enerji formülünü giriniz.
 *
/**
 *
 * @author user
 */import java.util.Scanner;
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       System.out.println("maddenin yüksekliğini giriniz");
       double h= input.nextDouble();
       System.out.println("maddenin kütlesini giriniz");
       double m= input.nextDouble();
       System.out.println("maddenin hızını giriniz");
       double v= input.nextDouble();
       double potansiyel= m * 10 * h;
       System.out.println("potansiyel"+potansiyel);
       double kinetik=  m * v * v / 2;
       System.out.println("kinetik"+kinetik);
       
       
    
    }
}
