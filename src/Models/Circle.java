package Models;

public class Circle extends StdFigure{
    private int radio;

    public Circle(){

    }

    public Circle(int x, int y, int radio){
        super(x,y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
