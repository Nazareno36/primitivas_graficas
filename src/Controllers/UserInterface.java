package Controllers;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame {

    private Canvas canvas;

    public UserInterface(){
        this.canvas = new Canvas(800,600);
        this.add(canvas);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new UserInterface();
    }
}
