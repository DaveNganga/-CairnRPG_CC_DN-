package CairnRPG;

public class Hero extends Character {
    private int level;
    private int experience;
    private float money;
    private Item[] inventory = new Item[5];

    Hero(){
        health = 100;
        attackPower = 50;
        isAlive = true;
    }
    //Constructor
    public Hero(double health, double attackPower, boolean isAlive) {
        super("Link", health,attackPower,isAlive);

    }
    //Methods
    public String info() {
        return "Name: " + this.name + "\nHealth: " + this.health + "\nAttack Power:" + attackPower + "\nIs Alive" + isAlive + "Money: " + this.money + "\nExperience: " + this.experience + "\nLevel:" + level + "\ninventory:" + inventory.toString();
    }
    public boolean fight(String Enemy){
        System.out.println("You are fightin" + Enemy);
        return false;
    }
    public void levelUp(){
        this.level += 1;
        System.out.println("Congratulations your character has leveled up");
    }
    public int useItem(int i){
        //
        System.out.println("you have used item number" + i + "in your inventory");
        return i;
    }
    public boolean addToInventory(Item Item){
        // needs to be immplemented
        return true;
    }
    public String showInventory(){
        String answer = "Your inventory contains: ";
        for(Item item: inventory ) answer += item.toString();
        return answer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }
}

