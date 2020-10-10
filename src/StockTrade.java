**/ public class StockTrade **/
public class StockTrade {

	/** public StockTrade is left empty
	**/
	public StockTrade() {}
	
	/** public void buy has parameters String stockName, int numShares
	  prints how many shares a user is buying
	**/
	public void buy(String stockName, int numShares) {
		System.out.println("Buying "+ numShares + " of " + stockName);
	}

	/** public void sell has parameters String stockName, int numShares
	prints how many shares a user is selling
	**/
	public void sell(String stockName, int numShares) {
		System.out.println("Selling "+ numShares + " of " + stockName);
	}
}
