import java.util.Iterator;
import java.util.TreeSet;

public class Family {
    private TreeSet<Uncle> uncles;
    private TreeSet<Niece> nieces;

    public Family() {
        this.uncles = new TreeSet<Uncle>();
        this.nieces = new TreeSet<Niece>();
    }

    public boolean addUncle(String name) {
        // Uncle uncleTemp = new Uncle(name);
        this.uncles.add(new Uncle(name));

        return true;
    }

    public void listUncles() {
        Iterator<Uncle> it = this.uncles.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}