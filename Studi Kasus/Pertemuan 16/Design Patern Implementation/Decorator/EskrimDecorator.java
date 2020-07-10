package Decorator;

public class EskrimDecorator implements  Eskrim{
    protected Eskrim eskrimSpesial;
    
    public EskrimDecorator(Eskrim eskrimSpesial){
        this.eskrimSpesial = eskrimSpesial;
    }
    @Override
    public String buatEskrim(){
        return eskrimSpesial.buatEskrim();
    }
}
