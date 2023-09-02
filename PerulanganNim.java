import java.util.Scanner;

public class PerulanganNim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.print("Masukkan NIM: ");
        long nim = scanner.nextLong(); 
        System.out.println("===================");
        
        long n = nim % 100; 
        if (n < 10) {
            n += 10;
        }

        String[] days = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        
        System.out.println("HARI:");
        for (int i = 0; i < n; i++) {
            System.out.print(days[i % 7]);
            if (i < n - 1) {
                System.out.print(" ");
            }
            
            if ((i + 1) % 7 == 0) {
                System.out.println();
               
        
            }
            
        }

        scanner.close();
        
    }
    
}
