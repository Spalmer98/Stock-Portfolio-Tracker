import java.util.*;

public class PortfolioManager 
{
    private List<Stock> _portfolios = new ArrayList<Stock>();

    public void AddPortfolio(Stock newStock)
    {
        newStock.GetStock();
        _portfolios.add(newStock);
    }

    public void RemovePortfolio(String name)
    {
        String _name = name.toUpperCase();
        for (int i = 0; i < _portfolios.size(); i++)
        {    
            Stock stock = _portfolios.get(i);
            String stockName = stock.GetName();
            if (stockName.equals(_name))
            {
                _portfolios.remove(i);
                System.out.println("\nStock has been removed\n");
            }
            else
            {
                System.out.println("\nNo Stock has been removed\n");
            }
        }
    }

    public String Retrieve()
    {
        return _portfolios.toString();
    }

    public void DisplayAll()
    {
        if (_portfolios.size() == 0)
        {
            System.out.println("\nThere are no Portfolios in file\n");
        }
        else
        {
            for (Stock stock : _portfolios) 
            {
                stock.Display();    
            }
        }
    }
}
