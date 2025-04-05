📌 SimpleOnlineBanking.java - Console-Based Banking Application

🏦 Description:
This Java console application simulates a basic banking system. Users can:
- Create a bank account
- Deposit money
- Withdraw money
- Check account balance
- View account details

🖥️ How to Run the Program:

1. Make sure Java is installed.  
   Check using:  
   `java -version`

2. Compile the program:  
   `javac SimpleOnlineBanking.java`

3. Run the program:  
   `java SimpleOnlineBanking`

🧠 How It Works:

- Displays a menu with banking options.
- User creates an account with a unique account number.
- Deposit or withdraw money by entering the account number.
- Balance updates automatically after each transaction.
- User can view details or check balance anytime.
- Entering "0" in the menu exits the program.

📌 Example Flow:

Main Menu:
1. Create a new Account  
2. Display Account details  
3. Deposit Amount  
4. Withdraw Amount  
5. Check Balance  
0. Exit the Application

➡ User selects: 1 (Create Account)  
➡ Enters details: Account Number, Name, Initial Balance  
➡ Chooses: 3 (Deposit)  
➡ Enters amount: $200  
➡ Chooses: 5 (Check Balance) → shows updated amount

✅ Notes:
- Made for learning Java basics  
- Uses ArrayList to store accounts temporarily  
- Data is lost when the program closes  
- Input validation can be improved  
- Helpful for Java beginners practicing OOP and user input
