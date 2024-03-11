import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalTime;

class NormalAccount extends CurrentAccount{
	public static void client() {

      // my objects ... 
      CurrentAccount data = new CurrentAccount();
      HashMap<String, Double> statement = new HashMap<String, Double>();
      LocalTime tn = LocalTime.now();
      Scanner in = new Scanner(System.in);
      
      System.out.println("\t\tWelcome to MK Banking System ...\nPlease enter the following details for account creation.");
      System.out.println("Name");
      String name = in.nextLine();

      System.out.println("\nSurname");
      String surname = in.nextLine();

      System.out.println("\nAddress");
      String address = in.nextLine();

      System.out.println("\nTelephone");
      String telephone = in.nextLine();
      
      data.setDetails(name, surname, telephone, address);
      data.update(name, surname, telephone, address);
        
      boolean b = true;
        do{ System.out.println("\nSelect option to transact::\n1.Deposit\n2.Withdraw\n3.Transfer\n4.Save Money\n5.Withdraw Savings\n6.Check Balance\n7.Print Statement\n8.Donate\n9.Terminate");
          
        int opt = in.nextInt();
        switch (opt) {
            case 1:
              System.out.println("\nEnter deposit amount\n");
              double x = in.nextDouble();
              data.deposit(x);
              statement.put("deposit", x);
              break;
            case 2:
              System.out.println("\nEnter withdrawal amount\n");
              double y = in.nextDouble();
              data.withdraw(y);
              statement.put("withdrawal", y);
              break;
            case 3:
              System.out.println("\nEnter transfer amount\n");
              double z = in.nextDouble();
              data.transfer(z);
              statement.put("transfer", z);
              break;
            case 4:
              System.out.println("\nEnter amount to savings\n");
              double m = in.nextDouble();
              data.addSavings(m);
              statement.put("toSavings", m);
              break;
            case 5:
              System.out.println("\nEnter amount from savings\n");
              double n = in.nextDouble();
              data.withdrawSavings(n);
              statement.put("fromSavings", n);
              break;
            case 6:
              System.out.println("\n\nBalance Toady @ "+tn+"\n");
              data.getBalance();
              statement.put("balanceEnquiry", 0.00);
              break;
            case 7:
              System.out.println("\nMini Statement @ "+tn+"\n");
              System.out.println(statement);
              statement.put("statementEnquiry", 0.00);
              break;
            case 8:
              System.out.println("\nEnter donation amount\n");
              double p = in.nextDouble();
              data.donate(p);
              statement.put("donated", p);
            case 9:
              b = false;
            break;
          default:
            System.out.println("Invalid Option ...!");
            }
          System.out.println("_____________________________________________"); 
          }while(b);
        in.close();
    }
}