package Refactored;

import Refactored.Seblak.Seblak;
import Refactored.Seblak.SeblakKerupukMerah;
import Refactored.Seblak.SeblakMakaroni;

public class SeblakMain {
    public static void main(String[] args) {
        Seblak kerupuk = new SeblakKerupukMerah();
        Seblak makroni = new SeblakMakaroni();

        // Seblak kerupuk = new Seblak("Seblak Kerupuk Merah", 10000);
        // Seblak makroni = new Seblak("Seblak Makroni", 8000);
        
        SeblakOrder t1 = new SeblakOrder(kerupuk, 1); // Pesanan ke1
        
        SeblakOrder t2 = new SeblakOrder(kerupuk, 2); // Pesanan ke2
        t2.tambahCeker(2);

        SeblakOrder t3 = new SeblakOrder(makroni, 3); // Pesanan ke3
        t3.tambahCeker(3);
        t3.tambahTulang();

        System.out.println(t1.hitungTotalHarga());
        System.out.println(t2.hitungTotalHarga());
        System.out.println(t3.hitungTotalHarga());
    }
}