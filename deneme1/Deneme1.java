
package deneme1;

import java.util.Scanner;




public class Deneme1 {

    
public static void notGir(int student_quantity,float[] notlar){ 
    //not girme metodumuz
            Scanner scan=new Scanner(System.in);

for(int i=0;i<student_quantity;i++){
    
System.out.println((i+1)+". öğrencinin notunu giriniz");
notlar[i]=scan.nextInt();

}

}
    
    
    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
                
    System.out.println("How many student in class ? ");
    int student_quantity=scan.nextInt();
    
float[] notlar = new float[student_quantity];

   
    notGir(student_quantity,notlar);
    
    for(int i=0;i<student_quantity;i++)
    {
        System.out.println((i+1) +". student's note ="+ notlar[i]);
        
    }
        
        
    }

    
}
