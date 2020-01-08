public class Square {

    private int xCor = 0;
    private int yCor = 0;
    private boolean state = false;
    private int colorNum = 0;

    public Square(int x, int y, boolean status) {
        xCor = x;
        yCor = y;
        state = status;
        colorNum = 0;
    }

    public int getX() {
        return xCor;
    }

    public int getY() {
        return yCor;
    }

    public int getColor() {
        return colorNum;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean status) {
        state = status;
    }

    public void setColorNum(int num) {
        if (num > 5) {
            colorNum = 5;
        } else {
            colorNum = num;
        }
    }
}