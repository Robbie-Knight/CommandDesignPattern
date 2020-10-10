/**
*@author Robbie Knight, Erin Kremer, Katie Kopper, Marcos Leon-Caban
*
*The BuyStockCommand class is a class that executes the command to
*buy stock
*/


public class BuyStockCommand implements Command
{

	private StockTrade stockTrade;
	private String stockName;
	private int shares;

	/**
	 * Constructor that sets shares, stockName, and stockTrade
	 * @param stockTrade The object that prints the appropriate message
	 * @param stockName The name of the stock
	 * @param shares the number of shares
	 */
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares)
	{
		this.shares = shares;
		this.stockName = stockName;
		this.stockTrade = stockTrade;
	}

	/**
	 * This method executes the command to buy stock
	 */
	public void execute() {
		stockTrade.buy(stockName, shares);
	}
}
