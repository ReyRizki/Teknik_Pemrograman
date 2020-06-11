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
        Uncle temp = new Uncle(name);

        if (uncles.contains(temp))
            return false;
        else {
            this.uncles.add(temp);
            return true;
        }
        // Uncle uncleTemp = new Uncle(name);
    }

    public void listUncles() {
        Iterator<Uncle> it = this.uncles.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void listNieces() {
        Iterator<Niece> it = this.nieces.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}