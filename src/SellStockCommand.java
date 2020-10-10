/** class SellStockCommand implements Command
   declares necessary variables: private StockTrade stockTrade, String stockName, int shares
*/
public class SellStockCommand implements Command{

	private StockTrade stockTrade;
	private String stockName;
	private int shares;

	/** public SellStockCommand is the constructor 
	@param StockTrade stockTrade
	@param String stockName
	@param int shares
	*/
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.shares = shares;
		this.stockName = stockName;
		this.stockTrade = stockTrade;
	}

	/** execute() adds new stock and shares to sell
	*/
	public void execute() {
		stockTrade.sell(stockName, shares);
	}
}
