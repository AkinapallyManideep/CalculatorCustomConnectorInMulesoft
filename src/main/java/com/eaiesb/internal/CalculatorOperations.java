package com.eaiesb.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class CalculatorOperations {

  /**
   * Example of an operation that uses the configuration and a connection instance to perform some action.
   */
  @MediaType(value = ANY, strict = false)
  public String retrieveInfo(@Config CalculatorConfiguration configuration, @Connection CalculatorConnection connection){
    return "Using Configuration [" + configuration.getConfigId() + "] with Connection id [" + connection.getId() + "]";
  }

  /**
   * Example of a simple operation that receives a string parameter and returns a new string message that will be set on the payload.
   */
  @MediaType(value = ANY, strict = false)
  public int Add(int number1,int number2,String opp) {
    return (number1+number2);
  }
  @MediaType(value = ANY, strict = false)
  public int Sub(int number1,int number2,String opp) {
    return (number1-number2);
  }
  @MediaType(value = ANY, strict = false)
  public int Mul(int number1,int number2,String opp) {
    return (number1*number2);
  }
  @MediaType(value = ANY, strict = false)
  public int Div(int number1,int number2,String opp) {
    return (number1+number2);
  }

  /**
   * Private Methods are not exposed as operations
   */
  
}
