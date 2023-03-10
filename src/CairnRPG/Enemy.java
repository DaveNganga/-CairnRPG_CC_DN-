package CairnRPG;

import java.util.Random;

public class Enemy extends Character {
    private int magicPoints;

    Enemy(){
        health = 100;
        attackPower = 50;
        isAlive = true;
        name = "Dangerous Dave";
    }
    //Constructors
    public Enemy(String name, double health, double attackPower, boolean isAlive) {
        super(name,health,attackPower,isAlive);

    }
    public Enemy(double health, double attackPower, boolean isAlive) {
        super("Big Bad Wolf",health,attackPower,isAlive);

    }
    //Methods
    public String info() {
        return "Name: " + this.name + "\nHealth: " + this.health + "\nAttack Power:" + attackPower + "\nIs Alive:" + isAlive + "\nMagic Points:" + magicPoints;
    }
    public boolean fight(Hero Hero){
        if (Hero.isAlive){
            Random rand = new Random();
            int upperBound = 10;
            int int_random = rand.nextInt(upperBound);
            if(int_random == upperBound - 3){
                System.out.println("That was a critical hit!");
                Hero.setHealth(Hero.getHealth()-attackPower*2);
                System.out.println("- "+ attackPower*2 +" health points");
            } else {
                Hero.setHealth(Hero.getHealth()-attackPower);
                System.out.println("- "+ attackPower*2 +" health points");
            }
            return true;
        }
        else {
            System.out.println(Hero.getName() + " is dead.");
            return false;
        }
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }
}

