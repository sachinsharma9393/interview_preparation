package arrays;

class Odd_Occuring_n
{
    public static void main(String[] args) {
        //3 methods
        //m-1 brute force 0(n2)
		//m-2 linkedhashmap of java storing value of element as number of occurences then scan it linkedhashmap
		//m-3 XOR OPERATION
	int a[]={1,2,3,1,2,3,1};//here 1 is odd occuring
	int result=0;
	for(int i=0;i<a.length;i++)
	{
		result^=a[i];
	}
        System.out.println(result);
    }
}