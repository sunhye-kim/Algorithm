import java.util.Scanner;

public class boj_10870_fibonacci {
	
	public static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		}
		else if (num == 1) {
			return 1;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int answer = fibonacci(num);
		System.out.println(answer);
	}

}
