package test;

import data_structures.Bag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class UseTheBag
{
    public static void main(String[] args)
    {
        //create a bag
        Bag<Integer> myBag = new Bag<>(10);
        myBag.add(20);

        //test the size of our bag
        System.out.println("Num elements in bag: " + myBag.size());
        System.out.println("Is the bag empty: " + myBag.isEmpty());

        //add some elements
        Random random = new Random();
        for (int i = 1; i <= 3; i++)
        {
            //int rand = random.nextInt(10);
            myBag.add(i);
        }

        //determine if elements are in the bag?
        System.out.println(myBag);
        System.out.println("Is 10 in the bag? " + myBag.contains(10));
        System.out.println("Is -3 in the bag? " + myBag.contains(-3));

        //test the size of our bag
        System.out.println("Num elements in bag: " + myBag.size());
        System.out.println("Is the bag empty: " + myBag.isEmpty());

        //loop over the bag using a for-i loop (unsuccessful)
       /* for (int i = 0; i < myBag.size(); i++)
        {
            //System.out.println(myBag[i]);
        }*/

        //using an Iterator directly
        /*Iterator<Integer> iter = myBag.iterator();
        while (iter.hasNext())
        {
            int num = iter.next();

            System.out.println("Num: " + num);
        }*/

        //using an Iterator indirectly
        for (int num : myBag)
        {
            myBag.add(1);
            System.out.println(num);
        }

        ArrayList<String> strings;
    }
}












