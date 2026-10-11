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
                              /* 100n */
       BigDecimal periodsPerHundred = BigDecimal.valueOf(100L * compoundPerYear);
                              /*nt*/
       int totalPeriods = compoundPerYear*years;
                                  /*r/100n*/
       BigDecimal periodicRates = rate.divide(periodsPerHundred,MathContext.DECIMAL128);
                                  /*1+(r/100n)*/
       BigDecimal growthFactor = BigDecimal.ONE.add(periodicRates);
                                    /*p(1+(r/100n))^nt*/
       BigDecimal finalAmount = principal.multiply(growthFactor.pow(totalPeriods,MathContext.DECIMAL128));
                                        /* CompoundInterestfomula*/
       BigDecimal interestEarned = finalAmount.subtract(principal);
      return new Result(finalAmount,interestEarned);
    }
    public static class  Result{
   private final BigDecimal finalAmount;
   private final BigDecimal interestEarned;
          /*constructor mapping
      the var inside(this) the class
            and outside*/
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