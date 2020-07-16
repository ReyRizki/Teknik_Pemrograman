package Refactored;

import Refactored.Seblak.Seblak;
import Refactored.Topping.Ceker;

public class SeblakOrder {
    private int jumlah;
    private Seblak seblak;
    private boolean tambahTulang;
    private static float hargaTulang = 1000;

    public SeblakOrder(Seblak s, int jml) {
        seblak = s;
        jumlah = jml;
        tambahTulang = false;
    }

    public float hitungTotalHarga() {
        float harga = (seblak.getHarga() * jumlah);
        if (tambahTulang) {
            harga += hargaTotalTulang();
        }

        return harga;
    }

    public int getJumlahBeli() {
        return jumlah;
    }

    public Seblak getSeblak() {
        return seblak;
    }

    private float hargaTotalTulang() {
        return hargaTulang * getJumlahBeli();
    }

    public void tambahCeker(int jml) {
        this.seblak = new Ceker(this.seblak, jml);
    }

    public void setTambahTulang() {
        tambahTulang = true;
    }

}