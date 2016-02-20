package wdsr.exercise1.logic;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by Marek on 14.02.2016.
 */
public class Calculator {
    public long min(int... values) {
        return NumberUtils.min(values);
    }

    public long max(int... values) {
        return NumberUtils.max(values);
    }
}
