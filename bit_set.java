import java.util.*;
public class bit_set
{
    public static void main(String args[])
    {
        int n=5; //0101
        int pos=2;
        int bitmask=1<<pos;
        int newNumber=bitmask|n;
        System.out.println(newNumber);
    }
}