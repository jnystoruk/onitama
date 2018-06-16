public enum CardEnum {

	Tiger(new int[] { 0, 0 }, new int[] { 2, -1 }),

	Dragon(new int[] { -2, -1, 1, 2 }, new int[] { 1, -1, -1, 1 }),

	Frog(new int[] { -2, -1, 1 }, new int[] { 0, 1, -1 }),

	Rabbit(new int[] { -1, 1, 2 }, new int[] { -1, 1, 0 }),

	Crab(new int[] { -2, 0, 2 }, new int[] { 0, 1, 0 }),

	Elephant(new int[] { -1, -1, 1, 1 }, new int[] { 1, 0, 0, 1 }),

	Goose(new int[] { -1, -1, 1, 1 }, new int[] { 1, 0, 0, -1 }),

	Rooster(new int[] { -1, -1, 1, 1 }, new int[] { -1, 0, 0, 1 }),

	Monkey(new int[] { -1, -1, 1, 1 }, new int[] { 1, -1, 1, -1 }),

	Mantis(new int[] { -1, 0, 1 }, new int[] { 1, -1, 1 }),

	Horse(new int[] { -1, 0, 0 }, new int[] { 0, 1, -1 }),

	Ox(new int[] { 0, 0, 1 }, new int[] { 1, -1, 0 }),

	Crane(new int[] { -1, 0, 1 }, new int[] { -1, 1, -1 }),

	Boar(new int[] { -1, 0, 1 }, new int[] { 0, 1, 0 }),

	Eel(new int[] { -1, -1, 1 }, new int[] { 1, -1, 0 }),

	Cobra(new int[] { -1, 1, 1 }, new int[] { 0, 1, -1 });

	private int[] xMoves;

	private int[] yMoves;

	private CardEnum(int[] xMoves, int[] yMoves) {
		this.xMoves = xMoves;
		this.yMoves = yMoves;
	}

	public int[] getXMoves() {
		return xMoves;
	}

	public int[] getYMoves() {
		return yMoves;
	}
}
