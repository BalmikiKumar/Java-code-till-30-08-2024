package Backtracking;

public class SudokuProblem {
    public static void print(int[][] grid,int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] grid, int row, int column,int num, int n){
        //row clash - row has unique values
        for(int i=0; i<n; i++){
            //check if it is safe to assign the number or not
            if(grid[row][i] == num){
                return false;
            }
        }
        //column clash - column has unique values
        for(int i=0; i<n; i++){
            //check if it is safe to assign the number or not
            if(grid[i][column] == num){
                return false;
            }
        }
        //subgrid/box clash - subgrid has unique values
        int sqrt = (int) Math.sqrt(n);
        int boxRow = row - row % sqrt;
        int boxColumn = column - column % sqrt;

        for(int i=boxRow; i<boxRow + sqrt; i++){
            for(int j=boxColumn; j<boxColumn + sqrt; j++){
                if(grid[i][j] == num){
                    return false;
                }
            }
        }
        //if there is no clash, it is safe
        return true;
    }
    public static boolean sudokuSolver(int [][] grid,int n){
        int row = -1, column = -1;
        boolean isEmpty = true;

        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                 if(grid[i][j] == 0){
                     row = i;
                     column = j;

                     //we still have some values left in sudoku
                     isEmpty = false;
                     break;
                 }
            }
            if(!isEmpty){
                break;
            }
        }

        //no empty space left
        if(isEmpty){
            return true;
        }

        //else for each row backtrack
        for(int num= 1 ; num<=9; num++){
            if(isSafe(grid,row,column,num,n) == true){
                return true;
            }
            else{
                grid[row][column] = 0 ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (sudokuSolver(grid, grid.length)) {
            print(grid, grid.length);
        } else {
            System.out.println("No solution exists");
        }


    }
}
