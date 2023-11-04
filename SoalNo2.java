
package utspbo;

import java.util.Scanner;

class Bmi {

    public void HitungBmi(float tb,float bb) {
    String kat;
    Float massatbh;
     
        massatbh=(bb/((tb/100)*(tb/100)));
   
   if (massatbh<18.5){
            kat="Underweight";
   }else if (massatbh<=22.9){
            kat="Normal";
   }else {
          kat="Overweight"; 
   }
   
   System.out.println("===============================");
   System.out.println("Kategori Berat Badan : "+ kat);       
    
    }
    
    }

public class SoalNo2 {
    public static void main(String[] args) {

    Bmi bmi = new Bmi();
        
  Scanner input = new Scanner(System.in);
    
  
   System.out.println("Masukan Berat dan Tinggi Badan");
   System.out.println("===============================");
   System.out.println();
   
   Float beratBadan,tinggiBadan;
   
   
   System.out.print("Berat Badan : ");
   beratBadan=input.nextFloat();
   
   System.out.print("Tinggi Badan : ");
   tinggiBadan=input.nextFloat();
  
   bmi.HitungBmi(beratBadan,tinggiBadan);
 
    }


}
