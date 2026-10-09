package main;
import models.SimpleInterest;
import java.math.BigDecimal;
public class Main {
  public static void main(String[]args){
    BigDecimal p = BigDecimal.valueOf(100);
    BigDecimal r = BigDecimal.valueOf(10);
    BigDecimal t = BigDecimal.valueOf(10);
   SimpleInterest simpleInterest = new SimpleInterest();
    BigDecimal result = simpleInterest.simpleInterest(p,r,t);
    System.out.println(result.toPlainString());
  }
}