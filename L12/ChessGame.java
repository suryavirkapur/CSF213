
interface Movable {
    void move(String newPos);
}

abstract class ChessPiece implements Movable {
    String name; 
    String color; 
    String curPos; // e.g., "a1", "c5"

    public ChessPiece(String name, String color, String curPos) {
        this.name = name;
        this.color = color;
        this.curPos = curPos;
    }

    public String toString() {
        return color + " " + name + " at " + curPos;
    }
}

class King extends ChessPiece {
    public King(String color, String curPos) {
        super("King", color, curPos);
    }

    @Override
    public void move(String newPos) {
        System.out.println(color + " " + name + " moving from " + curPos + " to " + newPos);
        curPos = newPos;
    }
}

import java.util.ArrayList;

public class ChessGame {
    public static void main(String[] args) {
        ArrayList<ChessPiece> pieces = new ArrayList<>();
        pieces.add(new King("White", "e1"));
        pieces.add(new King("Black", "e8"));

        pieces.get(0).move("e2");
        pieces.get(1).move("e7");
    }
}
