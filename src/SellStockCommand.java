/**
 * this class is used to sell stocks
 */
public class SellStockCommand implements Command{

	private StockTrade stockTrade;
	private String stockName;
	private int shares;

	/**
	 * this method is used to know how many shares of which stock to sell or trade
	 */
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.shares = shares;
		this.stockName = stockName;
		this.stockTrade = stockTrade;
	}

	/**
	 * this method executes the sell
	 */
	public void execute() {
		stockTrade.sell(stockName, shares);
	}
}
