import java.util.*;

public class Program {
	public static void main(String... args) {
		PortfolioManager newPortfolio = new PortfolioManager();
		int _userChoice;
		String fileName;
		Scanner scanner = new Scanner(System.in);
		ClearScreen.clearConsole();

		System.out.println("Stock Portfolio Tracker");

		do
		{
			System.out.println("Please choose one of the following options:");
			System.out.println("1. Add Stock to Portfolio\n2. View Current Portfolio\n3. Remove Stock from Portfolio\n4. Load Portfolio\n5. Save Current Portfolio\n6. Exit Program");
			_userChoice = scanner.nextInt();

			if (_userChoice == 1)
            {
				Stock newStock = new Stock();
                newPortfolio.AddPortfolio(newStock);
				System.out.println("Stock has been added\n");
            }
            else if (_userChoice == 2)
            {
                newPortfolio.DisplayAll();
            }
			else if (_userChoice == 3)
			{
				System.out.print("Which Stock would you like to remove? ");
				scanner = new Scanner(System.in);
				String name = scanner.nextLine();
                newPortfolio.RemovePortfolio(name);
			}
            else if (_userChoice == 4)
            {
				System.out.print("File Name: ");
				scanner = new Scanner(System.in);
				fileName = scanner.nextLine();
				newPortfolio = FileManager.Read(fileName);
				System.out.println("\nThe file has been loaded!\n");
            }
            else if (_userChoice == 5)
            {
				System.out.print("File Name: ");
				scanner = new Scanner(System.in);
				fileName = scanner.nextLine();
				FileManager.Write(fileName, newPortfolio);
            }
            else if (_userChoice == 6)
            {
                System.out.println("Have a wonderful day!");
            }
            else
            {
                System.out.println("You did not enter in a correct option, Please try again.");
            }
		}
		while (_userChoice != 6);
		scanner.close();
	}
}
