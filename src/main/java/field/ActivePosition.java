package field;

public class ActivePosition extends Position {

    private int x;
    private int y;

    public ActivePosition(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
