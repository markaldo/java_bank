import java.io.IOException;
import java.util.Scanner;

public class Bank_Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select section/catergory::\n1.Create Normal Account.\n2.Manage Normal Accounts.\n3.Morgage Accounts\n4.Company Accounts.\n5.Exit System."); 
      int op = scan.nextInt();
      switch (op) {
          case 1:
          NormalAccount.client();
            break;
          case 2:
          AccountsManager.control();
            break;
          case 3:
          Morgage.morgage();
            break;
          case 4:
          CompaniesManager.controller();
            break;
          case 5:
            System.exit(0);
          break;
        default:
          System.out.println("Invalid Option ...!");
          }
        scan.close();
    }
}
