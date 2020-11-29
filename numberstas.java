import java.util.Random;
public class numberstas 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int []count=new int[10];
		for (int i = 0; i < 100; i++) 
		{
		int temp = random.nextInt(11);
		while (temp == 0) 
		{
		temp = random.nextInt(11);
		}
		count[temp-1]++;
		}
		for (int i = 0; i < count.length; i++) 
		{
		System.out.println((i+1)+"有"+count[i]+"个");
		}
	}
}