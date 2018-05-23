import java.awt.*;

public class Piece {
    private Point loc;
    private String player;
    private boolean isKing;

    public Piece(Point loc, String player) {
        this.loc = loc;
        this.player = player;
        isKing = false;
    }

    protected void setLoc(Point loc) {
        this.loc = loc;
    }

    protected void setKing(boolean king) {
        isKing = king;
    }
}
