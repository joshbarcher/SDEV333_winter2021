package tables;

import classes.BeachBall;

import java.awt.*;
import java.util.HashSet;

public class TestMyTable
{
    public static void main(String[] args)
    {
        HashTable<String> names = new HashTable<>();

        names.add("Ruslan");
        names.add("Joseph");
        names.add("Dana");
        names.add("Ellie");
        names.add("Ryan");
        names.add("Ryan");
        names.add("Jo");
        names.add("Josh");
        names.add("Jessica");

        System.out.println(names);

        //be careful when changing elements with an overidden hashCode() and equals(), after
        //being added to the structure
        HashSet<BeachBall> balls = new HashSet<>();

        BeachBall ball = new BeachBall(Color.RED, true);
        balls.add(ball);
        System.out.println(balls.contains(ball));

        //yikes!
        ball.setColor(Color.BLACK);
        System.out.println(balls.contains(ball));
    }
}

















