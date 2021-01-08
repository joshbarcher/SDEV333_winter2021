package test;

import data_structures.Bag;

import java.util.Random;

public class UseTheBag
{
    public static void main(String[] args)
    {
        //create a bag
        Bag myBag = new Bag(10);

        //add some elements
        Random random = new Random();
        for (int i = 1; i <= 10; i++)
        {
            int rand = random.nextInt(10);
            myBag.add(rand);
        }

        //determine if elements are in the bag?
        System.out.println(myBag);
    }
}
