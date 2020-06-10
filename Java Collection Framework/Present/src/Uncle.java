import java.util.LinkedHashMap;

public class Uncle implements Comparable<Uncle> {
    private String name;
    private LinkedHashMap<Niece, String> presents;

    protected Uncle(String name) {
        this.name = name;
        this.presents = new LinkedHashMap<Niece, String>();
    }

    public String getName() {
        return this.name;
    }

    public int compareTo(Uncle u) {
        return this.name.compareTo(u.name);
    }

    public String toString() {
        return this.name;
    }
}