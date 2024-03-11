import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;   
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.Console;

public class MorgageAccounts extends MorgageBase {

    @Override
    public void create(String filename){
        try {
          File acc = new File(filename);
          if (acc.createNewFile()) {
            System.out.println("File created: " + acc.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }

    @Override
    public void read(String filename){
        try {
          File acc = new File(filename);
          System.out.println(acc.getAbsolutePath());
          Scanner reader = new Scanner(acc);
          while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
          }
          System.out.println("===================================================");
          reader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }

    @Override
    public void update(String filename){
        try {
        FileWriter fw = new FileWriter(filename, true);
        Console take = System.console();
        
        System.out.println("Enter account information to be added!\nName?");
        String name = take.readLine();
        System.out.println("\nSurname?");
        String surname = take.readLine();
        System.out.println("\nAddress?");
        String address = take.readLine();
        System.out.println("\nTelephone?");
        String telephone = take.readLine();
        System.out.println("\nAmount loaned?");
        String amnt = take.readLine();
        String syne = "\n"+name+"   "+surname+"    "+amnt+"   "+telephone+"    "+address;
        
        fw.write(syne);
        fw.close();
        System.out.println("Morgage account successfully added!");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }

    @Override
    public void edit(String filePath)
    {
        Scanner tk = new Scanner(System.in);
        System.out.println("\nEnter string being searched for.");
        String oldString = tk.nextLine();
        System.out.println("\nEnter correct new string.");
        String newString = tk.nextLine();
        tk.close();

        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified)); 
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();  
                line = reader.readLine();
            }      
            //Replacing oldString with newString in the oldContent
            String newContent = oldContent.replaceAll(oldString, newString);
            //Rewriting the input text file with newContent
            writer = new FileWriter(fileToBeModified); 
            writer.write(newContent);
            System.out.println("String successfully changed!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void clear(String filename){
        try {
          new FileWriter(filename, false).close();
          System.out.println("File successfully cleared.");
        } catch (IOException e) {
          System.out.println("Something went wrong");
          e.printStackTrace();
        }
      }

    @Override
    public void delete(String filename){
        File file = new File(filename); 
        if (file.delete()) { 
          System.out.println("Deleted the file: " + file.getName());
        } else {
          System.out.println("Failed to delete the file.");
        } 
      }
    
}
