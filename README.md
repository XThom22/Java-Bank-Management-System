# Java Bank Management System

A desktop-based Bank Management System built with Java, Java Swing, JDBC, and MySQL. This project simulates common banking and ATM operations while demonstrating object-oriented programming, GUI development, event handling, and database integration.

## Features

- Create a new bank account through a multi-page registration system
- Generate a card number and PIN for new accounts
- Log in using a card number and PIN
- Deposit money
- Withdraw money
- Fast Cash withdrawals
- Check account balance
- Change account PIN
- View transaction history / mini statements
- Store account and transaction information in a MySQL database

## Technologies Used

- Java
- Java Swing
- Java AWT
- JDBC
- MySQL
- Git
- GitHub
- Visual Studio Code

## How It Works

Users can create a new account by completing the registration process. Account information is stored in a MySQL database. After registration, users can log in using their generated card number and PIN.

Once logged in, the ATM transaction interface provides access to banking operations including deposits, withdrawals, Fast Cash, PIN changes, balance enquiries, and mini statements.

## Database

The application uses MySQL to store:

- Personal account information
- Additional account details
- Account type and banking services
- Login credentials
- Deposit and withdrawal transactions

## Project Structure

- `Login.java` - User authentication
- `SignupOne.java` - Personal details registration
- `SignupTwo.java` - Additional account details
- `SignupThree.java` - Account creation and banking services
- `Transactions.java` - Main ATM transaction menu
- `Deposit.java` - Deposit functionality
- `Withdraw.java` - Withdrawal functionality
- `FastCash.java` - Quick withdrawal options
- `PinChange.java` - PIN update functionality
- `BalanceEnquiry.java` - Account balance calculation
- `MiniStatement.java` - Transaction history
- `Conn.java` - MySQL database connection
- `bankmanagementsystem.sql` - Database schema

## What I Learned

Through this project, I gained hands-on experience with:

- Building desktop applications with Java Swing
- Connecting Java applications to MySQL using JDBC
- Performing SQL queries from Java
- Handling user input and GUI events
- Managing multiple application screens
- Implementing banking transaction logic
- Using Git and GitHub for version control

## Future Improvements
- Improve input validation and error handling
- Use prepared statements for database queries
- Improve password and PIN security
- Enhance the user interface
- Add additional banking features

### Login Screen
<img width="778" height="469" alt="Screenshot 2026-08-17 083438" src="https://github.com/user-attachments/assets/9286417f-8731-4ba8-a0be-bd1ef9c5de6c" />

### Account Registration – Personal Details
<img width="832" height="790" alt="Screenshot 2026-08-17 150744" src="https://github.com/user-attachments/assets/7fa5ca1c-e763-4232-8368-142ccb85e567" />

### Account Registration – Additional Details
<img width="832" height="786" alt="Screenshot 2026-08-17 150810" src="https://github.com/user-attachments/assets/3ddff233-f9be-4e48-aba9-e48107a3a506" />

### Account Registration – Account Details
<img width="828" height="809" alt="Screenshot 2026-08-17 150832" src="https://github.com/user-attachments/assets/2b111ce7-3e9c-4882-9a36-fc0065f1ee9c" />

### ATM Transaction Menu
<img width="898" height="828" alt="Screenshot 2026-08-17 151343" src="https://github.com/user-attachments/assets/3bdca8a1-e061-4ed2-87c0-34d0687b4df9" />

### Deposit Screen
<img width="876" height="851" alt="Screenshot 2026-08-17 151442" src="https://github.com/user-attachments/assets/e811e8f8-2a4a-4557-af20-4b7e5a9de853" />

### Withdrawal Screen
<img width="878" height="850" alt="Screenshot 2026-08-17 151517" src="https://github.com/user-attachments/assets/75784601-5361-4889-9a80-282e10bf9afb" />

### Fast Cash
<img width="896" height="833" alt="Screenshot 2026-08-17 151544" src="https://github.com/user-attachments/assets/0972ff61-b883-4ed6-b217-dd774f998408" />

### PIN Change
<img width="895" height="830" alt="Screenshot 2026-08-17 151625" src="https://github.com/user-attachments/assets/474e8825-35bd-4808-b86c-121d714ab5e6" />

### Balance Enquiry
<img width="897" height="833" alt="Screenshot 2026-08-17 151659" src="https://github.com/user-attachments/assets/8d218b85-e03c-47e0-a859-38ce72aebf83" />

### Mini Statement
