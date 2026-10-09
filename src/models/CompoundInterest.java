package models;
  import java.math.BigDecimal;
  import java.math.MathContext;
  import java.math.RoundingMode;
  /* fomula A = P(1 + R/100n)^nt
  principal
: annual rate as a percentage
: compounding periods per year
: time in years
: final amount
: interest earned
    CI = A - P  */
  public class  CompoundInterest {
    public Result calculate(BigDecimal principal,
                         /*r*/     BigDecimal rate,
                           /*t*/   int years,
                           /*n*/   int compoundPerYear){
       BigDecimal periodsPerHundred = BigDecimal.valueOf(100L * compoundPerYear);
       int totalPeriods = compoundPerYear*years;
       BigDecimal periodicRates = rate.divide(periodsPerHundred,MathContext.DECIMAL128);
       BigDecimal growthFactor = BigDecimal.ONE.add(periodicRates);
       BigDecimal finalAmount = principal.multiply(growthFactor.pow(totalPeriods,MathContext.DECIMAL128));
       BigDecimal interestEarned = finalAmount.subtract(principal);
      return new Result(finalAmount,interestEarned);
    }
    public static class  Result{
   private final BigDecimal finalAmount;
   private final BigDecimal interestEarned;
      public Result(BigDecimal finalAmount,BigDecimal interestEarned){
        this.finalAmount = finalAmount;
        this.interestEarned = interestEarned;
      }public BigDecimal getFinalAmount(){
        return finalAmount;
      }public BigDecimal getInterestEarned() {
        return interestEarned;
      }
    }
  }