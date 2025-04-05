import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class ShoppingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the SRAKARR");
        List<Double> totalPrice = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Electronics");
            System.out.println("2. Fashion");
            System.out.println("3. Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    totalPrice.addAll(new Electronics().showProducts(sc));
                    break;
                case 2:
                    totalPrice.addAll(new Fashion().showProducts(sc));
                    break;
                case 3:
                    totalPrice.addAll(new Books().showProducts(sc));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        double totalAmount = totalPrice.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("\nTotal Amount: $" + totalAmount);

        if (totalAmount > 0) {
            System.out.print("Enter your payment: $");
            double payment = sc.nextDouble();
            if (payment >= totalAmount) {
                System.out.println("Payment successful! Thank you for shopping with us.");
            } else {
                System.out.println("Insufficient payment. Please try again.");
            }
        } else {
            System.out.println("No Products selected for purchase.");
        }

        sc.close();
    }
}

abstract class ProductCategory {
    abstract List<Double> showProducts(Scanner sc);
}

class Electronics extends ProductCategory {
    public List<Double> showProducts(Scanner sc) {
        List<Double> prices = new ArrayList<>();
        System.out.println("\nElectronics Products:");
        System.out.println("1. Laptop");
        System.out.println("2. Mobile");
        System.out.println("3. Television");
        System.out.print("Enter the category (0 to exit): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Asus Vivobook - $1000");
                System.out.println("2. HP Pavilion - $1200");
                System.out.println("3. Dell Inspiron - $1100");
                System.out.print("Select a laptop: ");
                int laptop = sc.nextInt();
                if (laptop == 1) prices.add(1000.0);
                else if (laptop == 2) prices.add(1200.0);
                else if (laptop == 3) prices.add(1100.0);
                else System.out.println("Invalid choice.");
                break;
            case 2:
                System.out.println("1. iPhone - $999");
                System.out.println("2. Samsung Galaxy - $799");
                System.out.println("3. OnePlus - $699");
                System.out.print("Select a mobile: ");
                int mobile = sc.nextInt();
                if (mobile == 1) prices.add(999.0);
                else if (mobile == 2) prices.add(799.0);
                else if (mobile == 3) prices.add(699.0);
                else System.out.println("Invalid choice.");
                break;
            case 3:
                System.out.println("1. LG OLED - $1500");
                System.out.println("2. Samsung QLED - $1200");
                System.out.println("3. Sony Bravia - $1300");
                System.out.print("Select a TV: ");
                int tv = sc.nextInt();
                if (tv == 1) prices.add(1500.0);
                else if (tv == 2) prices.add(1200.0);
                else if (tv == 3) prices.add(1300.0);
                else System.out.println("Invalid choice.");
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice.");
        }

        return prices;
    }
}

class Fashion extends ProductCategory {
    public List<Double> showProducts(Scanner sc) {
        List<Double> prices = new ArrayList<>();
        System.out.println("\nFashion Products:");
        System.out.println("1. T-Shirt");
        System.out.println("2. Pants");
        System.out.println("3. Shirt");
        System.out.print("Enter the category (0 to exit): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. Full Sleeve - $20");
                System.out.println("2. Half Sleeve - $15");
                System.out.println("3. Sleeveless - $10");
                System.out.print("Select a T-Shirt: ");
                int tshirt = sc.nextInt();
                if (tshirt == 1) prices.add(20.0);
                else if (tshirt == 2) prices.add(15.0);
                else if (tshirt == 3) prices.add(10.0);
                else System.out.println("Invalid choice.");
                break;
            case 2:
                System.out.println("1. Jeans - $40");
                System.out.println("2. Chinos - $35");
                System.out.println("3. Shorts - $25");
                System.out.print("Select Pants: ");
                int pants = sc.nextInt();
                if (pants == 1) prices.add(40.0);
                else if (pants == 2) prices.add(35.0);
                else if (pants == 3) prices.add(25.0);
                else System.out.println("Invalid choice.");
                break;
            case 3:
                System.out.println("1. Striped Shirt - $60");
                System.out.println("2. Plain Shirt - $50");
                System.out.println("3. Checked Shirt - $55");
                System.out.print("Select a Shirt: ");
                int shirt = sc.nextInt();
                if (shirt == 1) prices.add(60.0);
                else if (shirt == 2) prices.add(50.0);
                else if (shirt == 3) prices.add(55.0);
                else System.out.println("Invalid choice.");
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice.");
        }

        return prices;
    }
}

class Books extends ProductCategory {
    public List<Double> showProducts(Scanner sc) {
        List<Double> prices = new ArrayList<>();
        System.out.println("\nBook Categories:");
        System.out.println("1. Fiction");
        System.out.println("2. Non-Fiction");
        System.out.println("3. Science");
        System.out.print("Enter the category (0 to exit): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1. The Great Gatsby - $15");
                System.out.println("2. To Kill a Mockingbird - $18");
                System.out.println("3. 1984 - $20");
                System.out.print("Select a Fiction book: ");
                int fiction = sc.nextInt();
                if (fiction == 1) prices.add(15.0);
                else if (fiction == 2) prices.add(18.0);
                else if (fiction == 3) prices.add(20.0);
                else System.out.println("Invalid choice.");
                break;
            case 2:
                System.out.println("1. Sapiens - $20");
                System.out.println("2. Educated - $25");
                System.out.println("3. Becoming - $30");
                System.out.print("Select a Non-Fiction book: ");
                int nonFiction = sc.nextInt();
                if (nonFiction == 1) prices.add(20.0);
                else if (nonFiction == 2) prices.add(25.0);
                else if (nonFiction == 3) prices.add(30.0);
                else System.out.println("Invalid choice.");
                break;
            case 3:
                System.out.println("1. A Brief History of Time - $25");
                System.out.println("2. The Selfish Gene - $30");
                System.out.println("3. The Origin of Species - $35");
                System.out.print("Select a Science book: ");
                int science = sc.nextInt();
                if (science == 1) prices.add(25.0);
                else if (science == 2) prices.add(30.0);
                else if (science == 3) prices.add(35.0);
                else System.out.println("Invalid choice.");
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice.");
        }

        return prices;
    }
}