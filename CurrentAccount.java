import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class CurrentAccount extends SavingsAccount implements BaseAccount{
    
    private String name;
    private String surname;
    private double balance = 0.00;
    private String acc_number;
    private String telephone;
    private String address; 
    
    // Setter
    public void setDetails(String newName, String newSurname, String newTelephone, String newAddress) {
        LocalTime tm = LocalTime.now();
        String str = String.valueOf(newTelephone);
            this.name = newName;
            this.surname = newSurname;
            this.acc_number = "PKOPPLMK "+"0000"+tm+str;
            this.telephone = newTelephone;
            this.address = newAddress;
    }

    public void setBalance(double amnt) {
        this.balance += amnt;
    }

    public void subBalance(double amnt) {
        if(balance < amnt){
            currentMsg2();
        }
        else{
        this.balance -= amnt;
        currentMsg1();
        }
    }

    public void deposit(double amount){
        setBalance(amount);
        System.out.println("Successfully deposited...!");
    }
    public void deposit(int amount){
        double amnt = amount;
        setBalance(amnt);
        System.out.println("Successfully deposited...!");
    }

    public void withdraw(double amount){
        subBalance(amount);
    }
    public void withdraw(int amount){
        double amnt = amount;
        subBalance(amnt);
    }

    public void transfer(double amount){
        subBalance(amount);
    }
    public void transfer(int amount){
        double amnt = amount;
        subBalance(amnt);
    }
    
    public void donate(double amount){
        subBalance(amount);
    }
    public void donate(int amount){
        double amnt = amount;
        subBalance(amnt);
    }

    public void addSavings(double amount){
        if(balance < amount){
            currentMsg2();
        }
        else{
        this.balance -= amount;
        saveMoney(amount);
        }
    }

    public void withdrawSavings(double amount){
        double x = takeSavings(amount);
        setBalance(x);
    }

     // Getter
    public void getBalance() {
            System.out.println("Main account balance...\n"+balance + "\nSavings account balance.:\n$ "+ getBonus());
        }
    public void details(){
        System.out.println("____________________________________________________________________________");
        System.out.println("Name of account holder: \n" + name + " " + surname + "\n\nAccount no.: PL\n" + acc_number + "\n\nAccount balance.:\n$ " + balance + "\nSavings balance.:\n$ "+ getBonus()); 
        System.out.println("\nHolder's profile details:\nPhone number\n" + telephone + "\nHome address\n" + address + "\n");    
    }

    public void currentMsg1(){
        System.out.println("\nSuccessfully transacted..New balance\n$ "+balance);
    }
    public void currentMsg2(){
        System.out.println("\nInsufficient balance in main account...!");
    }

    public void update(String name, String surname, String telephone, String address){
        try {
        FileWriter fw = new FileWriter("normalaccounts", true);
        String syne = "\n"+name+"   "+surname+"    "+telephone+"     "+address;
        fw.write(syne);
        fw.close();
      } catch (IOException e) {
        System.out.println("An error occurred in setting up an account in file.");
        e.printStackTrace();
      }
    }
}