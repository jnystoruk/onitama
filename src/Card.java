import java.util.HashSet;
import java.util.Set;

public class Card {

	private static Set<Card> allCards;

	private String name;

	private int[] xMoves;

	private int[] yMoves;

	private Card(String name, int[] xMoves, int[] yMoves) {
		this.name = name;
		this.xMoves = xMoves;
		this.yMoves = yMoves;
	}

	public String getName() {
		return name;
	}

	public int[] getXMoves() {
		return xMoves;
	}

	public int[] getYMoves() {
		return yMoves;
	}

	public static Set<Card> getAllCards() {
		if (allCards == null) {
			buildAllCards();
		}
		return allCards;
	}

	public static Card getCardByEnum(CardEnum e) {
		for (Card card : getAllCards()) {
			if (e.name().equals(card.getName())) {
				return card;
			}
		}
		throw new IllegalStateException("No Card associated with CardEnum " + e.name());
	}

	private static void buildAllCards() {
		allCards = new HashSet<>();
		for (CardEnum card : CardEnum.values()) {
			allCards.add(new Card(card.name(), card.getXMoves(), card.getYMoves()));
		}
	}
}
