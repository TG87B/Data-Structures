// Gregory Greer
//Data Structures

import java.util.Scanner;

public class Inventory{

    static class Item{
        String name;

        public Item(String name) {
            this.name = name;
        }
    }

    static Item[] inventory = new Item[5];

    public static boolean addItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                return true;
            }
        }
        return false;
    }

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

            System.out.println("\nInventory: ");
            showInventory();
        }
    }

