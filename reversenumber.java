import java.util.Scanner;
public class reversenumber 
{
	public static int reverse(int number) 
	{
		int temp = 0;
		while (number != 0) 
		{
			temp *= 10;
			temp += number % 10;
			number = number / 10;
		}
		return temp;
	}


	public static void main (String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("请输入一个整数：");
		int number = input.nextInt();
		System.out.println(number + "反向数为" + reverse(number));
	}
}