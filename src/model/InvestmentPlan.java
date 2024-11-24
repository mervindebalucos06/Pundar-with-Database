
package src.model;

public abstract class InvestmentPlan {
  protected double currentSavings;
  protected double annualContribution;
  protected int retirementAge;

  public InvestmentPlan(double currentSavings, double annualContribution, int retirementAge) {
    this.currentSavings = currentSavings;
    this.annualContribution = annualContribution;
    this.retirementAge = retirementAge;
  }

  public abstract double calculateProjectedIncome(double growthRate);

  public void updateSavings(double newSavings) {
    this.currentSavings = newSavings;
  }

  public void updateContribution(double newContribution) {
    this.annualContribution = newContribution;
  }

  //getters
  public double getCurrentSavings() {
    return currentSavings;
  }
  
  public double getAnnualContribution() {
    return annualContribution;
  }

  public int getRetirementAge() {
    return retirementAge;
  }

  public void setAnnualContribution(double annualContribution) {
    this.annualContribution = annualContribution;
  }

  public void setCurrentSavings(double currentSavings) {
    this.currentSavings = currentSavings;
  }

  public void setRetirementAge(int retirementAge) {
    this.retirementAge = retirementAge;
  }

}
