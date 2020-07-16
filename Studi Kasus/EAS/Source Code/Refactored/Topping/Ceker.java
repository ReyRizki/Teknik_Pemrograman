package Refactored.Topping;

import Refactored.Seblak.Seblak;

public class Ceker extends Topping {
    private Seblak seblak;
    private int jumlah;
    private final int HARGA_CEKER = 500;

    public Ceker(final Seblak seblak, int jumlah) {
        this.seblak = seblak;
        this.jumlah = jumlah;
    }

    @Override
    public String getName() {
        return this.seblak.getNama() + ", " + jumlah + " ceker";
    }

    @Override
    public float getHarga() {
        return this.seblak.getHarga() + this.jumlah * HARGA_CEKER;
    }
}