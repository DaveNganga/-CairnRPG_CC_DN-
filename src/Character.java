public class Character {
    private String name;
    private double health;
    private double attackPower;
    private boolean isAlive;

    Character(){
        name = "Professor Petcaugh";
        health = 100;
        attackPower = 50;
        isAlive = true;
    }
    //Constructor
    public Character(String name, double health, double attackPower, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    //getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(float attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //Methods
    public String info() {
        return "Name: " + name + "\nHealth: " + health + "\nAttack Power:" + attackPower + "\nIs Alive" + isAlive;
    }

    public boolean runAway(){
        System.out.println("TBD");
        return false;
    }

}

