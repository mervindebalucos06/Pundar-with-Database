package src.plan;

import src.model.InvestmentPlan;

public class ConservativePlan extends InvestmentPlan {
  public ConservativePlan(double currentSavings, double annualContribution, int retirementAge) {
    super(currentSavings, annualContribution, retirementAge);
  }
  
  @Override
  public double calculateProjectedIncome(double growthRate) {
    return currentSavings * Math.pow(1 + (growthRate * 0.7), retirementAge - 30) + annualContribution * (retirementAge - 30);
  }
}
