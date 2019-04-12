
import java.util.Scanner;


public class Java2 {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi1,sayi2;
        
        System.out.println("Birinci sayiyi giriniz : "); 
        sayi1=scanner.nextInt(); //Birinci sayıyı almak için
        
        System.out.println("İkinci sayiyi giriniz : ");
        sayi2=scanner.nextInt(); //İkinci sayıyı almak için
         
        System.out.println("Değiştirilmeden önce : sayi1 = "+sayi1+"sayi2"+sayi2);
        
        
        int gecici=sayi1;
        sayi1=sayi2;
        sayi2=gecici;
        
        System.out.println("Birinci sayi"+sayi1);
        System.out.println("İkinci sayi"+sayi2);
      
        
        
    }
    
}
