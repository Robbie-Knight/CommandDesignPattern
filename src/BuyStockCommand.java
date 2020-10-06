
public class BuyStockCommand implements Command {

	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.shares = shares;
		this.stockName = stockName;
		this.stockTrade = stockTrade;
	}
	
	public void execute() {
		stockTrade.buy(stockName, shares);
	}
}
