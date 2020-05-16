public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public String GetFoodName(int id) {
        return this.nama_makanan[id];
    }

    public double GetFoodPrice(int id) {
        return this.harga_makanan[id];
    }

    public int GetStock(int id) {
        return this.stok[id];
    }

    public void FoodOrder(int id, int order) {
        if (this.stok[id] < order)
            System.out.println("Stok kurang");
        else
            this.stok[id] -= order;
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
        nextId();
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void nextId() {
        id++;
    }
}