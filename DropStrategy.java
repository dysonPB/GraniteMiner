package GraniteMiner;

import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.wrappers.node.Item;

import GraniteMiner.Container.cons;

public class DropStrategy extends Strategy implements Runnable {

	@Override
	public void run() {
		Item Granite = Inventory.getItem(cons.GRANITE_ID);

		if (Inventory.isFull()) {
			Granite.getWidgetChild().interact("Drop");
			Time.sleep(100, 200);
		}
	}

	@Override
	public boolean validate() {
		return Inventory.isFull();

	}

}
