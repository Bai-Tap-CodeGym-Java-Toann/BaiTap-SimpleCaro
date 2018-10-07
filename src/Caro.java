public class Caro {
    private String[][] map;
    private String currentTurn = "X";

    public Caro(int size) {
        if (size > 0) {
            this.map = mapGenerator(size);
        } else {
            this.map = mapGenerator(3);
        }
    }

    public Caro() {
        this.map = mapGenerator(3);
    }

    public String[][] getMap() {
        return this.map;
    }

    public String getCurrentTurn() {
        return currentTurn;
    }

    private void setTurn() {
        if (this.currentTurn.equals("X")) {
            this.currentTurn = "O";
        } else {
            this.currentTurn = "X";
        }
    }

    public void mark(int x, int y) {
        if ((x >= 0) && (x < this.map.length)) {
            if ((y >= 0) && (y < this.map.length)) {
                this.map[y][x] = this.currentTurn;
                setTurn();
            }
        }
    }


    private String[][] mapGenerator(int n) {
        String[][] map = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = " ";
            }
        }
        return map;
    }
}
