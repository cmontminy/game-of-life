public class Square {

	private int life;
    private int xCor = 0;
    private int yCor = 0;
    private boolean state = false;

    public Square(int x, int y, boolean status) {
        xCor = x;
        yCor = y;
        state = status;
    }
    
    public void setLife(int life) {
    	this.life = life;
    }
    
    public int getLife() {
    	return life;
    }
    
    public int getColor() {
    	return map(life, 0, LConstants.SQUARE_AGE_CAP, LConstants.YOUNG_SQUARE_COLOR, LConstants.OLD_SQUARE_COLOR);
    }
    
    private int map(int tgt, int min, int max, int newMin, int newMax) {
    	if (tgt >= max) {
    		return newMax;
    	}
    	else if (tgt <= min) {
    		return newMin;
    	}
    	double percent = (double) (tgt - min) / (max - min);
    	//return (int) (newMin + (newMax - newMin) * percent);
    	return newMin;
    }

    public int getX() {
        return xCor;
    }

    public int getY() {
        return yCor;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean status) {
        state = status;
    }
}