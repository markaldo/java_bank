# Java Bank

**A simple banking account management system implemented in Java.**

## Description

This project is a basic banking system implemented in Java. It allows users to create, manage, and perform transactions on different types of bank accounts, including normal accounts, savings accounts, current accounts, and mortgage accounts. The system includes features for managing companies, calculating interest, and handling mortgage-related operations. It's intended as a learning exercise and a demonstration of object-oriented programming principles.

## Key Features

*   **Account Management:** Create, view, update, and delete various types of bank accounts (Normal, Savings, Current, Mortgage).
*   **Transaction Handling:** Implement deposit and withdrawal functionalities.
*   **Interest Calculation:** Calculate interest earned on savings accounts.
*   **Company Management:**  Manage companies and their associated accounts.
*   **Data Persistence:** Store and retrieve account data from text files.
*   **Object-Oriented Design:**  Demonstrates object-oriented programming principles such as inheritance and polymorphism.

## File Structure

The project consists of the following key classes:

*   `AccountsManager.java`: Manages bank accounts.
*   `BaseAccount.java`: Base class for all account types.
*   `CompaniesBase.java`: Base class for companies.
*   `CompaniesManager.java`: Manages companies.
*   `CurrentAccount.java`: Represents a current account.
*   `Interest.java`: Handles interest calculation logic.
*   `ManagementBase.java`: Base class for management operations.
*   `ManagingAccounts.java`: Manages accounts.
*   `ManagingCompanies.java`: Manages companies.
*   `Morgage.java`: Represents a mortgage.
*   `MorgageAccounts.java`: Manages mortgage accounts.
*   `MorgageBase.java`: Base class for mortgage operations.
*   `NormalAccount.java`: Represents a normal account.
*   `SavingsAccount.java`: Represents a savings account.
*   `Bank_Main.java`: Main class to execute the banking system.

## Data Storage

The system stores account and company data in the following text files:

*   `companies.txt`: Stores company information.
*   `morgage.txt`: Stores mortgage information.
*   `normalaccounts.txt`: Stores normal account information.
*   `warsaw.txt`: [Explain the purpose of this file, if applicable. If it's not relevant, remove it.]

## Potential Improvements

*   **Database Integration:** Replace text files with a database (e.g., MySQL, PostgreSQL) for data persistence.
*   **User Interface:** Develop a graphical user interface (GUI) using Swing or JavaFX.
*   **Error Handling:** Implement robust error handling to handle invalid inputs and exceptions.
*   **Security:** Implement security measures to protect account data.
*   **Transaction Logging:** Add transaction logging to track account activity.
*   **Reporting:** Implement reporting functionality to generate account statements and summaries.

## Contributing

Contributions are welcome! Please submit pull requests or open issues to suggest improvements, report bugs, or add new features.
