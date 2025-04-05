📌 ShoppingApp.java - Console-Based Shopping Application

🛒 Description:
This Java console application simulates a basic shopping experience. Users can:
- Choose product categories (Electronics, Fashion, Books)
- View products with prices
- Add items to their cart
- Checkout with payment

🖥️ How to Run the Program:

1. Make sure Java is installed.
   Check using:
   java -version

2. Compile the program:
   javac ShoppingApp.java

3. Run the program:
   java ShoppingApp

🧠 How It Works:

- The program displays a menu with 3 main categories.
- User selects a category, then views and selects products.
- Selected products are added to the cart.
- User can continue shopping or checkout anytime.
- On checkout, the total bill is displayed.
- User is prompted to enter payment.
   - If payment is enough → purchase successful.
   - If not → program shows error.
- Entering "0" in main menu exits the program.

📌 Example Flow:

Main Menu:
1. Electronics
2. Fashion
3. Books
0. Exit

➡ User selects: 1 (Electronics)
➡ Views items: Phone - $300, Laptop - $900...
➡ Adds items to cart
➡ Selects Checkout
➡ Sees total bill
➡ Pays the amount
➡ Gets confirmation or error

✅ Notes:
- Built for Java beginners
- Uses basic loops, conditionals, and Scanner for input
- Does not store cart between runs
