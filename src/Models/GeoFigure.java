package Models;

import java.awt.*;

public abstract class GeoFigure {
    private Color borderColor;
    private Color fillColor;

    public GeoFigure(){

    }

    public GeoFigure(Color borderColor, Color fillColor){
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
}
