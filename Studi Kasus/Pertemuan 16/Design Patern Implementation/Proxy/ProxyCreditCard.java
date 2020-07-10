package Proxy;

public class ProxyCreditCard implements Pembayaran {
    
    private CreditCard creditCard;
    private Valid valid;
    
    public ProxyCreditCard (Valid valid){
        this.valid = valid;
        creditCard = new CreditCard();
    }
    
    public void pay(){
        if(valid.isChecked()){
            creditCard.pay();
        }else{
            System.out.println("Transaksi gagal!");
        }
    }
}
