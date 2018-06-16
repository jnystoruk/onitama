import java.util.HashSet;
import java.util.Set;

public class Piece {

	private static Set<Piece> allPieces;

	private String colour;

	private boolean sensei;

	private Piece(String colour, boolean isSensei) {
		this.colour = colour;
		this.sensei = isSensei;
	}

	public Set<Piece> getAllPieces() {
		if (allPieces == null) {
			allPieces = new HashSet<>();
			allPieces.add(new Piece("Red", true));
			allPieces.add(new Piece("Blue", true));
			for (int i = 0; i < 4; i++) {
				allPieces.add(new Piece("Red", false));
				allPieces.add(new Piece("Blue", false));
			}
		}
		return allPieces;
	}

	public String getColour() {
		return colour;
	}

	public boolean isSensei() {
		return sensei;
	}
}
