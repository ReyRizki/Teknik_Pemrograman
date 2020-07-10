package Decorator;

public class CeresDecorator extends EskrimDecorator{
    public CeresDecorator(Eskrim eskrimSpesial){
        super(eskrimSpesial);
    }

    @Override
    public String buatEskrim(){
        return eskrimSpesial.buatEskrim() + tambahCeres();
    }
    private String tambahCeres(){
        return " + Coklat Ceres";
    }
}
