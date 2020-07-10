package Adapter;

public class KotakAdapter extends Kotak {
    private Lingkaran circle;
    
    public KotakAdapter(Lingkaran circle) {
        this.circle = circle;
    }
    
    @Override
    public int getLuas() {
        int hasil;
        hasil = (int)circle.getLuas();
        return hasil;
    }
    
}
