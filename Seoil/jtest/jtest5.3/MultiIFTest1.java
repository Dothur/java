import java.util.Scanner;

public class MultiIFTest1 {
	public static void main(String args[]){
	Scanner stdin = new Scanner(System.in);
	System.out.print("성적을 입력하세요:");
	int grade = stdin.nextInt();
	if(grade >= 90)
		System.out.println("A학점 취득");
	else if(grade >= 80)
		System.out.println("B학점 취득");
	else if(grade >= 70)
		System.out.println("C학점 취득");
	else if(grade >= 60)
		System.out.println("D학점 취득");
	else
		System.out.println("학점 취득 실패");
	}
}
