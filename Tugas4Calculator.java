import java.util.Scanner;

public class Tugas4Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Luas Segitiga");
                System.out.println("2. Luas Persegi Panjang");
                System.out.println("3. Luas Lingkaran");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu (1/2/3/4): ");
                int choice = scanner.nextInt();
    
                if (choice == 4) {
                    System.out.println("Terima kasih!");
                    break;
                }
    
                double area = 0;
    
                switch (choice) {
                    case 1:
                        area = calculateTriangleArea();
                        break;
                    case 2:
                        area = calculateRectangleArea();
                        break;
                    case 3:
                        area = calculateCircleArea();
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        continue;
                }
    
                System.out.println("Luas = " + area);
            }
        }
    
        public static double calculateTriangleArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan alas segitiga: ");
            double base = scanner.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double height = scanner.nextDouble();
            return 0.5 * base * height;
        }
    
        public static double calculateRectangleArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan panjang persegi panjang: ");
            double length = scanner.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double width = scanner.nextDouble();
            return length * width;
        }
    
        public static double calculateCircleArea() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan jari-jari lingkaran: ");
            double radius = scanner.nextDouble();
            return Math.PI * radius * radius;
        }
    }

    