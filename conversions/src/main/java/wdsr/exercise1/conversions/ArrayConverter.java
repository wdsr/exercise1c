package wdsr.exercise1.conversions;

import java.util.Arrays;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
    public int[] convertToInts(String[] strings) {
        return Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    }
}
