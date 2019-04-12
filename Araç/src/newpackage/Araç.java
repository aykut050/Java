package newpackage;


import java.util.Scanner;


public class Araç {
   
    public static void main (String[] args)
    {    
        Scanner scanner = new Scanner(System.in);//Kullanıcıdan veri almak için Scanner sınıfı kullanılır
        System.out.println("Aracınız kilometrede ne kadar yakmaktadır ?");
        double yakılan= scanner.nextDouble();//Girdi alacağız kullanıcıdan double tipinde
        System.out.println("Kaç kilometre yol yaptınız ?");
        double kilometre= scanner.nextDouble();//Burada da kullanıcıdan double tipinde veri alınır
        
        double Toplam=yakılan*kilometre;
        System.out.println("Ödemeniz gereken tutar = "+Toplam);
    }
    
}
