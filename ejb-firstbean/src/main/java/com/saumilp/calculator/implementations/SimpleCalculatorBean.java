package com.saumilp.calculator.implementations;

import com.saumilp.calculator.interfaces.CalculationBase;
import com.saumilp.calculator.interfaces.CalculatorLocalBusiness;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Created by saumil on 2014/05/28.
 */
@Stateless
@Local(CalculatorLocalBusiness.class)
public class SimpleCalculatorBean extends CalculatorBeanBase implements CalculationBase{

}
