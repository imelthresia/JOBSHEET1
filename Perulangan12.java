import java.util.Scanner;
public class Perulangan12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM (10 digit): ");
        String nim = scanner.nextLine();

        int n =Integer.parseInt(nim.substring(nim.length()-2));

        if (n < 10){
            n+=10;
        }
        for(int i = 1; i<=n; i++){
            if(i == 6 || i == 10) {
                continue;
            }
            else if (i % 2 !=0){
                System.out.print("*");
            }
            else{
                System.out.print(i+ " ");
            }
        }
    }
}