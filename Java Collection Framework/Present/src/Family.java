import java.util.Iterator;
import java.util.TreeSet;

public class Family 
{
    private TreeSet<Uncle> uncles;
    private TreeSet<Niece> nieces;

    // =============
    //  CONSTRUCTOR
    // =============

    public Family() 
    {
        this.uncles = new TreeSet<Uncle>();
        this.nieces = new TreeSet<Niece>();
    }

    // ===========
    //  ACCESSORS
    // ===========

    public TreeSet<Niece> getNieces()
    {
        return this.nieces;
    }

    public TreeSet<Uncle> getUncles()
    {
        return this.uncles;
    }

    public Uncle findUncle(String name) 
    {
        Iterator<Uncle> it = this.uncles.iterator();

        while (it.hasNext()) {
            Uncle temp = (Uncle) it.next();

            if (temp.getName().equals(name))
                return temp;
        }

        return null;
    }

    public Niece findNiece(String name) 
    {
        Iterator<Niece> it = this.nieces.iterator();

        while (it.hasNext()) 
        {
            Niece temp = (Niece) it.next();

            if (temp.getName().equals(name));
                return temp;
        }

        return null;
    }

    public void listUncles() 
    {
        Iterator<Uncle> it = this.uncles.iterator();

        while (it.hasNext()) 
        {
            System.out.println(it.next());
        }
    }

    public void listNieces() 
    {
        Iterator<Niece> it = this.nieces.iterator();

        while (it.hasNext()) 
        {
            System.out.println(it.next());
        }
    }

    // ==========
    //  MUTATORS
    // ==========

    public boolean addUncle(String name) 
    {
        Uncle temp = new Uncle(name);

        if (uncles.contains(temp))
            return false;
        else 
        {
            this.uncles.add(temp);
            return true;
        }
    }

    public boolean addNiece(String name, int day, int month) 
    {
        if (this.findNiece(name) != null)
            return false;
        else 
        {
            this.nieces.add(new Niece(name, day, month));
            return true;
        }
    }

    public void birthday(Niece niece, TreeSet<Uncle> uncles)
    {
        try
        {
            System.out.println("Today is " + niece.getName() + "\'s birthday!");
            System.out.println("She gets:");
    
            niece.listPresents(uncles);
    
            niece.clearPresents();
    
            Iterator<Uncle> it = uncles.iterator();
    
            while (it.hasNext())
            {
                Uncle temp = (Uncle) it.next();
    
                if (temp.getPresents().containsKey(niece))
                    temp.getPresents().remove(niece);
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("Niece is not exist\n");
        }
    }
}