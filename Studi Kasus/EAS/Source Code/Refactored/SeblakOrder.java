package Refactored;

import Refactored.Seblak.Seblak;

public class SeblakOrder {
    private int jumlah;
    private Seblak seblak;
    private boolean tambahTulang;
    private boolean tambahCeker;
    private int jumlahCeker;
    private static float hargaTulang = 1000;
    private static float hargaCeker = 500;

    public SeblakOrder(Seblak s, int jml) {
        seblak = s;
        jumlah = jml;
        tambahTulang = false;
        tambahCeker = false;
    }

    public float hitungTotalHarga() {
        float harga = (seblak.getHarga() * jumlah);
        if (tambahTulang) {
            harga += hargaTotalTulang();
        }
        if (tambahCeker) {
            harga += hargaTotalCeker();
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

    private float hargaTotalCeker() {
        return hargaCeker * getJumlahBeli() * getJumlahCeker();
    }

    public void setTambahCeker(int jml) {
        jumlahCeker = jml;
        tambahCeker = true;
    }

    public int getJumlahCeker() {
        return jumlahCeker;
    }

    public void setTambahTulang() {
        tambahTulang = true;
    }

}