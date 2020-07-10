package Adapter;

public class Lingkaran {
    private double jarijari;
    
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double getJariJari() {
        return jarijari;
    }
    
    public double getDiameter() {
        return jarijari*jarijari;
    }
    
    public double getLuas() {
        double hasil;
        hasil = this.getDiameter()*3.14;
        return hasil;
    }
}
