class SquareWithSameColor {
    public boolean canMakeSquare(char[][] grid) 
    {
        int countW = 0;
        int countB = 0;
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (grid[i][j] == 'W') 
                {
                    countW++;
                }
                else 
                {
                    countB++;
                }
                if (grid[i][j+1] == 'W') 
                {
                    countW++;
                }
                else 
                {
                    countB++;
                }
                if (grid[i+1][j] == 'W') 
                {
                    countW++;
                }
                else 
                {
                    countB++;
                }
                if (grid[i+1][j+1] == 'W') 
                {
                    countW++;
                }
                else
                {
                    countB++;
                }
                if (countW == 4 || countB == 4 || countW == 3 || countB == 3) {
                    return true;
                }
                countW = 0;
                countB = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        SquareWithSameColor solution = new SquareWithSameColor();
        char[][] grid = {
            {'B', 'W', 'B'},
            {'B', 'W', 'W'},
            {'B', 'W', 'B'}
        };
        System.out.println(solution.canMakeSquare(grid)); // Output: true
    }
}
