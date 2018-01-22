
public interface Profitable 
{
	double getInterest();
	double calculateProfit(double capital , double month);
	double calculateTotal(double capital, double month);
	String printCondition();
}
