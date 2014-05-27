package com.saumilp.calculator.interfaces;

import javax.ejb.EJBLocalHome;

/**
 * Created by saumil on 2014/05/28.
 */
public interface CalculatorLocalHome extends EJBLocalHome {
    LocalCalculation create() throws Exception;
}
