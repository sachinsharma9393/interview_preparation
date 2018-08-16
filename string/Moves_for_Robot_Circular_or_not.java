package string;
import java.util.Scanner;
/**
 * Created by sachin on 6/21/2018.
 */
public class Moves_for_Robot_Circular_or_not {
    public static void main(String[] args) {
//g means move by 1 unit
        //l means left
        //r means right
      //  String command="glglglg";

        Scanner sc=new  Scanner(System.in);
       String  my_command=sc.next();

        int x=0,y=0;
        //after scanning complete string if x=0,y=0 then circular

        char dir='n';//say starting direction is north
        for (int i = 0; i <my_command.length() ; i++) {
            if(my_command.charAt(i)=='g')
            {
                //means see directions
                if(dir=='n')
                {
                    y++;

                }
                else if(dir=='e')
                {
                    x++;
                }
                else if(dir=='w')
                {
                    x--;
                }
                else
                {
                    y--;



                }
            }
            else if(my_command.charAt(i)=='l')
            {
                if(dir=='n')
                {
                    dir='w';
                }
                else if(dir=='e')
                {
                    dir='n';
                }
                else if(dir=='w')
                {
                    dir='s';
                }
                else
                {

                    dir='e';

                }
            }
            else //if command is right
            {
//self explanaitry


            }
        }
        if(x==0 && y==0)
        {
            System.out.println("its circular, robot is at same spot!!!");
        }
        else System.out.println("not circular we are at x= " + x + "and y= " + y + "and direction is " + dir);
    }
}
