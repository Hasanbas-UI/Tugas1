    import java.util.Scanner;
public class Tugas1SmileLaundry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tarifPerKg = 4500;
        double diskonPersen = 0.05;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan nama pelanggan (atau ketik 'selesai' untuk berhenti): ");
            String nama = scanner.nextLine();
            
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            
            System.out.print("Masukkan berat pakaian (kg): ");
            double beratPakaian = scanner.nextDouble();
            scanner.nextLine(); 

            double totalBiaya = beratPakaian * tarifPerKg;
            
            if (beratPakaian > 10) {
                double diskon = totalBiaya * diskonPersen;
                totalBiaya -= diskon;
                System.out.println("Selamat! Anda mendapatkan diskon 5%.");
            }
            
            totalPendapatan += totalBiaya;
            System.out.println("Total biaya cucian untuk " + nama + ": Rp. " + totalBiaya);
        }
        
        System.out.println("Total pendapatan laundry hari ini: Rp. " + totalPendapatan);
    }
}
