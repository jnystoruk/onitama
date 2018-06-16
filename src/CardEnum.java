public enum CardEnum {

 Tiger({0, 0}, {2, -1}),

 Dragon({-2, -1, 1, 2}, {1, -1, -1, 1}),

 Frog({-2, -1, 1}, {0, 1, -1}),

 Rabbit({-1, 1, 2}, {-1, 1, 0}),

 Crab({-2, 0, 2}, {0, 1, 0}),

 Elephant({-1, -1, 1, 1}, {1, 0, 0, 1}),

 Goose({-1, -1, 1, 1}, {1, 0, 0, -1}),

 Rooster({-1, -1, 1, 1}, {-1, 0, 0, 1}),

 Monkey({-1, -1, 1, 1}, {1, -1, 1, -1}),

 Mantis({-1, 0, 1}, {1, -1, 1}),

 Horse({-1, 0, 0}, {0, 1, -1}),

 Ox({0, 0, 1}, {1, -1, 0}),

 Crane({-1, 0, 1}, {-1, 1, -1}),

 Boar({-1, 0, 1}, {0, 1, 0}),

 Eel({-1, -1, 1}, {1, -1, 0}),

 Cobra({-1, 1, 1}, {0, 1, -1});
   

    private int[] xMoves;

    private int[] yMoves;

    public CardEnum(int[] xMoves, int[] yMoves){
        this.xMoves = xMoves;
        this.yMoves = yMoves;
    }

    public int[] getXMoves(){
        return xMoves;
    }

    public int[] getYMoves(){
        return yMoves;
    }
}
