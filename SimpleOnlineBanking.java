import java.util.*;
import java.io.*;

class Details{
    int accountnumber;
    String name;
    double balance;
    
    Details(int accno, String n, double bal){
        accountnumber = accno;
        name = n;
        balance = bal;
    }

    void display(){
        System.out.println("Account Number: "+accountnumber);
        System.out.println("Customer Name: "+name);
        System.out.println("Account Balance: $"+balance);
    }

    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Successfully deposited the amount $"+amount);
        System.out.println("New Balance: "+balance);
        }
        else{
            System.out.println("Invalid amount to deposit. Please retry!");
        }
    }

    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Successfully withdraw $"+amount);
            System.out.println("Remaining balance: $"+balance);
        }
        else{
            System.out.println("Insuffience Balance");
        }
    }

    double checkbalance(){
        return balance;
    }

    int displayAccountNumber(){
        return accountnumber;
    }
}

class SimpleOnlineBanking{
    static ArrayList<Details> a = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n Banking Menu ...");
            System.out.println("1. Create a new Account");
            System.out.println("2. Display Account details");
            System.out.println("3. Depoist Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Check Balance");
            System.out.println("0. Exit the Application");
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    createNewAccount(sc);
                    break;

                case 2:
                    displayAccountDeatils(sc);
                    break;
                
                case 3:
                    depositAmount(sc);
                    break;

                case 4:
                    withdrawAmount(sc);
                    break;

                case 5:
                    checkBalance(sc);
                    break;

                case 0:
                    System.out.println("Thank you for using our Bank!");
                    return;

                default:
                    System.out.println("Invalid Choice! Please Select a valid one");
            }
        }
    }

    static void createNewAccount(Scanner sc){
        System.out.println("Enter your Account Number: ");
        int accountnumber=sc.nextInt();
        System.out.println("Enter your holder name: ");
        String name=sc.next();
        System.out.println("Enter Initial Balance: $");
        double balance = sc.nextDouble();
        Details de = new Details(accountnumber, name, balance);
        if(de.displayAccountNumber()==accountnumber){
            System.out.println("Account Number is Already Esist! Try another account Number");
        }
        else{
            System.out.println("Successfully Account Created");
        }
    }

    static void displayAccountDeatils(Scanner sc){
        System.out.println("Ebter Account Number: ");
        int accountnumber = sc.nextInt();
        for (Details de : a){
            if(de.displayAccountNumber()==accountnumber){
                de.display();
                return;
            }
        }
        System.out.println("Account Not Found");
    }

    static void depositAmount(Scanner sc){
        System.out.println("Enter Account Number: ");
        int accountnumber = sc.nextInt();
        for (Details de : a){
            if (de.displayAccountNumber()==accountnumber){
                System.out.println("Enter amount to deposit: $");
                double depositAmount = sc.nextDouble();
                de.deposit(depositAmount);
                return;
            }
        }
        System.out.println("Account not Found");
    }

    static void withdrawAmount(Scanner sc){
        System.out.println("Enter Account Number: ");
        int accountnumber = sc.nextInt();
        for (Details de: a){
            if(de.displayAccountNumber()==accountnumber){
                System.out.println("Enter amountto withdraw: $");
                double withdrawAmount = sc.nextDouble();
                de.withdraw(withdrawAmount);
                return;
            }
        }
        System.out.println("Account Not Found");
    }

    static void checkBalance(Scanner scan){
        System.out.println("Ebter Account Number: ");
        int accountnumber = sc.nextInt();
        for (Details de : a){
            if(de.displayAccountNumber()==accountnumber){
                System.out.println("Current Balance: $"+de.checkbalance());
                return;
            }
        }
        System.out.println("Account Not Found");
    }
}