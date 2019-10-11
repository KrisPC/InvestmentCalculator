public class Driver 
{
	public static void main(String[] args) 
	{
		Investment a = new Investment();
		Investment b = new Investment();
		a.addContribution(new Contribution(1200, 1));
		b.addContribution(new Contribution(100, 12));
		
		int totalInvestmentTime = 156;
		System.out.println(a.getCurrentValue(totalInvestmentTime));
		System.out.println(b.getCurrentValue(totalInvestmentTime));
		System.out.println(a.getTotalContributions());
		System.out.println(b.getTotalContributions());
		}
}