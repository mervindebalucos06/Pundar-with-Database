package src.model;

public class User {
  private final int userId;
  private final String name;
  private InvestmentPlan investmentPlan;
  private final String password;
  private int age;

  public User(int userId, String name, String password, int age) {
    this.userId = userId;
    this.name = name;
    this.password = password;
    this.age = age;
    this.investmentPlan = null;
  }

  //getter and setter

  public InvestmentPlan getInvestmentPlan() {
    return investmentPlan;
  }

  public void setInvestmentPlan(InvestmentPlan investmentPlan) {
    this.investmentPlan = investmentPlan;
  }

  public void InvestmentPlan(InvestmentPlan investmentPlan) {
    this.investmentPlan = investmentPlan;
  }

  public double getProjectedIncome(double growthRate) {
    return investmentPlan.calculateProjectedIncome(growthRate); // polymorphic call
  }

  public int getUserId() {
    return userId;
  }

  public String getPassword() {
    return password;
}


  public String getName() {
    return name;
  }

  public double calculateProjectedIncome(double annualGrowthRate) {
    return investmentPlan.calculateProjectedIncome(annualGrowthRate);
  }
 
  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

