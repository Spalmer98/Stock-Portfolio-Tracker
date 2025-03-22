import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager 
{
    public static PortfolioManager Read(String fileName)
    {
        PortfolioManager newPortfolio = new PortfolioManager();
        try 
        {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return newPortfolio;
    }

    public static void Write(String fileName, PortfolioManager portfolio)
    {
        try (FileWriter file = new FileWriter(fileName))
        {
            file.write(portfolio.Retrieve());
            System.out.println("\nFile created successfully!\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
