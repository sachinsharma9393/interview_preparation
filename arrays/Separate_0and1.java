package arrays;

class Separate_0and1
{
    public static void main(String[] args) {
        int a[] = {0, 0, 1, 1, 1, 1, 0, 0, 1, 1};
        //2 methods
        //m-1 counting sort
        //m-2 partition algo of quicksort like approach
        //m-2

        int p = 0, q = a.length - 1;
        while (p <= q) {

            //4 possible combination of p,q 00,01,10,11
            if (a[p] == 1 && a[q] == 0) {
                //swap here
                int temp = a[p];
                a[p] = a[q];
                a[q] = temp;
                p++;
                q--;
            }
            else if(a[p]==0 && a[q]==1)
            {
                p++;q--;
            }
            else if(a[p]==0 && a[q]==0)
            {
                p++;
            }
            else q--;
        }
        System.out.println("here is separated 0,1 of the array");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}