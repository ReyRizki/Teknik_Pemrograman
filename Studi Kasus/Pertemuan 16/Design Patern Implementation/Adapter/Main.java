package Adapter;

public class Main {
    public static void main(String Args[]) {
        Kotak kotak1 = new Kotak(15);
        Lingkaran lingkaran1 = new Lingkaran(15);
        KotakAdapter lingkaranInKotak = new KotakAdapter(lingkaran1);
        System.out.println("1. Luas Kotak = " + kotak1.getLuas());
        System.out.println("2. Luas Lingkaran = " + lingkaran1.getLuas());
        Pembanding hasilBanding = new Pembanding(kotak1.getLuas(), lingkaranInKotak.getLuas());
    }
}
