package backtracking;

import java.util.Arrays;

/**
 * Created by sachin on 8/1/2018.
 */
public class Knight_Tour {
    //this problem requires generation of sequences of position of knights in NXN chessboard such that all paths are
    //covered in chessboard
    static int n=8;
    public static void main(String[] args) {
        solveKnight();
    }

    private static boolean solveKnight() {

        //solution representaion through matrix of size equal to chessboard
        int sol[][]=new int[n][n];
        // initialize all values to -1
        Arrays.fill(sol,-1);

        //since knight can move eight different places at max,so forming all those eight places either
        // 2 places to x and 1 to y  ,or 2 places to y and 1 place to x
        int xpos[]={2,1,-1,-2,-2,-1,1,2};
        int ypos[]={1,2,2,1,-1,-2,-2,-1};
        sol[0][0]=0;//say starting point
        if(!solve_it(0,0,1,sol,xpos,ypos))//here 1 means starting move value or can say value of start
        //and subsequently increasing till 64 when complete board is traverse
        {
            System.out.println("sol does not exist");
            return false;
        }
        else print_sol(sol);
        return true;
    }

    private static void print_sol(int[][] sol) {
        for (int x = 0; x < n; x++)
        {
            for (int y = 0; y < n; y++)
                System.out.print(sol[x][y]);
            System.out.println();
        }
    }

    private static boolean solve_it(int x, int y, int moves, int[][] sol, int[] xpos, int[] ypos) {

        //corner case or completion
        if(moves==n*n)//means we are done exploring it
        {
            return false;
        }

        //now moving to all eight position
        for (int i = 0; i <8 ; i++) {
            int x_n=x+xpos[i];
            int y_n=y+ypos[i];
            if(safe(x_n,y_n,sol))
            {
                sol[x_n][y_n]=moves;
                if(solve_it(x_n, y_n, moves + 1, sol, xpos, ypos))
                    return true;
                else sol[x_n][y_n]=-1;
            }
        }
return false;
    }

    private static boolean safe(int x_n, int y_n, int[][] sol) {
        return ( x_n >= 0 && x_n < n && y_n >= 0 &&
                y_n < n && sol[x_n][y_n] == -1);
       // return false;
    }
}
