package stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * Created by sachin on 6/24/2018.
 */
class Time
{
    int start_time;
    int finish_time;

}
public class Merge_Overlapping_Intervals {
    public static void main(String[] args) {

        int time[][]={{6,8},{1,3},{2,5},{9,14},{13,20},{100,120}};
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return Integer.compare(o1[0],o2[0]);
            }
        });
        System.out.println(time[0][1]);

        Time []t=new Time[time.length];
        for (int i = 0; i <time.length ; i++) {
            t[i]=new Time();
            t[i].start_time=time[i][0];
            t[i].finish_time=time[i][1];
        }

        Arrays.sort(t, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return Integer.compare(o1.start_time,o2.start_time);
            }
        });

        for (Time f:t
             ) {
            System.out.println(f.start_time +"----"+ f.finish_time);
        }

        for(int i=0;i<time.length;i++)
        {

        }

        //either take tree map...where start is a key and finish as value ,it will automatically get sorted

        TreeMap<Integer,Integer>tm=new TreeMap<>();
        for (int i = 0; i <time.length ; i++) {
            tm.put(time[i][0],time[i][1]);
        }

    }



}
