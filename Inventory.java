// Gregory Greer
//Data Structures

import java.util.Scanner;

public class Inventory{
    //Crates an item class under String so that a String can be entered into the Array
    static class Item{
        String name;

        public Item(String name) {
            this.name = name;
        }
    }
    //Creates an inventory with five slots to be filled with the input
    static Item[] inventory = new Item[5];
    //This adds an item to the first slot, starting the code
    public static boolean addItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return true;
            }
        }
        return false;
    }
    //Displays the inventory once all inputs are done
    public static void showInventory() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.println("Slot " + (i + 1) + ": " + inventory[i].name );
            } else {
                System.out.println("Slot " + (i + 1) + ": Empty");
            }
            }
        }
    
         public static void main(String[] args) {
        //input for the user to type in items
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Enter your item: ");
            String name = input.nextLine();

            Item item = new Item(name);

            if(addItem(item)) {
                System.out.println("The item has been added.");
            } else {
                System.out.println("Your inventory is full");
            }
            }
            //Calls and displays the inventory in the terminal
            System.out.println("\nInventory: ");
            showInventory();
        }
    }

