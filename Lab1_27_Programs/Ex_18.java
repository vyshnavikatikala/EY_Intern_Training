package Lab_1;
import java.util.Scanner;

public class Ex_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int rev = 0;
		int len,n;
		len = String.valueOf(num).length();
		String res="";
		String[] units= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens= {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		while(num>0)
		{
			rev = (rev * 10) + (num % 10);
			num = num / 10;
		}
		n = rev;
		while(n > 0)
		{
			num = n % 10;
			if(len==3)
			{
				res = res + units[num] + " hundred ";
			}
			if(len == 2)
			{
				if(num < 2)
				{
					int temp = (num * 10);
					n = n / 10;
					temp+= n % 10;
					res = res + units[temp];
				}
				else
				res = res + tens[num-2] + " ";
			}
			if(len == 1)
			{
				res = res + units[num];
			}
			len--;
			n = n / 10;
		}
		System.out.println(res);
		scan.close();
	}
}
