import java.util.Scanner;

public class Morgage {

    public static void morgage(){
      MorgageAccounts info = new MorgageAccounts();
      Scanner in = new Scanner(System.in);

      System.out.println("\tMorgage Accounts System");
      System.out.println("\nEnter which department file to apply changes / you are searching for.");
      String fd = in.nextLine();
      
      System.out.println("\nSelect operation::\n1.Create new record with this name.\n2.Delete this whole record.\n3.Other");
      int i = in.nextInt();
      
      if(i==1){
        info.create(fd);
      }
      else if(i==2) {
        info.delete(fd);
      } else {
      
      boolean b = true;
      do{ 
      System.out.println("Select operation to perfom::\n1.Review all accounts.\n2.Add/Open an account.\n3.Correct data/value in accounts\n4.Clear accounts history.\n5.Clear screen\n6.Stop Operation."); 
      int opt = in.nextInt();
      switch (opt) {
          case 1:
            info.read(fd);
            break;
          case 2:
            info.update(fd);
            break;
          case 3:
            info.edit(fd);
            break;
          case 4:
            info.clear(fd);
            break;
          case 5:
            System.out.println("\nClear screen.");
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
          case 6:
            //b = false;
            System.exit(0);
          break;
        default:
          System.out.println("Invalid Option ...!");
          }
        System.out.println("_____________________________________________"); 
       }while(b);
      }
        in.close();
    }
}
