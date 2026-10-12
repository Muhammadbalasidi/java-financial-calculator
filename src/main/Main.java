import java.math.BigDecimal;
import java.util.Scanner;
import models.SimpleInterest;
import models.CompoundInterest;

public class Main {
    public static void main(String[] args) {
        /* calculator = new CompoundInterest();

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
        System.out.println("Interest Earned: " + result.getInterestEarned());*/


      
        String pattern = "==========";
        String SimplePattern = "===";
      System.out.println();  
      System.out.println(pattern+" C@LCUL@T0R "+pattern);
      System.out.println("1. Simple Interest");
      System.out.println("2. Compound Interest");
      System.out.println("3. Exit");
      System.out.println(pattern.repeat(3));
      System.out.println();
      Scanner userInput = new Scanner(System.in);
      SimpleInterest calculate = new SimpleInterest();
      System.out.println("Choose an option");
      int option = userInput.nextInt();
      if (option == 1){
      System.out.println(pattern+" Ok lets get calculating (Simple Interest) "+pattern);
      System.out.print(""+SimplePattern+" wh@t's your principal :- ");
        BigDecimal principal = userInput.nextBigDecimal();
      System.out.print(""+SimplePattern.repeat(2)+" wh@t's your rate :- ");
        BigDecimal rate = userInput.nextBigDecimal();
      System.out.print(""+SimplePattern.repeat(3)+" wh@t's your time :- ");
        BigDecimal time = userInput.nextBigDecimal();
      System.out.print(""+SimplePattern.repeat(4)+" your simple interest is:- ");
       System.out.print(calculate.simpleInterest(principal,rate,time));
      System.out.println();
        
      }else if (option == 2){
      System.out.println(pattern+" Ok lets get calculating (Compound Interest) "+pattern);
      System.out.print(""+SimplePattern+" wh@t's your principal :- ");
        BigDecimal principal = userInput.nextBigDecimal();
      System.out.print(""+SimplePattern.repeat(2)+" wh@t's your rate :- ");
        BigDecimal rate = userInput.nextBigDecimal();
      System.out.print(""+SimplePattern.repeat(3)+" wh@t's your time :- ");
        int years = userInput.nextInt();
      System.out.print(""+SimplePattern.repeat(4)+" wh@t's your n :- ");
        int compoundPerYear = userInput.nextInt();
        CompoundInterest calculator = new CompoundInterest();
        CompoundInterest.Result result = calculator.calculate(
            principal,
            rate,
            years,
            compoundPerYear
        );
        System.out.println(""+SimplePattern.repeat(4)+" your Principal is : " + principal);
        System.out.println(""+SimplePattern.repeat(5)+" Final Compound Interest Amount: " + result.getFinalAmount());
        System.out.println(""+SimplePattern.repeat(6)+" Interest Earned: " + result.getInterestEarned());


      }else if (option == 3){
        
      }else{
        
      }
    }
}