package bounds;

import java.awt.*;

/*
    AnotherClass IS generic!
    AnotherClass is-not-a Color
    The types of my fields are Color objects
 */
public class AnotherClass<T extends Color>
{
    private T foregroundColor;
    private T backgroundColor;

    public AnotherClass(T foregroundColor, T backgroundColor)
    {
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
    }

    public T getForegroundColor()
    {
        return foregroundColor;
    }

    public void setForegroundColor(T foregroundColor)
    {
        this.foregroundColor = foregroundColor;
    }

    public T getBackgroundColor()
    {
        return backgroundColor;
    }

    public void setBackgroundColor(T backgroundColor)
    {
        this.backgroundColor = backgroundColor;
    }
}
