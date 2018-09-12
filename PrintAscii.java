import javafx.scene.control.TextArea;

public class PrintAscii extends Tile {
    private TextArea toPrint = Flip.output;

    PrintAscii(Direction whichDirection, int sizeTile) {
        super(whichDirection, sizeTile);
    }

    @Override
    boolean getModifier(Ball b) {
        return false;
    }

    @Override
    void update(Ball b, TileAndBallStorage tb) {
        tb.removeExactBall(b);
        char c = (char) Math.abs(b.number);
        toPrint.setText(toPrint.getText() + c);
    }

    @Override
    String getName() {
        return "PrintAscii.png";
    }

    @Override
    public Tile clone(int sizeTile) {
        return new PrintAscii(thisDirection, sizeTile);
    }

    @Override
    char getAscii() {
        return 'P';
    }
}
