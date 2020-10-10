/**
*@author Robbie Knight, Erin Kremer, Katie Kopper, Marcos Leon-Caban
*
*The Agent class is a class describing the Agent, the object that buys
*and sells stock
*/

import java.util.ArrayList;

public class Agent {

	private ArrayList<Command> orders;


	/**
	 * A constructor that creates the ArrayList orders
	 */
	public Agent() {
		orders = new ArrayList<Command>();
	}

	/**
	 *
	 * @param command the Command that is given to be executed
	 * This method adds the order given by the command to the ArrayList
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}

	/**
	 * This method iterates through the orders ArrayList and executes
	 * each command within
	 */
	public void processOrders() {
		for(int i = 0; i<orders.size(); i++) {
			orders.get(i).execute();
		}
	}
}
