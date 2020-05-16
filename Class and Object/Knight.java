import java.lang.Math;

public class Knight
{
    private String name;
    private int health;
    private int damage;
    private int defense;

    public Knight(String name, int health, int damage, int defense)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
    }

    public String getName()
    {
        return this.name;
    }

    public int getHealth()
    {
        return this.health;
    } 

    public int getDamage()
    {
        return this.damage;
    }

    public int getDefense()
    {
        return this.defense;
    }

    public void receiveDamage(int wound)
    {
        this.health = this.health - (wound - this.defense) ;
    }

    public static void main(String[] args)
    {
        Knight player = new Knight("Aegon", 10000, 500, 100);
        Monster slime = new Monster("Slime", 2000, 200, 500);

        System.out.println(player.getName() + "'s turn");
        slime.receiveDamage(player.getDamage());
        System.out.println(slime.getType() + "'s health: " + slime.getHealth() + "\n");
        
        System.out.println(slime.getType() + "'s turn");
        player.receiveDamage(((int) (Math.random() * 10) % 5) == 0 ? slime.getDamage() : slime.getSpecial());
        System.out.println(player.getName() + "'s health: " + player.getHealth() + "\n");
    }
}