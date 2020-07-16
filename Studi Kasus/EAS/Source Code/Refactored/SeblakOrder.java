package Refactored;

import Refactored.Seblak.Seblak;
import Refactored.Topping.Ceker;
import Refactored.Topping.Tulang;

public class SeblakOrder {
    private int jumlah;
    private Seblak seblak;

    public SeblakOrder(Seblak s, int jml) {
        seblak = s;
        jumlah = jml;
    }

    public float hitungTotalHarga() {
        return seblak.getHarga() * jumlah;
    }

    public int getJumlahBeli() {
        return jumlah;
    }

    public Seblak getSeblak() {
        return seblak;
    }

    public void tambahCeker() {
        this.seblak = new Ceker(this.seblak, 1);
    }

    public void tambahCeker(int jml) {
        this.seblak = new Ceker(this.seblak, jml);
    }

    public void tambahTulang() {
        this.seblak = new Tulang(this.seblak, 1);
    }

    public void tambahTulang(int jml) {
        this.seblak = new Tulang(this.seblak, jml);
    }

}