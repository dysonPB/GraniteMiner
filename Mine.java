package GraniteMiner;

import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.methods.Tabs;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.Camera;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.game.api.wrappers.node.Item;
import org.powerbot.game.api.wrappers.node.SceneObject;
import org.powerbot.game.api.wrappers.widget.WidgetChild;

import GraniteMiner.Container.cons;

public class Mine extends Strategy implements Runnable {

	@Override
	public void run() {
		SceneObject GraniteRock = SceneEntities.getNearest(cons.GRANITEROCK_ID);
		SceneObject Well = SceneEntities.getNearest(cons.WELL_ID);

		if (Inventory.getItem(cons.WATERSKIN_ID) != null) {
		} else {
			if (cons.banklodArea.contains(Players.getLocal().getLocation())) {
				Walking.newTilePath(cons.pathtowater).traverse();
				WidgetChild Empty = Inventory.getItem(1831).getWidgetChild();
				if (Inventory.getItem(1831) != null)
					Empty.interact("Use");
				Time.sleep(1000);
				if (Well != null && Well.isOnScreen()) {
					Well.interact("Use");
					Time.sleep(3000, 3500);
				}

			} else {
				WidgetChild lodeTele = Widgets.get(1092, 45);

				if (Tabs.getCurrent() != Tabs.MAGIC) {
					Tabs.MAGIC.open();
				}
				lodeTele.click(true);
				Time.sleep(1000, 1200);
				WidgetChild tele = Widgets.get(1092, 45);
				tele.interact("Teleport");

			}

			if (cons.miningArea.contains(Players.getLocal().getLocation())) {
				if (GraniteRock != null) {
					if (GraniteRock.isOnScreen()) {
						if (!Players.getLocal().isMoving()) {
							if (Players.getLocal().getAnimation() == -1) {
								GraniteRock.interact("Mine");
								Time.sleep(1000);
							}
						}
					} else if (cons.miningArea.contains(Players.getLocal()
							.getLocation())) {
						Camera.turnTo(GraniteRock);
					} else {
						if (cons.mininglodArea.contains(Players.getLocal())) {
							Walking.newTilePath(cons.pathtomining).traverse();
							Time.sleep(500, 700);
						} else {
							WidgetChild lodeTele = Widgets.get(1092, 7);

							if (Tabs.getCurrent() != Tabs.MAGIC) {
								Tabs.MAGIC.open();
							}
							lodeTele.click(true);
							Time.sleep(1000, 1200);
							WidgetChild tele = Widgets.get(1092, 7);
							tele.interact("Teleport");
						}

					}
				}
			}
		}

	}
}