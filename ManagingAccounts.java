import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;   
import java.util.Scanner;

public class ManagingAccounts extends ManagementBase {

    ArrayList<ArrayList<String>> accs = new ArrayList<ArrayList<String>>();
    Scanner scan = new Scanner(System.in);

    @Override
    public void create() {
        CurrentAccount set = new CurrentAccount(); 
      
        System.out.println("\nEnter clients' name.");
        String name = scan.nextLine();
        System.out.println("\nEnter clients' surname.");
        String surname = scan.nextLine();
        System.out.println("\nEnter clients' telephone.");
        String telephone = scan.nextLine();
        System.out.println("\nEnter clients' address.");
        String address = scan.nextLine();
        System.out.println("\nEnter clients' amount.");
        String amount = scan.nextLine();

        set.update(name, surname, telephone, address);
        
        ArrayList<String> acc1 = new ArrayList<String>();
		acc1.add("Whiskey");
		acc1.add("Piotr");
		acc1.add("$ 40000");
		acc1.add("5501863");
        acc1.add("Konac 8");
		
		ArrayList<String> acc2 = new ArrayList<String>();
		acc2.add("Longman");
		acc2.add("George");
		acc2.add("$ 38000");
		acc2.add("5597612");
        acc2.add("Weed 7");
		
		ArrayList<String> acc3 = new ArrayList<String>();
		acc3.add("Jackdaniel");
		acc3.add("Aturo");
		acc3.add("$ 42000");
		acc3.add("5588442");
        acc3.add("Pine 4");
		
        ArrayList<String> acc4 = new ArrayList<String>();
        acc4.add(name);
		acc4.add(surname);
		acc4.add(amount);
		acc4.add(telephone);
        acc4.add(address);

		accs.add(acc1);
		accs.add(acc2);
		accs.add(acc3);
        accs.add(acc4);
    }

    @Override
    public void read() {
        for (ArrayList<String> i : accs) {
            System.out.println(i);
          }
    }

    @Override
    public void update() {

        System.out.println("\nEnter new value to be set.");
        String value = scan.nextLine();
        System.out.println("\nEnter row number to be modified.");
        int a = scan.nextInt();
        System.out.println("\nEnter column number to be modified.");
        int x = scan.nextInt();
 
        accs.get(a-1).set(x-1, value);
        System.out.println("\nNew value successfully set...");
        
    }

    @Override
    public void remove() {

        System.out.println("\nEnter row number of client to be removed.");
        int b = scan.nextInt();
        accs.remove(b-1);

        System.out.println("\nClient account successfully removed.");
    }

    @Override
    public void clear() {
      accs.clear();  
    }
     
    @Override
    public void history(){
        try {
              File acc = new File("normalaccounts");
              System.out.println(acc.getAbsolutePath());
              try (Scanner scan = new Scanner(acc)) {
                while (scan.hasNextLine()) {
                    String data = scan.nextLine();
                    System.out.println(data);
                  }
            }
              System.out.println("===============================================");
        } catch (FileNotFoundException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
        }  
    }
}
