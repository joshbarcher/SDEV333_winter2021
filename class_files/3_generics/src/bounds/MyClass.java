package bounds;

import storage_classes.ObjectStorage;

import java.awt.*;

/*
    MyClass is NOT generic!
    MyClass is-a Color
 */
public class MyClass extends Color implements INameable
{
    public MyClass(int red, int green, int blue)
    {
        super(red, green, blue);
    }

    @Override
    public String getFirstName()
    {
        return null;
    }

    @Override
    public String getLastName()
    {
        return null;
    }

    @Override
    public char getMiddleInit()
    {
        return 0;
    }

    @Override
    public String getNickName()
    {
        return null;
    }
}
