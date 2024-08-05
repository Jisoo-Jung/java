package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		########################################
//		//if문만 사용하여 만들기
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(!(arData[i] == 'C')) {
//				System.out.println(arData[i]);
//			}
//		}
////		//삼항연산자로 더 간단하게 만들기 //5개만 담아서 출력방법
//		char[] arData2 = new char[5];
//		
//		for (int i = 0; i < arData2.length; i++) {
//			arData2[i]= (char)(i > 1 ? 66 + i : 65 + i);
//		}
//		
//		System.out.println(arData2);
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		비교하기 위해서는 항이 2개가 필요하다.
//		1.입력클래스
//		2.5개 정수를 입력해달라는 메세지 문자열 변수에 저장 
//		3.5개 정수 담을 배열 선언 
//		4.최대값과 최소값 담은 변수 선언 및 초기화
//		5.for문과 if문 사용
		
//		Scanner sc = new Scanner(System.in);
//		String message = "5개 정수를 입력해주세요.\n예) 3, 5, 2, 9, 10";
//		int[] arData = new int[5];
//		int max = 0, min = 0;
//		
//		System.out.println(message);
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//		
//		max = arData[0];
//		min = arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) {
//				max = arData[i];
//			}
//			
//			if(min > arData[i]) {
//				min = arData[i];
//			}
//		}
//		
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
		
//		사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
//		1. 입력클래스
//		2. 사용자가 입력한 칸 수를 담을 변수 선언 및 초기화
//		3. 사용자가 입력한 칸 수를 담을 배열 선언 및 초기화
//		4. 사용자가 입력한 정수들의 평균값을 구하기 위한 총합 담을 변수 선언 및 초기화
//		5. 칸 수 입력해달라는 메세지 변수에 저장
//		6. 사용자가 입력한 칸 수대로 정수를 입력받을 메세지 변수에 저장

//		Scanner sc = new Scanner(System.in);
//		int size = 0, total = 0;
//		int[] arData = null;
//		String message = "칸 수를 입력하십시오";
//		String message2 = "번 정수: ";
//		
//		System.out.println(message);
//		size = sc.nextInt();
//		
//		arData = new int[size];
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + message2);
//			arData[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			total += arData[i];
//		}
//		
//		System.out.println((double)total/arData.length);
//		
	}
}

//다 푼 후 원본과 비교하고 살펴보기
//마지막 3개 다시 풀기 
//마지막 3개 문제 바꿔서 다시 풀기
