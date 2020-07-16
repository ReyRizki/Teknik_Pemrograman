package Refactored.Topping;

import Refactored.Seblak.Seblak;

public class Tulang extends Topping {
    private Seblak seblak;
    private int jumlah;
    private final int HARGA_TULANG = 1000;

    public Tulang(final Seblak seblak, int jumlah) {
        this.seblak = seblak;
        this.jumlah = jumlah;
    }

    @Override
    public String getName() {
        return this.seblak.getNama() + ", " + jumlah + " tulang";
    }

    @Override
    public float getHarga() {
        return this.seblak.getHarga() + this.jumlah * HARGA_TULANG;
    }
}