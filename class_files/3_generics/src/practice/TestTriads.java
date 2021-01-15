package practice;

import example.Engine;

import java.util.List;

public class TestTriads
{
    public static void main(String[] args)
    {
        //String is Comparable
        StringTriad wordTriplet = new StringTriad("wind", "cat", "organ");
        System.out.println(wordTriplet);

        List<String> sorted = wordTriplet.sort();
        for (int i = 0; i < sorted.size(); i++)
        {
            System.out.println(sorted.get(i));
        }
        System.out.println(); //new line

        //Boolean is Comparable
        Triad<Boolean> flags = new Triad<>(false, true, false);

        //Engine is NOT Comparable
        //Triad<Engine> engines = new Triad<Engine>(null, null, null);

        IntegerTriad intTriplet = new IntegerTriad(10, 3, 1);
        System.out.println(intTriplet);

        List<Integer> sortedInts = intTriplet.sort();
        for (int i = 0; i < sortedInts.size(); i++)
        {
            System.out.println(sortedInts.get(i));
        }
    }
}
