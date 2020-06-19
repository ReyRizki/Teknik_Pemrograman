import java.util.LinkedList;

public class Shinobi {
    protected String name;
    protected LinkedList<String> jutsus;

    public Shinobi(String name) {
        this.name = name;
        this.jutsus = new LinkedList<String>();
    }
}