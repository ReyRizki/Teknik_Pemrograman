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
    }

    public boolean addNiece(String name, int day, int month) {
        if (this.findNiece(name) != null)
            return false;
        else {
            this.nieces.add(new Niece(name, day, month));
            return true;
        }
    }

    public Uncle findUncle(String name) {
        Iterator<Uncle> it = this.uncles.iterator();

        while (it.hasNext()) {
            Uncle temp = (Uncle) it.next();

            if (temp.getName() == name) 
                return temp;
        }

        return null;
    }

    public Niece findNiece(String name) {
        Iterator<Niece> it = this.nieces.iterator();

        while (it.hasNext()) {
            Niece temp = (Niece) it.next();

            if (temp.getName() == name)
                return temp;
        }

        return null;
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