package iterators;

import java.util.Iterator;

public class RGBColor implements Iterable<Integer>
{
    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed()
    {
        return red;
    }

    public int getGreen()
    {
        return green;
    }

    public int getBlue()
    {
        return blue;
    }

    @Override
    public String toString()
    {
        return "RGBColor{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new RGBIterator(red, green, blue);
    }

    private class RGBIterator implements Iterator<Integer>
    {
        private int[] components;

        public RGBIterator(int red, int green, int blue)
        {
            components = new int[] {red, green, blue};
        }

        @Override
        public boolean hasNext()
        {
            return false;
        }

        @Override
        public Integer next()
        {
            return null;
        }
    }
}










