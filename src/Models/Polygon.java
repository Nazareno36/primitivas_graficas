package Models;

import java.awt.*;

public class Polygon extends GeoFigure{
    private int x[];
    private int y[];

    public Polygon(){

    }

    public Polygon(Color borderColor, Color fillColor, int[] x, int[] y) {
        super(borderColor, fillColor);
        this.x = x;
        this.y = y;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }
}
