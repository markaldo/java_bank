import java.io.IOException;
import java.util.Scanner;

public class AccountsManager extends ManagingAccounts {
     
    public static void control() throws IOException {
          ManagingAccounts x = new ManagingAccounts();
          Scanner in = new Scanner(System.in);
   
          boolean b = true;
   do{ System.out.println("\nSelect operation to perform::\n1.Add client account\n2.View all accounts\n3.Modify client account\n4.Remove client account\n5.Clear all accounts\n6.View history\n7.Terminate");
     
   int opt = in.nextInt();
   switch (opt) {
       case 1:
            x.create();
        break;
       case 2:
            x.read();
         break;
       case 3:
            x.read();
            x.update();
         break;
       case 4:
            x.read();
            x.remove();
         break;
       case 5:
            x.clear();
         break;
       case 6:
            x.history();
         break;
       case 7:
            b = false;
            System.exit(0);
       break;
       default:
            System.out.println("Invalid Option ...!");
       }
     System.out.println("_______________________________________________");
     }while(b);
   
    in.close();
    } 
}