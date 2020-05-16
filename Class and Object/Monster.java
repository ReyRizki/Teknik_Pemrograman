public class Monster
{
    private String type;
    private int health;
    private int damage;
    private int specialDamage;

    public Monster(String type, int health, int damage, int specialDamage)
    {
        this.type = type;
        this.health = health;
        this.damage = damage;
        this.specialDamage = specialDamage;
    }

    public String getType()
    {
        return this.type;
    }

    public int getHealth()
    {
        return this.health;
    } 

    public int getDamage()
    {
        return this.damage;
    }

    public int getSpecial()
    {
        return this.specialDamage;
    }

    public void receiveDamage(int wound)
    {
        this.health = this.health - wound;
    }
}