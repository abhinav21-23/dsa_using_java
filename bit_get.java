import java.util.*;
public class bit_get
{
    public static void main(String args[])
    {
        int n=5; //0101
        int pos=3;
        int bitmask=1<<pos;
        if((bitmask & n)==0)
        {
            System.out.println("bit was zero");
        }
        else
        {
            System.out.println("bit was one");
        }
    }
}