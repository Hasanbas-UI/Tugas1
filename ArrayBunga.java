public class ArrayBunga {
    public static void main(String[] args) {

        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] totalStock = new int[4];
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalStock[j] += stockBunga[i][j];
            }
        }
        System.out.println("Jumlah Stock Bunga di Seluruh Cabang:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.println(jenisBunga[i] + ": " + totalStock[i]);
        }

        int totalPendapatan = 0;
        int[] penguranganStok = {-1, -2, 0, -5}; 
        for (int i = 0; i < penguranganStok.length; i++) {
            totalPendapatan += hargaBunga[i] * (stockBunga[0][i] + penguranganStok[i]);
        }

        System.out.println("Total Pendapatan dari RoyalGarden 1 jika Semua Bunga Terjual Habis: Rp " + totalPendapatan);
    }
}
