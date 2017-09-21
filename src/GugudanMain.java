import java.util.Scanner;

//클래스를 이용한 구구단.
public class GugudanMain {

	public static void main(String[] args) {
		System.out.println("==============구구단==============");
		//1.기본 구구단
//		for(int i = 2; i <= 9; i++){
//			System.out.println(i+"단");
//			for(int j = 1; j<=9;j++){
//				System.out.println(i + " X " + j + " = " + (i * j));
//			}
//		}
		//2.입력 구구단
		
		System.out.print("구구단을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("사용자가 입력한 숫자 : " + number);
//		if(number >9 || number <2){
//			System.out.println("구구단은 2단부터 9단까지 존재합니다.");
//		}else{
//			for(int j = 1; j<=9;j++){
//				System.out.println(number + " X " + j + " = " + (number * j));
//			}
//		}
		
		//3. 메서드를 이용한 입력구구단
		Gugudan_01.gugudan(number);
		scanner.close();
	}

}
