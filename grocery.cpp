import java.util.Scanner;

class ShopException extends Exception {
    ShopException() {
        System.out.println("Something went wrong.\nPlease try again.");
    }
}

class Shop {
    private int availableItems = 10;
    private double availableAmount = 2000;

    void purchaseItems(int items, double amount) throws ShopException {
        if (availableItems < items || availableAmount < amount) {
            throw new ShopException();
        }
    }
}

public class ThrowThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items you want to buy: ");
        int items = scanner.nextInt();
        System.out.println("Enter the total amount of items: ");
        double amount = scanner.nextDouble();

        try {
            Shop shop = new Shop();
            shop.purchaseItems(items, amount);
            System.out.println("You can take your items.");
        } catch (ShopException e) {
            // Exception is caught and handled here
        }
    }
}
