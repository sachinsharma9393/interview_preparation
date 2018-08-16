package backtracking;

/**
 * Created by sachin on 7/31/2018.
 */
public class Rat_in_a_maze {
    private static final int SIZE = 5;

    //the maze problem
    private static int[][] a = {
            {0,1,0,1,1},
            {0,0,0,0,0},
            {1,0,1,0,1},
            {0,0,1,0,0},
            {1,0,0,1,0}
    };

    //matrix to store the solution
    private static int[][] solution = new int[SIZE][SIZE];
    public static void main(String[] args) {
        if(solve(0,0))
            give(solution);
        else
            System.out.println("no solution");
    }

    private static void give(int[][] solution) {
        for(int i=0;i<SIZE;i++)
        {
            for(int j=0;j<SIZE;j++)
            {
                System.out.print(solution[i][j]+"\t");
            }
            System.out.print("\n\n");
        }
    }

    private static boolean solve(int r, int c) {
        if(r==SIZE-1 && c==SIZE-1)//if destination reached
        {
            solution[r][c]=1;
            return  true;
        }

        if(r>=0 && c>=0 && r<SIZE && c<SIZE && solution[r][c]==0 && a[r][c]==0)
        {
            //means r,c should lie btw 0 and size and a[r][c] =0 shows there is a path to  traverse and solution
            //[r][c] means have not not taken this r,c into account
            solution[r][c]=1;
            if(solve(r-1,c))
            {
                return true;
            }
            if(solve(r+1,c))
            {
                return true;
            }
            if(solve(r,c-1))
            {
                return true;
            }
            if(solve(r,c+1))
            {
                    return true;
            }
            solution[r][c]=0;
            return false;
        }
return  false;
    }
}


/*
//My Java solution.It works fine.

class GfG{
public static ArrayList<string> printPath(int[][] m, int n)
{
TreeSet<string> l=new TreeSet<string>();
check(m,0,0,n,l,"");
ArrayList<string> al=new ArrayList<string>(l);
return al;
}
static void check(int m[][],int i,int j,int n,TreeSet<string> l,String str){
if(i<0||j<0||i==n||j==n)return;
if(i==n-1&&j==n-1)
{
l.add(str);
return;
}
if(m[i][j]==1){
m[i][j]=2;
check(m,i-1,j,n,l,str+"U");
check(m,i+1,j,n,l,str+"D");
check(m,i,j-1,n,l,str+"L");
check(m,i,j+1,n,l,str+"R");
m[i][j]=1;
}
}
}
 */