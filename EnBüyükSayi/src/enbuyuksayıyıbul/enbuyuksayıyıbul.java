
package enbuyuksayıyıbul;

import java.util.Scanner;


public class enbuyuksayıyıbul {

    
    public static void main(String[] args) {
        //Kullanıcıdan alınan 3 sayıdan en büyüünü bulma
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        int y=a.nextInt();
        int z=a.nextInt();
        
        if(x>y && x>z)
        {
            System.out.println("En büyük sayı = "+x);
        }
        else if(y>x&&y>z)
        {
            System.out.println("En büyük sayi = "+y);
        }
        else if(z>y && z>x)
        {
            System.out.println("En büyük sayı = "+z);
        }
        else
          {
              System.out.println("Tek basina büyük bir sayi yooktur...");
        }
        
    }
    
}
