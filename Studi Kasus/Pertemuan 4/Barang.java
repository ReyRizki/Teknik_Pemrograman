public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public String getKode()
    {
        return this.kode_barang;
    }

    public String getNama()
    {
        return this.nama_barang;
    }

    public int getStok()
    {
        return this.stok;
    }

    public void addStock(int stock)
    {
        this.stok += stock;
    }
    
    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }
}