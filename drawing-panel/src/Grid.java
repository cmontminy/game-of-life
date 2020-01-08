import java.util.ArrayList;

public class Grid {

    private final static int DEFAULT_SIZE = 10;

    private Square[][] board;
    private int xSize = DEFAULT_SIZE;
    private int ySize = DEFAULT_SIZE;

    public Grid() {
        board = new Square[10][10];
        makeBoard();
    }

    public Grid(int x, int y) {
        board = new Square[x][y];
        xSize = x;
        ySize = y;
        makeBoard();
    }

    public Square getSquare(int x, int y) {
        return board[x][y];
    }

    public int getSquareColor(int x, int y) {
        return board[x][y].getColor();
    }

    public int getXSize() {
        return xSize;
    }

    public int getYSize() {
        return ySize;
    }

    public boolean[][] getStates() {
        boolean[][] states = new boolean[xSize][ySize];
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                states[x][y] = board[x][y].getState();
            }
        }
        return states;
    }

    public Square[] getNeighbors(int x, int y) {
        ArrayList<Square> neighbors = new ArrayList<>();
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (!(i == 0 && j == 0)) {
                    if (x + i >= 0 && y + j >= 0 && x + i < board.length && y + j < board[0].length) {
                        if (board[x + i][y + j].getState()) {
                            neighbors.add(board[x + i][y + j]);
                        }
                    }
                }
            }
        }

        Square[] result = new Square[neighbors.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = neighbors.get(i);
        }
        return result;
    }

    public boolean getState(int x, int y) {
        return board[x][y].getState();
    }

    public void updateState(int x, int y, boolean status) {
        if (status) {
            board[x][y].setColorNum(board[x][y].getColor() + 1);
        } else {
            board[x][y].setColorNum(0);
        }
        board[x][y].setState(status);
    }

    public void printBoard() {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[x][y].getState()) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private void makeBoard() {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {
                board[x][y] = new Square(x, y, false);
            }
        }
    }

}