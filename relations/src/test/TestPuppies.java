package test;

import classes.CorgiPuppy;
import classes.Puppy;

import java.util.HashSet;

public class TestPuppies
{
    public static void main(String[] args)
    {
        Puppy pup1 = new Puppy("Chewy", "Chew Toy", 10, 25.3);
        Puppy pup2 = new Puppy("Chewy", "Mister", 4, 3.2);
        Puppy pup3 = new Puppy("Toby", "Tobenator", 20, 22.0);
        Puppy pup4 = new Puppy("Chewy", "Chewenator", 5, 12.3);

        CorgiPuppy corgi = new CorgiPuppy("Chewy", "Chew Toy", 10, 25.3);

        //compare a Puppy and CorgiPuppy
        System.out.println("pup1 & corgi the same? " + pup1.equals(corgi));
        System.out.println("pup1 & corgi the same? " + corgi.equals(pup1));
        System.out.println();


        //is my equals method reflexive?
        System.out.println("pup1 & pup1 the same? " + pup1.equals(pup1));
        System.out.println("pup2 & pup2 the same? " + pup2.equals(pup2));
        System.out.println("pup3 & pup3 the same? " + pup3.equals(pup3));
        System.out.println();

        //is my equals method symmetric
        System.out.println("pup1 & pup2 the same? " + pup1.equals(pup2));
        System.out.println("pup2 & pup1 must be the same: " + pup2.equals(pup1));
        System.out.println("pup1 & pup3 the same? " + pup1.equals(pup3));
        System.out.println("pup3 & pup1 the same? " + pup3.equals(pup1));
        System.out.println();

        //is my equals method transitive
        System.out.println("pup1 & pup2 the same? " + pup1.equals(pup2));
        System.out.println("pup2 & pup4 the same? " + pup2.equals(pup4));
        System.out.println("pup1 & pup4 must be the same: " + pup1.equals(pup4));

        //careful with hash tables
        HashSet<Puppy> set = new HashSet<>();

        set.add(pup1);
        set.add(pup2);

        System.out.println(set.size());
    }
}










