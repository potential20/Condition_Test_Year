package code;

import java.util.Scanner;

public class MainDrive {
	
//	새 한글은 잘 됩니다.
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("궁금한 년도 입력 : ");
			int year = scan.nextInt();
			
//			4로 안나눠지면 윤년이 아니라고 확정.
			if (year % 4 != 0) {
				System.out.println("윤년이 아님.");
				System.out.println("4로 안나눠 떨어짐.");
			}
			else {
//				100으로 나누고 다시 판단해야함.
				
				if (year % 100 == 0) {
//					400으로 나눠봐야함.
				}
				else {
//					4로만 나눠지니까 윤년이 맞다.
					System.out.println("윤년이 맞음");
					System.out.println("4로는 나눠지지만 100으로는 안됨.");
				}
			}
	}

}
