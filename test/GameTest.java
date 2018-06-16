import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class GameTest {

	@Test
	public void InitializeGameTest() {
		Game game = new Game();
		Set<Player> players = game.getPlayers();
		Set<Card> cards = game.getCards();

		assertEquals(2, players.size());
		assertEquals(10, Piece.getAllPieces().size());
		assertEquals(5, cards.size());

		int blueRow = 0;
		int redRow = 4;
		for (int column = 0; column < 5; column++) {
			Piece bluePiece = game.getPieceAtLocation(blueRow, column);
			Piece redPiece = game.getPieceAtLocation(redRow, column);
			assertEquals("Blue", bluePiece.getColour());
			assertEquals("Red", redPiece.getColour());
			assertTrue(game.getPieceAtLocation(blueRow, 2).isSensei());
			assertTrue(game.getPieceAtLocation(redRow, 2).isSensei());
		}
	}
}
