package Controllers;

import Models.GeoFigure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel {
    private ArrayList<GeoFigure> geoFigures;

    public Canvas(int width, int height){
        this.setPreferredSize(new Dimension(width,height));
        this.setFocusable(true);
        this.geoFigures = new ArrayList<>();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Toolkit t = Toolkit.getDefaultToolkit();
        java.awt.Image sprite = t.getImage("src/Assets/T-rex.png");
        g.drawImage(sprite,150,200,50,50,this);
    }

    public ArrayList<GeoFigure> getGeoFigures() {
        return geoFigures;
    }

    public void setGeoFigures(ArrayList<GeoFigure> geoFigures) {
        this.geoFigures = geoFigures;
    }

}
