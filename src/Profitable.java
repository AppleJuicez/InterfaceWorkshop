
public interface Profitable 
{
	double getInterest();
	double calculateProfit(double capital , int month);
	double calculateTotal(double capital, int month);
	String printCondition();
}
