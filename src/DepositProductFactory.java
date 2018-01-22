
public class DepositProductFactory 
{
		Profitable createDepoPro(double months_condition,  double capital , double month_invested)
		{
			if(months_condition == 6)
			{
				return new Deposit6Month(capital, month_invested);
			}
			else
			{
				return new DepositSaving(capital, month_invested);
			}
		}
		Tenurable createDepoTen(double months_condition,  double capital , double month_invested)
		{
			if(months_condition == 6)
			{
				return new Deposit6Month(capital, month_invested);
			}
			else
			{
				return new DepositSaving(capital, month_invested);
			}
		}
}
