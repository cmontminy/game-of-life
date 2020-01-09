import processing.core.PApplet;

public class Game extends PApplet {

    private static Grid board;


    public static void main(String[] args) {
        PApplet.main("Game");
    }
    
    public void settings() {
    	// Don't add anything else here I think
    	size(LConstants.screenWidth, LConstants.screenHeight + LConstants.menuHeight);
    }
    
    public void setup() {
    	// One time setup operations
        System.out.println("Launching game with a board of size " + LConstants.screenWidth + " x " + LConstants.screenHeight);
        // Uncomment to slowdown the animation:
        //frameRate(5);
        board = new Grid(this);	
    }
    
    public void draw() {
    	// Operations to repeat
    	board.updateSquares();
    	board.drawBoard();
    }
}