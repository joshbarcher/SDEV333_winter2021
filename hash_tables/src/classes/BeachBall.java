package classes;

import java.awt.*;

public class BeachBall
{
    private Color color;
    private boolean inflated;

    public BeachBall(Color color, boolean inflated)
    {
        this.color = color;
        this.inflated = inflated;
    }

    public Color getColor()
    {
        return color;
    }

    public boolean isInflated()
    {
        return inflated;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setInflated(boolean inflated)
    {
        this.inflated = inflated;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BeachBall beachBall = (BeachBall) o;

        if (inflated != beachBall.inflated) return false;
        if (color != null ? !color.equals(beachBall.color) : beachBall.color != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (inflated ? 1 : 0);
        return result;
    }
}
