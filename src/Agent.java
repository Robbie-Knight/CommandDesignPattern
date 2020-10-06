import java.util.ArrayList;

public class Agent {

	private ArrayList<Command> orders;
	
	public Agent() {
		orders = new ArrayList<Command>();
	}
	
	public void placeOrder(Command command) {
		orders.add(command);
	}
	
	public void processOrders() {
		for(int i = 0; i<orders.size(); i++) {
			orders.get(i).execute();
		}
	}
}
