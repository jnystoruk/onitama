import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {

	private Piece[][] board;

	private Set<Card> cards;

	public Game() {
		initializePiecesOnBoard();
		initializeCards();
	}

	private void initializePiecesOnBoard() {
		board = new Piece[5][5];
		int blueRow = 0;
		int redRow = 4;

		int blueCount = 0;
		int redCount = 0;

		for (Piece piece : Piece.getAllPieces()) {
			int row = "Blue".equals(piece.getColour()) ? blueRow : redRow;
			int column;
			if (piece.isSensei()) {
				column = 2;
			} else {
				column = "Blue".equals(piece.getColour()) ? blueCount++ : redCount++;
				if (column >= 2) {
					column++;
				}
			}
			board[row][column] = piece;
		}
	}

	private void initializeCards() {
		List<Card> allCards = new ArrayList<>();
		allCards.addAll(Card.getAllCards());

		cards = new HashSet<Card>();
		for (int count = 0; count < 5; count++) {
			int index = (int) (allCards.size() * Math.random());
			while (cards.contains(allCards.get(index))) {
				index = (int) (allCards.size() * Math.random());
			}
			cards.add(allCards.get(index));
		}
	}

	public void playCard(Player player, Card card, int moveIndex, Piece piece) {
		throw new UnsupportedOperationException();
	}

	public Set<Card> getCards() {
		return cards;
	}

	public Set<Player> getPlayers() {
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Red"));
		players.add(new Player("Blue"));
		return players;
	}

	public Piece getPieceAtLocation(int row, int column) {
		return board[row][column];
	}

}
