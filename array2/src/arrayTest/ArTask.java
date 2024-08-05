package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		//브론즈
//		//1 ~ 10까지 배열에 담고 출력
//		//10번 반복하는 for문 만들기
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 1 + i;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
//		//10 ~ 1까지 중 짝수만 배열에 담고 출력
//		int[] arData = new int[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 2 * (i + 1);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		//1 ~ 100까지 배열에 담은 후 홀수만 출력
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
		
//		//if문 사용하기
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 2 == 1) {
//				System.out.println(arData[i]);
//			}
//		}
//		//if문 사용하지 않고, for문만 사용하기
//		for (int i = 0; i < 50; i++) {
//			System.out.println((arData[i] * 2) - 1);
//		}
//		
//		실버
//		1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[100];
//		int result = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 2 == 0) {
//				result += arData[i];
//			}
//		}
//		System.out.println(result);		
		
//		A ~ F까지 배열에 담고 출력
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//			System.out.println(arData[i]);
//		}
		
//		A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		########################################
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
		//삼항연산자로 더 간단하게 만들기 //5개만 담아서 출력방법
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char) (i > 1 ? 66 + i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}

//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		비교하기 위해서는 항이 2개가 필요하다.
		//1.입력클래스
//		Scanner sc = new Scanner(System.in);
//		//2.5개 입력받을 배열 선언 
//		int[] arData = new int[5];
//		//3.최대값, 최소값 담을 변수 선언 및 초기화
//		int max = 0, min = 0;
//		//4.입력해달라는 출력 내용 변수에 담아놓기
//		String message = "5개의 정수를 입력해주세요.";
//		String messageEx = "예시) 3 5 10 2 1";
//		
//		System.out.println(message);
//		System.out.println(messageEx);
//	
//////		사용자가 length만큼 값을 입력한다. 
//		for (int i = 0; i < arData.length; i++) {	
//////			각 방에 순서대로 입력한 값을 저장한다.
//				arData[i] = sc.nextInt();
//			}	
//////		입력이 끝나면, 첫번째 방에 있는 값을 max와 min에 각각 담아준다.
//////		(다른 값과의 비교를 위해)
//		max = arData[0]; //7 5 10 2 30 1
//		min = arData[0]; 
//////		이미 max와 min에 0번째 값을 담아놓았기 때문에, 1부터 시작한다.
//		for (int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) {
//				max = arData[i];
//			}
//		}
//////			min에 담긴 값과 다른 값들을 비교하여, 
//////			min에 담긴 값보다 더 작은 값이 있다면,
//		for (int i = 1; i < arData.length; i++) {
//			if(min > arData[i]) {
//				min = arData[i];
//			}
//		}
//////				기존에 있던 min 값을 더 작은 값인 arData[i]값으로 대체한다.
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
//////		반복문이 다 끝났다는 것은 최대와 최소값이 모두 구해졌다는 것을 의미한다.

		
//		다이아
//		사용자가 칸 수를 입력하고, 그 칸 수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
//		Scanner sc = new Scanner(System.in);
////		1. 입력 클래스
////		2. 칸 수 입력 해달라는 메시지 변수에 저장
////		3. 해당 칸 수 만큼 다시 입력 받을 메시지 변수에 저장
////		4. 사용자가 입력한 칸수 담을 변수 선언 및 초기화
////		5. 입력한 칸수만큼 입력받아서 담을 배열 선언 및 초기화
////		6. 사용자가 입력한 정수들의 평균값을 구하기 위한 총합 담을 total 변수 선언 및 초기화
//		String message = "칸 수를 입력하십시오";
//		String message2 = "번 정수: ";
//		int size = 0, total = 0;
//////		사용자에게 칸 수를 입력받는다.
//			
//		System.out.println(message);
//		size = sc.nextInt();
//		
//////		사용자가 입력한 칸 수만큼 배열을 Heap 메모리에 할당한다.
//		int[] arData = new int[size];
//		
//////		만들어진 칸 수만큼 정수를 입력받는다.
//		for (int i = 0; i < size; i++) {
//			System.out.print(i + 1 + message2);
//			arData[i] = sc.nextInt();
//		}
//////		입력이 끝나면, 모든 값을 누적해서 총 합을 구한다.
//		for (int i = 0; i < arData.length; i++) {
//			total += arData[i];
//		}
////		
//////		전체 개수로 나누어서 평균을 구한 뒤 출력한다.
//		System.out.println(total / arData.length); 

		Scanner sc = new Scanner(System.in);
		String message = "칸 수를 입력하십시오";
		String message2 = "번 정수: ";
		int size = 0, total = 0;
		int[] arData = null;
	
		System.out.println(message);
		size = sc.nextInt();
	
		arData = new int[size];

		for (int i = 0; i < size; i++) {
		System.out.print(i + 1 + message2);
		arData[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData.length; i++) {
		total += arData[i];
		}

		System.out.println((double)total / arData.length); 
		
	}
}
	
	//arData 초기화 후 사용해보기 
	//평균 구할 때 double 사용하기

//다 푼 후 원본과 비교하고 살펴보기
//마지막 3개 다시 풀기 
//마지막 3개 문제 바꿔서 다시 풀기











