package game;

import java.util.Random;
import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        System.out.println("It is working!");

        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game variables
        String[] enemies = {"Skeleton", "Zombie", "Vampire"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        //Player variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50;

        Hero hero = new Hero();


        Boolean started = true;
        System.out.println("Welcome to the Dungeon!");
        System.out.println("Hero...Please enter your name.");
        String heroName = in.nextLine();
        System.out.println("Welcome to Final Fantasy, " + heroName + ".");
        hero.setName(heroName);
        System.out.println(">>>>>Our hero, " + hero.getName() + " equips the armor and weapon.");

        GAME:
        while (started){
            System.out.println("---------------------------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t$ " + enemy + " has appeared! $\n");

            while(enemyHealth >0){
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if(input.equals("1")){
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken; 

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You received " + damageTaken + " damage in retaliation");

                    if (health < 1){
                        System.out.println("\t> You have too much damage, you are too weak to go on!");
                        break;
                    }

                }
                else if (input.equals("2")){
                    if (numHealthPotions > 0){
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself "
                            + "for " + healthPotionHealAmount + "."
                            + "\n\t> You now have " + health + " HP"
                            + "\n\t You have " + numHealthPotions + " health potions left.\n");
                    }
                    else{
                        System.out.println("\t> You have no health potions left.");
                    }
                }
                else if (input.equals("3")){
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue GAME;
                }
                else{
                    System.out.println("\tInvalid command.");

                }
            }

            if (health < 1) {
                System.out.println("You limp out of the dungeon, weak from the battle.");
                break;
            }

               System.out.println("---------------------------------");
               System.out.println(" # " + enemy + " was defeated! #");
               System.out.println(" # You have " + health + " HP left. #");

               if (rand.nextInt(100) < healthPotionDropChance){
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). #");
            
               }
               System.out.println("---------------------------------");
               System.out.println("What would you like to do now?");
               System.out.println("1. Continue fighting");
               System.out.println("2. Exit dungeon");

               String input  = in.nextLine();
               while(!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid command");
                input = in.nextLine();
               }

               if(input.equals("1")){
                System.out.println("You continue on your adventure.");
               }
               else if (input.equals("2")){
                System.out.println("You exit the dungeon, successful from your adventures");
                break;
               }
        }
        System.out.println("################################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("################################");

        in.close();
    }


}