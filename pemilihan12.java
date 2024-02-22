import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class Pemilihan12 {
    public static void main(String[] args){
        Scanner input10 = new Scanner(System.in);
         System.out.println("Program Menghitung Nilai AKhir");
         System.out.println("=============");

         System.out.print("Nilai Tugas: ");
         double tugas = input10.nextFloat();
         System.out.print("Nilai Kuis: ");
         double kuis = input10.nextFloat();
         System.out.print("Nilai UTS: ");
         double uts = input10.nextFloat();
         System.out.print("Nilai UAS: ");
         double uas = input10.nextFloat();

         System.out.println("==============");
         
         if(tugas < 100 && kuis < 100 && uts < 100 && uas < 100){
            double nilaiakhir = (tugas * 0.1) + (kuis *0.2) + (uts * 0.3) + (uas * 0.4);

            System.out.println("Nilai Akhir: " + nilaiakhir);

            if(nilaiakhir > 80 && nilaiakhir <=100)
                 System.out.println("Nilai Huruf: A");
            else if(nilaiakhir > 73 && nilaiakhir <=80)
                 System.out.println("Nilai Huruf: B+");
            else if(nilaiakhir > 65 && nilaiakhir <=73)
                 System.out.println("Nilai Huruf: B");
            else if(nilaiakhir > 60 && nilaiakhir <=65)
                 System.out.println("Nilai Huruf: C+");
            else if(nilaiakhir > 50 && nilaiakhir <=60)
                 System.out.println("Nilai Huruf: C");
            else if(nilaiakhir > 39 && nilaiakhir <=50)
                System.out.println("Nilai Huruf: D");
            else 
                System.out.println("Nilai Huruf: E");

                String pesan = nilaiakhir < 50 ? "Mohon Maaf Anda TIDAK LULUS  " : "Selamat Anda LULUS";
                System.out.println(pesan);

         }else{
            System.out.println("Nilai Tidak Valid!");
         }
    }
}