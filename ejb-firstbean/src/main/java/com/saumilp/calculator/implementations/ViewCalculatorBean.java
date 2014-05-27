package com.saumilp.calculator.implementations;

import com.saumilp.calculator.interfaces.*;

import javax.ejb.*;

/**
 * Created by saumil on 2014/05/28.
 */
@Stateless
@Local(LocalCalculation.class)
@Remote(RemoteCalculation.class)
@LocalHome(CalculatorLocalHome.class)
@RemoteHome(CalculatorRemoteHome.class)
@LocalBean
public class ViewCalculatorBean extends CalculatorBeanBase implements CalculationBase {
}
