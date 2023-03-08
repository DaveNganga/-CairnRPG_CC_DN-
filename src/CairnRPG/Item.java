package CairnRPG;

public class Item {
    private String name;
    private int healingPower;

    Item(){
        name = "Potion";
        healingPower = 10;
    }

    //constructor
    public Item(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    //method
    public String info() {
        return "CairnRPG.Item: " + name + "\nHealing Power: " + healingPower;
    }
}
