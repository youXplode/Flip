import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControlTerm extends Tile {
    TextArea ta;
    Flip f;

    ControlTerm(Direction whichDirection, int sizeTile) {
        super(whichDirection, sizeTile);
    }

    @Override
    boolean getModifier(Ball b) {
        return false;
    }

    void setTextArea(TextArea exitPos) {
        ta = exitPos;
    }

    void setFlip(Flip flip) {
        f = flip;
    }

    @Override
    void update(Ball b, TileAndBallStorage tb) {
        tb.removeExactBall(b);
        ta.appendText("\nProcess finished with exit code " + b.number);
        f.stopRunning();
    }

    @Override
    String getName() {
        return "CtrlTerm.png";
    }

    @Override
    public Tile clone(int sizeTile) {
        ControlTerm q = new ControlTerm(thisDirection, sizeTile);
        q.setTextArea(ta);
        q.setFlip(f);
        return q;
    }

    @Override
    char getAscii() {
        return 'Q';
    }
}