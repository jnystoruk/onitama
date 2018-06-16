import java.util.Set;
import java.util.HashSet;

public class Card {

    private static Set<Card> allCards;

    private String name;

    private int[] xMoves;

    private int[]  yMoves;

    public Card(String name, int[] xMoves, int[] yMoves){
        this.name = name;
        this.xMoves = xMoves;
        this.yMoves = yMoves;
    }

    public String getName(){
        return name;
    }

    public int[] getXMoves(){
        return xMoves;
    }

    public int[] getYMoves(){
        return yMoves;
    }

    public Set<Card> getAllCards(){
        if(allCards == null){
            buildAllCards();
        }
        return allCards;
    }

    private void buildAllCards(){
        
    }
}
