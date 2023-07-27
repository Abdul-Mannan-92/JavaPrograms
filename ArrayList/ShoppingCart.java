//import com.company.ShoppingCart;

import java.util.ArrayList;

import java.util.Scanner;

public class ShoppingCart {

    private int[] Array = new int[10];
    private ArrayList<String> shoppingCart = new ArrayList<>();

    public void addItem(String Item){
        shoppingCart.add(Item);
    }

    public void printList () {
        System.out.println("There are " + shoppingCart.size() + " items in your cart");

        for (int i=0; i<shoppingCart.size(); i++){
            System.out.println("Item number " + (i+1) + " is " + shoppingCart.get(i));
        }
    }

    public void modifyCart(int Position, String newItem){
        shoppingCart.set(Position, newItem);
        System.out.println("Shopping item " + (Position+1) + " has been updated");
    }

    public void removeItem(int Position){
        String itemName = shoppingCart.get(Position);
        shoppingCart.remove(Position);
    }

    public String searchItem(String searchItem){
        int Position = shoppingCart.indexOf(searchItem);

        if(Position >= 0){
            return shoppingCart.get(Position);
        }
        else{
            return null;
        }
    }
}

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static ShoppingCart shopCart = new ShoppingCart();

    public static void main(String[] args) {

        boolean Exit = false;
        int userChoice = 0;
        printInstruction();

        while(!Exit) {
            System.out.println("Enter your Choice : ");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    shopCart.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    Exit = true;
                    break;
                default:
            }
        }
    }
    public static void printInstruction(){
        System.out.println("PRESS");
        //System.out.println("0 - To print choices");
        System.out.println("1 - To print shopping list");
        System.out.println("2 - To add an item");
        System.out.println("3 - To modify an item");
        System.out.println("4 - To remove an item");
        System.out.println("5 - To search for an item");
        System.out.println("6 - To exit the App");
    }

    public static void addItem(){
        System.out.print("Please enter the shopping item : ");
        shopCart.addItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter the item number : ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the replacement : ");
        String newItem = scanner.nextLine();
        shopCart.modifyCart(itemNumber-1, newItem);
    }

    public static void removeItem(){
        System.out.print("Insert item number to remove : ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        shopCart.removeItem(itemNumber-1);
    }

    public static void searchItem(){
        System.out.println("Enter the item to search for : ");
        String searchIT = scanner.nextLine();

        if((shopCart.searchItem(searchIT)) != null){
            System.out.println("ITEM FOUND");
        }
        else System.out.println("ITEM NOT FOUND");

    }
}

