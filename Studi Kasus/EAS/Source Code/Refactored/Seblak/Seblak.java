package Refactored.Seblak;

public class Seblak {
    private float harga;
    private String nama;

    public Seblak(String nama, float harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public float getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }
}