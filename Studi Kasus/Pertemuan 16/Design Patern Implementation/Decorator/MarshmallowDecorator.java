package Decorator;

public class MarshmallowDecorator extends EskrimDecorator {

    public MarshmallowDecorator(Eskrim eskrimSpesial) {
        super(eskrimSpesial);
    }

    @Override
    public String buatEskrim() {
        return eskrimSpesial.buatEskrim() + tambahMarshmallow();
    }

    private String tambahMarshmallow() {
        return " + Mini Marshmallow";
    }
}
