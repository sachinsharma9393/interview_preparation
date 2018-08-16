package arrays;

/**
 * Created by sachin on 6/22/2018.
 */
public class Rearrange_ai_to_aai {
    public static void main(String[] args) {
        int a[]={3,1,0,2,4,};
        //output 2,1,3,0,4
            //using concept===output=(input+((output%n)*n)/*n)
            //in o(n) timne and 0(1)space
        int n=10;//say 10 is a number we multiply,divide,remainder ,because we have to choose a number greater than all
        for (int i = 0; i <a.length ; i++) {
                a[i]=a[i]+(a[a[i]]%n)*n;//remainder is applied with a[a[i]] otherwise computed valued gets added in loop
            //so as to keep values in range this is done bcoz %n keeps value in range from 0 to n-1
        }
        //in this step we will divide all elements by size
        //till here output
        System.out.println("output till second last step");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

        System.out.println("final_output after dividing by n");
        for (int i = 0; i <a.length ; i++) {
            a[i]=a[i]/n;
            System.out.println(a[i]);//or even store in that array as a[i]=a[i]/n
        }


        //again doing above complete step see we get same
        for (int i = 0; i <a.length ; i++) {
            a[i]=a[i]+(a[a[i]]%n)*n;//remainder is applied with a[a[i]] otherwise computed valued gets added in loop
            //so as to keep values in range this is done bcoz %n keeps value in range from 0 to n-1
        }
        //in this tep we will divide all elements by size
        //till here output
        System.out.println("output till second last step");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

        System.out.println("final_output after dividing by n");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]/n);//or even store in that array as a[i]=a[i]/n
        }

    }
}
