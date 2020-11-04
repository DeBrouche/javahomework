//实现Account类为homework11_5_9_7_Account
import java.util.Date;

public class homework11_5_9_7_Account {
    //数据域
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// 构造方法
	// 创建默认Account 
	homework11_5_9_7_Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	//创建具有特定id和初始余额的account
	homework11_5_9_7_Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	//修饰器方法
	//设置id
	public void setId(int newId) {
		id = newId;
	}

	//设置余额
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	//设置年化利率
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

    //访问器
	//返回id
	public int getId() {
		return id;
	}

	//返回余额
	public double getBalance() {
		return balance;
	}

	//返回年化利率
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	//返回创建日期
	public String getDateCreated() {
		return dateCreated.toString();
	}

    //返回月利率
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	//方法
	//返回月利息
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	//减少余额
	public void withdraw(double amount) {
		balance -= amount;
	}

	//增加余额
	public void deposit(double amount) {
		balance += amount;
	}
}
    
