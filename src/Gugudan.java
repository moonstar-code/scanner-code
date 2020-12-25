
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		System.out.println("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		
		System.out.println(number + "단을 시작합니다.");
		for (int i = 1; i < 10; i++) {
			
			int result = number * i;
			System.out.println(number + " X " + i + " = " + (number * i));
			
		}
	}
}
