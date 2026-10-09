import java.math.BigDecimal;
import models.CompoundInterest;

public class Main {
    public static void main(String[] args) {
        CompoundInterest calculator = new CompoundInterest();

        BigDecimal principal = new BigDecimal("10000");
        BigDecimal rate = new BigDecimal("10");

        int years = 2;
        int compoundPerYear = 1;

        CompoundInterest.Result result = calculator.calculate(
            principal,
            rate,
            years,
            compoundPerYear
        );

        System.out.println("Principal: " + principal);
        System.out.println("Final Amount: " + result.getFinalAmount());
        System.out.println("Interest Earned: " + result.getInterestEarned());
    }
}