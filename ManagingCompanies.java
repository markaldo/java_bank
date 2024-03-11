import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManagingCompanies extends ManagementBase {

    ArrayList<ArrayList<String>> accs = new ArrayList<ArrayList<String>>();
    Scanner scan = new Scanner(System.in);

    @Override
    public void create() {
      
        System.out.println("\nEnter companies' name.");
        String name = scan.nextLine();
        System.out.println("\nEnter companies' branch.");
        String branch = scan.nextLine();
        System.out.println("\nEnter companies' telephone.");
        String telephone = scan.nextLine();
        System.out.println("\nEnter companies' amount.");
        String amount = scan.nextLine();

        insert(name, branch, telephone, amount);
        
        ArrayList<String> acc1 = new ArrayList<String>();
		acc1.add("L.Vuitton");
		acc1.add("srodmiescie");
		acc1.add("$ 5 900 000");
		acc1.add("5598784");
		
		ArrayList<String> acc2 = new ArrayList<String>();
		acc2.add("Adiddas ");
		acc2.add("arkadia");
		acc2.add("$ 8 000 000");
		acc2.add("7784894");
		
		ArrayList<String> acc3 = new ArrayList<String>();
		acc3.add("H & M ");
		acc3.add("wola");
		acc3.add("$ 2 000 000");
		acc3.add("4987199");
		
        ArrayList<String> acc4 = new ArrayList<String>();
        acc4.add(name);
		acc4.add(branch);
		acc4.add(amount);
		acc4.add(telephone);

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

        System.out.println("\nEnter row number of company to be removed.");
        int b = scan.nextInt();
        accs.remove(b-1);

        System.out.println("\nCompany account successfully removed.");
    }

    @Override
    public void clear() {
      accs.clear();  
    }
     
    @Override
    public void history(){
        try {
              File acc = new File("companies");
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

    public void insert(String name, String branch, String telephone, String amount){
        try {
        FileWriter fw = new FileWriter("companies", true);
        String syne = "\n"+name+"      "+branch+"     "+amount+"     "+telephone;
        fw.write(syne);
        fw.close();
      } catch (IOException e) {
        System.out.println("An error occurred in setting up an account in file.");
        e.printStackTrace();
      }
    }
}
