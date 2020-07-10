package Decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Eskrim eskrim = new MarshmallowDecorator(new CeresDecorator(new EskrimSimple()));
        System.out.println(eskrim.buatEskrim());
    }
}
