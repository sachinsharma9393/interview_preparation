package backtracking;

/**
 * Created by sachin on 8/17/2018.
 */
public class RM {
   static boolean found =false;
    public static void main(String[] args) {
        int g[][]  =  { {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int sol[][]=new int[g.length][g.length];//making last index of 2d array as 1 as when we reach here we just print
        //otherwise last index would have been 0
        sol[g.length-1][g.length-1]=1;
        solve(g,0,0,sol,g.length);
    }

    private static void solve(int[][] g, int i, int j, int[][] sol, int length) {
        if(found)return;
        if(i==length-1 && j==length-1){
            print(sol,length);
            found=true;
            return;
        }
      //  if(i>=length || j>=length)return;
       // System.out.println("i,j" + i + "----" + j);
        if(g[i][j]==1)
        {
            sol[i][j]=1;
            if(i+1 !=length)
            solve(g,i+1,j,sol, g.length);
           // if(found)return;
            if(j+1!=length)
            solve(g,i,j+1,sol, g.length);
            //here
           //if(found)return;
            sol[i][j]=0;
            System.out.println("i,j" + i + "----" + j);
        }
        //else return;


    }

    private static void print(int[][] sol,int n) {
        //print sol
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }
}