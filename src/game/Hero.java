package game;

public class Hero {
    
    private String name;
    private int health = 100;
    private int attackDamage = 50;
    private int numHealthPotions = 3;
    private int healthPotionHealAmount = 30;
    private int healthPotionDropChance = 50;
    private int strength;
    private int level;

    public Hero() {
    }

    
    public Hero(String name) {
        this.name = name;
    }

    


    public Hero(String name, int health, int attackDamage, int numHealthPotions, int healthPotionHealAmount,
            int healthPotionDropChance, int strength, int level) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.numHealthPotions = numHealthPotions;
        this.healthPotionHealAmount = healthPotionHealAmount;
        this.healthPotionDropChance = healthPotionDropChance;
        this.strength = strength;
        this.level = level;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public int getNumHealthPotions() {
        return numHealthPotions;
    }
    public void setNumHealthPotions(int numHealthPotions) {
        this.numHealthPotions = numHealthPotions;
    }
    public int getHealthPotionHealAmount() {
        return healthPotionHealAmount;
    }
    public void setHealthPotionHealAmount(int healthPotionHealAmount) {
        this.healthPotionHealAmount = healthPotionHealAmount;
    }
    public int getHealthPotionDropChance() {
        return healthPotionDropChance;
    }
    public void setHealthPotionDropChance(int healthPotionDropChance) {
        this.healthPotionDropChance = healthPotionDropChance;
    }

    
    public int getStrength() {
        return strength;
    }


    public void setStrength(int strength) {
        this.strength = strength;
    }


    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String toString() {
        return "Hero [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", numHealthPotions="
                + numHealthPotions + ", healthPotionHealAmount=" + healthPotionHealAmount + ", healthPotionDropChance="
                + healthPotionDropChance + ", strength=" + strength + ", level=" + level + "]";
    }




    
}
