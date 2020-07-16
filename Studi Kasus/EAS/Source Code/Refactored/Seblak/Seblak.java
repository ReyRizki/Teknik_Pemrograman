package Refactored.Seblak;

/**
 * Absctract class Seblak as template for kinds of seblaks
 * 
 * @author ReyRizki
 */
public abstract class Seblak {
    protected String nama;

    public String getNama() {
        return nama;
    }

    public abstract float getHarga();
}