import java.util.Scanner;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}