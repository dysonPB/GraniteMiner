package GraniteMiner;

import java.awt.Graphics;

import org.powerbot.game.api.ActiveScript;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.bot.event.listener.PaintListener;

@Manifest(authors = { "dyson" }, name = "dGraniteMiner", description = "Mines Granite", version = 1.0, website = "powerbot.org/community/yourstupidassthreadhere")
public class mining extends ActiveScript implements PaintListener {

	@Override
	protected void setup() {
		provide(new Mine());
		provide(new DropStrategy());

	}

	@Override
	public void onRepaint(Graphics g) {

	}

}
