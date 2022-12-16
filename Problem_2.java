import java.util.*;
public class Problem_2 
{
    public static void main(String args[])
    {
        int[] arr = {3,4,4,3,5,6,1,1,2,3,8,9,33};
        System.out.println(count(arr));
    }
    //function to count unique elements in an array
    static int count(int[] arr)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        return hs.size();
    }
}

