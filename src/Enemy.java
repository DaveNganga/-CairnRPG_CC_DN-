public class Enemy extends Character {
    private int magicPoints;

    Enemy(){
        health = 100;
        attackPower = 50;
        isAlive = true;
        name = "Dangerous Dave";
    }
    //Constructor
    public Enemy(String name, double health, double attackPower, boolean isAlive) {
        super(name,health,attackPower,isAlive);
        this.name = "Dangerous Dave";

    }
    //Methods
    public String info() {
        return "Name: " + this.name + "\nHealth: " + this.health + "\nAttack Power:" + attackPower + "\nIs Alive:" + isAlive + "\nMagic Points:" + magicPoints;
    }
    public boolean fight(Hero Hero){
        System.out.println("You are fighting" + Hero.getName());
        return false;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }
}

