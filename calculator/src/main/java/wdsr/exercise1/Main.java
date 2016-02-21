package wdsr.exercise1;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import wdsr.exercise1.conversions.ArrayConverter;
import wdsr.exercise1.logic.Calculator;

/**
 * Created by Marek on 14.02.2016.
 */
public class Main {
	private static final Logger log = LogManager.getLogger();
	
    public static void main(String[] args) {
    	log.debug("main entered [args={}]", Arrays.toString(args));
        if (args.length == 0) {
            log.info("No input provided");
        } else {
	        Calculator calculator = new Calculator();
	        int[] nums = new ArrayConverter().convertToInts(args);
	        log.info("Min="+calculator.min(nums));
	        log.info("Max="+calculator.max(nums));
        }
    	log.debug("main exiting");
    }
}
