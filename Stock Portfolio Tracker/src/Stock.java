import java.util.Scanner;

public class Stock {
    private String _name;
    private Float _value;
    private Double _quantity;
    Scanner scanner = new Scanner(System.in);

    public void GetStock()
    {
        System.out.print("Stock Name/ID: ");
        _name = scanner.nextLine();
        System.out.print("Stock Value: ");
        try
        {
            String value = StockAPI.Prices(_name.toUpperCase());
            _value = Float.parseFloat(value);
            System.out.println(_value);
        }
        catch (Exception e)
        {
            System.out.println("Couldn't retrive price, Stock name may be incorrect.");
        }
        System.out.print("Number of Shares: ");
        _quantity = scanner.nextDouble();
        System.out.println();
    }

    public String GetName()
    {
        return _name.toUpperCase();
    }

    public String toString()
    {
        String string = "_name = " + _name.toUpperCase() + " _value = " + _value + " _quantity = " + _quantity;
        return string;
    }

    public void Display()
    {
        System.out.println("\nCompany Name: " + _name.toUpperCase() + "\nStock Value: " + _value + "\nTotal Owned Shares: " + _quantity + "\n");
    }
}
