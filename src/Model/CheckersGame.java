package Model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class CheckersGame {
    private List<Piece> pieces;

    public CheckersGame() {
        // add pieces in the starting location to pieces
        pieces = new ArrayList<>();
        // make and add pieces
        // ...
    }

    public boolean moveIsValid(Point start, Point end) {

        return false;
    }

    public void makeMove(Point start, Point end) {

    }

    public boolean jumpAvailable(String player) {

        return false;
    }

    public boolean gameWon() {

        return false;
    }
}
