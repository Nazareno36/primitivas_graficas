package Models;

public class Square extends StdFigure{
    int side;

    public Square(){

    }

    public Square(int x, int y, int side){
        super(x,y);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
