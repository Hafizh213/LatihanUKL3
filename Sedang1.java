import java.util.Scanner;

public class Sedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("Masukkan Bilangan Bulat Positif:");
        int b = input.nextInt();

        if (b < 0) {
            System.out.println("Bilangan bulat harus positif.");
        } else {
            int faktorial = 1;
            for (int i = 1; i <= b; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + b + " adalah: " + faktorial);
        }
    }
}
