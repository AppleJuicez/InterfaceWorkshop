
public class Deposit6Month implements Tenurable, Profitable {

	public double interestRate;
	public double capital;
	public double month_invested;
	public double month_tenured;
	
	public Deposit6Month(double capital , double month_invested) 
	{
		this.interestRate = 1;
		this.month_tenured = 6;
		this.capital = capital;
		this.month_invested = month_invested;
	}
	
	@Override
	public double getInterest() 
	{
		return this.interestRate;
	}

	@Override
	public double calculateProfit(double capital, double month) 
	{
		double profit = capital / 100.0 * ( (int)month / this.month_tenured * this.interestRate );
		return profit;
	}

	@Override
	public double calculateTotal(double capital, double month) 
	{
		double profit = capital / 100.0 * (100.0 + ( (int)month / this.month_tenured * this.interestRate  ));
		return profit;
	}

	@Override
	public String printCondition() {
		return "Profit is " + interestRate + "% per " + month_tenured + " months";
	}

	@Override
	public double getConditionPeriod() {
		return month_tenured;
	}

	@Override
	public boolean isTenured(double month) {
		// TODO Auto-generated method stub
		return ((int)month/(int)month_tenured >0);
	}

}
