package com.saumilp.calculator;

import com.saumilp.calculator.implementations.SimpleCalculatorBean;
import com.saumilp.calculator.interfaces.CalculationBase;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * <p>Simple Unit Test to check basic Addition Functionality.</p>
 * Created by saumil on 2014/05/28.
 */
public class SimpleCalculatorBeanTest {
    private static Logger logger = Logger.getLogger(SimpleCalculatorBeanTest.class.getName());
    private static CalculationBase calc;

    @BeforeClass
    public static void beforeClass() {
        calc = new SimpleCalculatorBean();
    }

    @Test
    public void testSum(){
        //input declarations
        final int[] numbers = new int[] {234,2,43 };
        final int expectedTotal = 279;

        //Test method
        final int acutalSum = calc.add(numbers);
        Assert.assertTrue("Addition didn't return correct values", expectedTotal == acutalSum);

        //logging
        final StringBuffer sb = new StringBuffer();
        sb.append(" ==> Obtained result : ").append(acutalSum);
        sb.append(", Expected Sum Value : ").append(expectedTotal);
        sb.append(", From Number Arguments : ");

        for(final int arg : numbers ){
            sb.append(arg);
            sb.append(",");
        }

        logger.info(sb.toString());
    }
}
