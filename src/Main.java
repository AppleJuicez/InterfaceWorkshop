
public class Main {

	public static void main(String[] args) 
	{
		Deposit6Month SevenM = new Deposit6Month(100000, 7);
		Deposit6Month FourM = new Deposit6Month(50000, 4);
		DepositSaving TenM = new DepositSaving(150000, 10);
		/*
		System.out.println(SevenM.getInterest());
		System.out.println(SevenM.calculateProfit(SevenM.capital , SevenM.month_invested));
		System.out.println(SevenM.calculateTotal(SevenM.capital , SevenM.month_invested));
		System.out.println(SevenM.printCondition());
		System.out.println(SevenM.getConditionPeriod());
		System.out.println(SevenM.isTenured(SevenM.month_invested));
		
		System.out.println(FourM.getInterest());
		System.out.println(FourM.calculateProfit(FourM.capital , FourM.month_invested));
		System.out.println(FourM.calculateTotal(FourM.capital , FourM.month_invested));
		System.out.println(FourM.printCondition());
		System.out.println(FourM.getConditionPeriod());
		System.out.println(FourM.isTenured(FourM.month_invested));
		
		System.out.println(TenM.getInterest());
		System.out.println(TenM.calculateProfit(TenM.capital , TenM.month_invested));
		System.out.println(TenM.calculateTotal(TenM.capital , TenM.month_invested));
		System.out.println(TenM.printCondition());
		System.out.println(TenM.getConditionPeriod());
		System.out.println(TenM.isTenured(TenM.month_invested));
		*/ //too much parameters
		
		DepositProductFactory DPF = new DepositProductFactory();
		Profitable PRO = DPF.createDepoPro(6, 100000, 7);
		System.out.println(PRO.calculateProfit());
		System.out.println(PRO.calculateTotal());
		System.out.println(PRO.getInterest());
		System.out.println(PRO.printCondition());
		
		Profitable PRO2 = DPF.createDepoPro(1, 100000, 7);
		System.out.println(PRO2.calculateProfit());
		System.out.println(PRO2.calculateTotal());
		System.out.println(PRO2.getInterest());
		System.out.println(PRO2.printCondition());
		
	}

}
