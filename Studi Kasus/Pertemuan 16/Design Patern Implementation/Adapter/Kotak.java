package Adapter;

public class Kotak {
    private int sisi;
    
    public Kotak() {}
    
    public Kotak(int sisi) {
        this.sisi = sisi;
    }
    
    public int getSisi() {
        return sisi;
    }
    
    public int getLuas() {
        int hasil;
        hasil = sisi*sisi;
        return hasil;
    }
}
