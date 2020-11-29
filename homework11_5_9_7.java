public class homework11_5_9_7 {
    public static void main(String[] args) {
		// 创建账户
		//ID设置为1122、余额设置为20000
		homework11_5_9_7_Account account = new homework11_5_9_7_Account(1122, 20000);

		//年利率设为4.5%
		account.setAnnualInterestRate(4.5);

		//取出2500
		account.withdraw(2500);

		//存入3000
		account.deposit(3000);

		// 显示余额、月利息、创建日期
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", 
			account.getMonthlyInterest());
	}
}