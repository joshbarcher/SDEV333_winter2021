package example;

import java.util.HashMap;
import java.util.Map;

public class MultipleGenericTypes
{
    public static void main(String[] args)
    {
        Map<String, Integer> winterQuarterStats = new HashMap<>();

        winterQuarterStats.put("SDEV 333", 22);
        winterQuarterStats.put("SDEV 301", 27);
        winterQuarterStats.put("SDEV 328", 22);
        winterQuarterStats.put("SDEV 426", 23);

        System.out.println(winterQuarterStats.get("SDEV 333"));
    }
}
