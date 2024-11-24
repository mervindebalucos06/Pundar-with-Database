package src.plan;
import src.model.InvestmentPlan;
public class AggressivePlan extends InvestmentPlan {
  public AggressivePlan(double currentSavings, double annualContribution, int retirementAge) {
    super(currentSavings, annualContribution, retirementAge);
}

@Override
public double calculateProjectedIncome(double growthRate) {
    // An aggressive plan might use a higher growth rate or different calculation
    return currentSavings * Math.pow(1 + (growthRate * 1.2), retirementAge - 30) + annualContribution * (retirementAge - 30);
}
}
