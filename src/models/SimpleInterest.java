package models;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class SimpleInterest{
  
  public BigDecimal simpleInterest(BigDecimal principal,BigDecimal rate,BigDecimal time){
    return principal.multiply(rate).multiply(time).divide(BigDecimal.valueOf(100),2,RoundingMode.HALF_UP);
  }
  
}