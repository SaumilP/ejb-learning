package com.saumilp.calculator.implementations;

import com.saumilp.calculator.interfaces.CalculationBase;

import java.util.logging.Logger;

/**
 * <p>Base Bean Class performing basic calculation actions</p>
 *
 * Created by saumil on 2014/05/27.
 */
public class CalculatorBeanBase implements CalculationBase {
    private static Logger logger = Logger.getLogger(CalculatorBeanBase.class.getName());

    @Override
    public int add(int... arguments) {
        int result= 0;
        final StringBuffer sb = new StringBuffer();
        sb.append("Adding Arguments: ");

        for( final int arg : arguments ){
            result += arg;
            sb.append(arg);
            sb.append(" ");
        }

        logger.info(sb.toString());
        logger.info("Result: "+ result);
        return result;
    }
}
