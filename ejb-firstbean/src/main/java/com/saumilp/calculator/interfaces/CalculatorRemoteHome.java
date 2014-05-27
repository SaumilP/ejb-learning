package com.saumilp.calculator.interfaces;

import javax.ejb.EJBHome;

/**
 * Created by saumil on 2014/05/28.
 */
public interface CalculatorRemoteHome extends EJBHome {
    RemoteCalculation create() throws Exception;
}
