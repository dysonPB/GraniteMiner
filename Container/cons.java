package GraniteMiner.Container;

import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;

public class cons {

	public static final int BOOTH_ID = 42377;
	public static final int GRANITEROCK_ID = 10947;
	public static final int WATERSKIN_ID = 1823;
	public static final int EMPTY_WATERSKIN_ID = 1831;
	public static final int WELL_ID = 26945;
	public static final int GRANITE_ID[] = { 6979, 6981, 6983 };

	public static final Area bankArea = new Area(new Tile[] {
			new Tile(3090, 3487, 0), new Tile(3090, 3499, 0),
			new Tile(3098, 3499, 0), new Tile(3098, 3487, 0) });

	public static final Area mininglodArea = new Area(new Tile[] {
			new Tile(3209, 2959, 0), new Tile(3219, 2959, 0),
			new Tile(3219, 2950, 0), new Tile(3209, 2950, 0) });

	public static final Area banklodArea = new Area(new Tile[] {
			new Tile(3062, 3509, 0), new Tile(3071, 3502, 0),
			new Tile(3076, 3501, 0), new Tile(3081, 3500, 0),
			new Tile(3082, 3500, 0) });

	public static final Area miningArea = new Area(new Tile[] {
			new Tile(3163, 2917, 0), new Tile(3166, 2917, 0),
			new Tile(3166, 2914, 0), new Tile(3163, 2914, 0) });

	public static final Tile[] pathtomining = new Tile[] {
			new Tile(3214, 2951, 0), new Tile(3213, 2946, 0),
			new Tile(3213, 2941, 0), new Tile(3213, 2936, 0),
			new Tile(3212, 2931, 0), new Tile(3212, 2926, 0),
			new Tile(3211, 2921, 0), new Tile(3206, 2919, 0),
			new Tile(3202, 2916, 0), new Tile(3197, 2915, 0),
			new Tile(3192, 2914, 0), new Tile(3187, 2914, 0),
			new Tile(3182, 2914, 0), new Tile(3178, 2917, 0),
			new Tile(3174, 2920, 0), new Tile(3170, 2917, 0),
			new Tile(3165, 2916, 0) };

	public static final Tile[] pathtowater = new Tile[] {
			new Tile(3067, 3504, 0), new Tile(3071, 3502, 0),
			new Tile(3076, 3501, 0), new Tile(3081, 3500, 0),
			new Tile(3082, 3500, 0) };

	public static boolean bankNow = true;
}
