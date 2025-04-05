import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class ShoppingApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the SRAKARR");
        System.out.println("Menu:");
        System.out.println("1. Electronics");
        System.out.println("2. Fashion");
        System.out.println("3. Books");

        List<Double> totalPrice = new ArrayList<>();

        int choice;
        do{
        choice = sc.nextInt();
        switch(choice){
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
                //Exit the Loop
                break;
            default:
                System.out.println("Sorry, Invalid choice. Please try again.");
        }
    }while(choice != 0);

    double totalAmount = totalPrice.stream().mapToDouble(Double::doubleValue).sum();
    System.out.println("Total Amount: " + totalAmount);

    // Payment Processing
    if(totalAmount > 0){
        System.out.println("Enter your payment: ");
        double payment = sc.nextDouble();
        if(payment >= totalAmount){
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

    abstract class ProductCategory{
        abstract List<Double> showProducts(Scanner sc);

        void processPayment(double price){
            // No longer needed as payment is handled in Shopping App}
    }

    class Electronics extends ProductCategory{
        List<Double> showProducts(Scanner sc){
            List<Double> prices = new ArrayList<>();
            System.out.println("Electronics Products:");
            System.out.println("1. Laptop - $1000");
            System.out.println("2. Mobile - $500");
            System.out.println("3. Television - $550");
            System.out.println("Enter the product number to add to cart (0 to exit): ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("1. Asus Vivobook - $1000");
                    System.out.println("2. HP Pavilion - $1200");
                    System.out.println("3. Dell Inspiron - $1100");
                    System.out.println("Enter the product number to add to cart (0 to exit): ");
                    int laptopChoice = sc.nextInt();
                    switch(laptopChoice){
                        case 1:
                            prices.add(1000.0);
                            break;
                        case 2:
                            prices.add(1200.0);
                            break;
                        case 3:
                            prices.add(1100.0);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    System.out.println("If you want to add more products, please select the product number again (0 to exit): ");
                    break;

                    case 2:
                    System.out.println("1. iPhone - $999");
                    System.out.println("2. Samsung Galaxy - $799");
                    System.out.println("3. OnePlus - $699");
                    System.out.println("Enter the product number to add to cart (0 to exit): ");
                    int mobileChoice = sc.nextInt();
                    switch(mobileChoice){
                        case 1:
                            prices.add(999.0);
                            break;
                        case 2:
                            prices.add(799.0);
                            break;
                        case 3:
                            prices.add(699.0);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    System.out.println("If you want to add more products, please select the product number again (0 to exit): ");
                    break;

                    case 3:
                    System.out.println("1. LG OLED - $1500");
                    System.out.println("2. Samsung QLED - $1200");
                    System.out.println("3. Sony Bravia - $1300");
                    System.out.println("Enter the product number to add to cart (0 to exit): ");
                    int tvChoice = sc.nextInt();
                    switch(tvChoice){
                        case 1:
                            prices.add(1500.0);
                            break;
                        case 2:
                            prices.add(1200.0);
                            break;
                        case 3:
                            prices.add(1300.0);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                
                return prices;
            }
        }

        class Fashion extends ProductCategory{
            List<Double> showProducts(Scanner sc){
                List<Double> prices = new ArrayList<>();
                System.out.println("Fashion Products:");
                System.out.println("1. T-Shirt - $20");
                System.out.println("2. Pants - $40");
                System.out.println("3. Shirt - $60");
                System.out.println("Enter the product number to add to cart (0 to exit): ");
                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("1. Full Sleeve T-Shirt - $20");
                        System.out.println("2. Half Sleeve T-Shirt - $15");
                        System.out.println("3. Sleeveless T-Shirt - $10");
                        System.out.println("Enter the product number to add to cart (0 to exit): ");
                        int tshirtChoice = sc.nextInt();
                        switch(tshirtChoice){
                            case 1:
                                prices.add(20.0);
                                break;
                            case 2:
                                prices.add(15.0);
                                break;
                            case 3:
                                prices.add(10.0);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                        System.out.println("If you want to add more products, please select the product number again (0 to exit): ");
                        break;

                    case 2:
                        System.out.println("1. Jeans - $40");
                        System.out.println("2. Chinos - $35");
                        System.out.println("3. Shorts - $25");
                        System.out.println("Enter the product number to add to cart (0 to exit): ");
                        int pantsChoice = sc.nextInt();
                        switch(pantsChoice){
                            case 1:
                                prices.add(40.0);
                                break;
                            case 2:
                                prices.add(35.0);
                                break;
                            case 3:
                                prices.add(25.0);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                        System.out.println("If you want to add more products, please select the product number again (0 to exit): ");
                        break;

                    case 3:
                        System.out.println("1. Stripsed Shirt - $60");
                        System.out.println("2. Plain Shirt - $50");
                        System.out.println("3. Checked Shirt - $55");
                        System.out.println("Enter the product number to add to cart (0 to exit): ");
                        int shirtChoice = sc.nextInt();
                        switch(shirtChoice){
                            case 1:
                                prices.add(60.0);
                                break;
                            case 2:
                                prices.add(50.0);
                                break;
                            case 3:
                                prices.add(55.0);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                        System.out.println("If you want to add more products, please select the product number again (0 to exit): ");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
                
                return prices;
            }
        }

        class Books extends ProductCategory{
            List<Double> showProducts(Scanner sc){
                List<Double> prices = new ArrayList<>();
                System.out.println("Books Products:");
                System.out.println("1. Fiction - $15");
                System.out.println("2. Non-Fiction - $20");
                System.out.println("3. Science - $25");
                System.out.println("Enter the product number to add to cart (0 to exit): ");
                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("1. The Great Gatsby - $15");
                        System.out.println("2. To Kill a Mockingbird - $18");
                        System.out.println("3. 1984 - $20");
                        System.out.println("Enter the product number to add to cart (0 to exit): ");
                        int fictionChoice = sc.nextInt();
                        switch(fictionChoice){
                            case 1:
                                prices.add(15.0);
                                break;
                            case 2:
                                prices.add(18.0);
                                break;
                            case 3:
                                prices.add(20.0);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                        System.out.println("If you want to add more products, please select the product number again (0 to exit): ");
                        break;

                    case 2:
                        System.out.println("1. Sapiens - $20");
                        System.out.println("2. Educated - $25");
                        System.out.println("3. Becoming - $30");
                        System.out.println("Enter the product number to add to cart (0 to exit): ");
                        int nonFictionChoice = sc.nextInt();
                        switch(nonFictionChoice){
                            case 1:
                                prices.add(20.0);
                                break;
                            case 2:
                                prices.add(25.0);
                                break;
                            case 3:
                                prices.add(30.0);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                        System.out.println("If you want to add more products, please select the product number again (0 to exit): ");
                        break;

                    case 3:
                        System.out.println("1. A Brief History of Time - $25");
                        System.out.println("2. The Selfish Gene - $30");
                        System.out.println("3. The Origin of Species - $35");
                        System.out.println("Enter the product number to add to cart (0 to exit): ");
                        int scienceChoice = sc.nextInt();
                        switch(scienceChoice){
                            case 1:
                                prices.add(25.0);
                                break;
                            case 2:
                                prices.add(30.0);
                                break;
                            case 3:
                                prices.add(35.0);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }

                    return prices;
                    }
            }
        }
    }
}