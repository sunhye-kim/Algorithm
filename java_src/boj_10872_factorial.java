import java.util.Scanner;

public class boj_10872_factorial {
	
	public static int factorial(int num) {
		if (num < 0 || num == 0) {
			return 1;
		}
		return num * factorial(num-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		
		int answer = factorial(num);
		System.out.println(answer);
	}

}
