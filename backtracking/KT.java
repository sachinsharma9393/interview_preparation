package backtracking;

import java.util.Arrays;

/**
 * Created by sachin on 8/17/2018.
 */
public class KT {
    static int p=0;
    static boolean b=false;
    public static void main(String[] args) {
        Integer sol[][]=new Integer[8][8];

        for (int i = 0; i <8 ; i++) {
            Arrays.fill(sol[i],-1);
        }
        sol[0][0]=0;
        make_tour(sol,0,0);


    }

    private static void make_tour(Integer[][] sol, int i, int j) {
            //kt has 8 positions to move
        //so lets make a 2d array

        if(b)return;
        if(p==63){
            b=true;
            print(sol);
            return;
        }

        int pos[][]={
                {-2,-1},{-2,1},{2,1},{2,-1},
                {-1,2},{1,2},{-1,-2},{1,2}
        };
        //answer will depend upon how you place this indexes in array form
        //now seeing all those 8 combinations
        for (int k = 0; k <8 ; k++) {
            int x=pos[k][0];
            int y=pos[k][1];


            if(i+x>7 ||i+x<0 || j+y>7 || j+y<0)continue;
            if(sol[i+x][j+y]==-1)

            {
                sol[i+x][j+y]=++p;
                make_tour(sol,i+x,j+y);

                                }

        }

    }

    private static void print(Integer[][] sol) {
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
                System.out.print(sol[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
