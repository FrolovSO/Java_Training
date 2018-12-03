package tech;

public class Tech<N1 extends Number,N2 extends Number> {

    N1 x;
    N2 y;

    public N1 getX() {
        return x;
    }

    public void setX(N1 x) {
        this.x = x;
    }

    public N2 getY() {
        return y;
    }

    public void setY(N2 y) {
        this.y = y;
    }

}
