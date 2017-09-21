import java.util.Scanner;

public class GugudanTest {
	public static void print(int a, int b){
		for(int i = 2; i<= a; i++){
			for(int j = 1; j <= b; j++){
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
	public static void main(String[] args) {
		System.out.print("구구단을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String gugu = scanner.nextLine();
		
		System.out.println("사용자가 입력한 숫자 : " + gugu);
		
		String[] guguValue = gugu.split(",");
		
		int first = Integer.parseInt(guguValue[0]);
		int second = Integer.parseInt(guguValue[1]);
		
		print(first, second);
	}
}
