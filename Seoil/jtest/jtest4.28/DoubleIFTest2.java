import java.util.Scanner;

public class DoubleIFTest2 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자를 입력:");
		int count = stdin.nextInt();
		if(count < 0) 
		{
			System.out.print("입력된수 " + count);
			System.out.println("은(는) 음수입니다");
		}
		else
		{
			System.out.print("입력된수 " + count);
			System.out.println("은(는) 음수가 아닙니다");
		}
	}
}

