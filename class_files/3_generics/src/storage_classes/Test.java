package storage_classes;

import java.awt.*;
import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        IntegerStorage number = new IntegerStorage(100);

        ObjectStorage object1 = new ObjectStorage("hello");
        ObjectStorage object2 = new ObjectStorage(new Color(0, 0, 0));
        ObjectStorage object3 = new ObjectStorage(100);

        //we need to cast our Object back to its original type
        Object result = object1.getData();

        if (result instanceof String)
        {
            String stringResult = (String)result;
            System.out.println(stringResult.toUpperCase());
        }

        System.out.println(object2.getData());
        System.out.println(object3.getData());

        //try our generic class instead
        DataStorage<String> data1 = new DataStorage<String>("hello");
        DataStorage<Color> data2 = new DataStorage<Color>(new Color(0, 0, 0));
        DataStorage<Integer> data3 = new DataStorage<Integer>(100);

        System.out.println(data1.getData().toUpperCase());
        System.out.println(data2.getData().brighter());
        System.out.println(data3.getData().longValue());
    }
}
