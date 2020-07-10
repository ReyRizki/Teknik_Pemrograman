package Proxy;

public class main {
    public static void main(String[] args){
        
        //Jika transaksi berhasil
        boolean cek = true;
        Valid akunValid = new Valid(cek);
        ProxyCreditCard proxyCC = new ProxyCreditCard(akunValid);
        proxyCC.pay();
        
        System.out.println();
        
        //Jika transaksi gagal
        boolean cek2 = false;
        Valid akunValid2 = new Valid(cek2);
        ProxyCreditCard proxyCC2 = new ProxyCreditCard(akunValid2);
        proxyCC2.pay();
    }
}
