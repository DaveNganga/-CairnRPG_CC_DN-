public class Character {
    public String name;
    public double health;
    public double attackPower;
    public boolean isAlive;

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

    public boolean runAway() {
        double probability = Math.random();
        double successRate = 0.51;
        if (probability > successRate) {
            System.out.println("The character successfully runs away!");
            return true;
        } else {
            System.out.println("The character fails to run away.");
            return false;
        }
    }

}



