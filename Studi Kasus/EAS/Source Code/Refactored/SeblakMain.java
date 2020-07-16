package Refactored;

import Refactored.Seblak.Seblak;

public class SeblakMain {
    public static void main(String[] args) {
        Seblak kerupuk = new Seblak("Seblak Kerupuk Merah", 10000);
        Seblak makroni = new Seblak("Seblak Makroni", 8000);
        
        SeblakOrder t1 = new SeblakOrder(kerupuk, 1); // Pesanan ke1
        
        SeblakOrder t2 = new SeblakOrder(kerupuk, 2); // Pesanan ke2
        t2.setTambahCeker(2);

        SeblakOrder t3 = new SeblakOrder(makroni, 3); // Pesanan ke3
        t3.setTambahCeker(3);
        t3.setTambahTulang();

        System.out.println(t1.hitungTotalHarga());
        System.out.println(t2.hitungTotalHarga());
        System.out.println(t3.hitungTotalHarga());
    }
}