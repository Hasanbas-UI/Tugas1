public class Tugas2Uang {
    public static void main(String[] args) {
        double initialBalance = 1000000; 
        double targetBalance = 1500000; 
        double monthlyInterestRate = 0.02; 

        int months = 0;
        double currentBalance = initialBalance;

        while (currentBalance < targetBalance) {
            currentBalance += currentBalance * monthlyInterestRate;
            months++;
        }

        System.out.println("Saldo nasabah mencapai " + targetBalance + " setelah " + months + " bulan.");
    }
}
