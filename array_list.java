import java.util.*;
public class array_list
{
        public static void main(String args[])
        {   
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(2, 40);
            list.set(0, 50);
            System.out.println(list);
            System.out.println(list.get(0));
            list.remove(2);
            System.out.println(list);
            System.out.println(list.size());
            Collections.sort(list);
            System.out.println(list);
            for(int i=0; i<=list.size(); i++)
            {
                System.out.println(list.get(i));
            }
            System.out.println();
        }
}