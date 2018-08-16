package backtracking;

/**
 * Created by sachin on 7/31/2018.
 */
public class Nqueens2 {
   static int board[][]=new int[4][4];//chess board
    static int N=4;
    public static void main(String[] args) {

        Nq(N);
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }

    }

    private static boolean Nq(int N) {
        //base if i reached to 0 means done processing
        if(N==0)return true;

        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
                if(safe(i,j)&& board[i][j]!=1 )  //whether placing here is safe or not and i have traversed this position
                //if i have traversed this position i will mark it as 1
                {
                    board[i][j]=1;
                    if(Nq(N-1))
                    {
                        return true;
                    }
                    board[i][j]=0;//backtracking step ....means if i am not founding Nq(N-1) i will make that board
                    //value to 0 again and search for new solution
                }

            }
        }
        return false;//if i reach here means no use of this path of finding
    }

    private static boolean safe(int i, int j) {

        //checking whether it is safe to place in this row and column

            for (int k=0;k<N;k++)
            {
                if(board[i][k]==1 || board[k][j]==1)
                    return false;
            }
        //now checking clashes in diagonal
        for(int k=0;k<N;k++)
        {
            for(int l=0;l<N;l++)
            {
                if((k+l==i+j) || (k-l==i-j))
                {
                    if(board[k][l]==1)return false;
                }
            }
        }
        return true;
    }
}
