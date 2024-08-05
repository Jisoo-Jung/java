package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	
	  public static int minus10(int data) {
	      return 10 - data;
	   }
	
   public static void main(String[] args) {
//      1~10까지 ArrayList에 담고 출력
//      Integer[] arData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//      ArrayList<Integer> datas = new ArrayList<Integer>();
      
//      참조형(객체명::메소드명)
//      매개변수로 전달받은 값을 다른 메소드에 넣는 작업만 한다면,
//      아래와 같이 참조형 문법을 사용하여 전달할 수 있다.
//      IntStream.rangeClosed(1, 10).forEach((data) -> {datas.add(data);}); 
//      IntStream.rangeClosed(1, 10).forEach(datas::add); 
//      System.out.println(datas);
      
//      10~1까지 ArrayList에 담고 출력
//      upgrade: 짝수만 출력
//     ArrayList<Integer> datas = new ArrayList<Integer>();
//     IntStream.rangeClosed(0, 9).forEach((data) -> {datas.add(10 - data);});
//     IntStream.rangeClosed(0, 9).forEach((data) -> {datas.add(10 - data);});
//     IntStream.range(0, 5).forEach((data) -> {System.out.println(datas.get(data * 2));});
//     System.out.println(datas);

	   
//	   10~1까지 ArrayList에 담고 출력 (map 사용)
//     ArrayList<Integer> datas = new ArrayList<>();
//     IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//     System.out.println(datas);


	   
//	   10~1까지 ArrayList에 담고 짝수만 출력 (map사용)
//     ArrayList<Integer> datas = new ArrayList<>();
//     IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//     datas.stream().forEach((data) -> {
//        if(data % 2 == 0) {
//           System.out.println(data);
//        }
//     });

     
//	    10~1까지 ArrayList에 담고 짝수만 출력 (map, filter 사용)
//	   ArrayList<Integer> datas = new ArrayList<Integer>();
	   
//	   ##지수##
//	   IntStream.range(0, 10).map(StreamTask::minus10).
//	   						filter((data) -> data % 2 == 0).forEach(datas::add);
//	   System.out.println(datas);
//	   
//	   IntStream.rangeClosed(0, 9).map((data) -> 10 - data).
//	   				filter((data) -> data % 2 == 0).forEach(datas::add);
//	   System.out.println(datas);
	   
//	   ##강사##
//	   IntStream.rangeClosed(0, 9).map(StreamTask::minus10).forEach(datas::add);
//	   datas.stream().filter((data) -> data % 2 == 0).forEach(System.out::println);

//     ABCDEF를 각 문자별로 출력
	   String data = "ABCDEF";
	   data.chars().forEach((c) -> System.out.println((char)c));
	   
//     1~100까지 중 홀수만 ArrayList에 담고 출력
	   ArrayList<Integer> datas = new ArrayList<Integer>();
	   IntStream.range(0, 100).filter((data2) -> !(data2 % 2 == 0)).forEach(datas::add);
	   System.out.println(datas);
	   
//     A~F까지 중 D제외하고 ArrayList에 담은 뒤 출력
	   ArrayList<Integer> datas2 = new ArrayList<Integer>();
	   IntStream.range(65, 7).filter((data2) -> !(data2 == 68)).
	   map((data2) -> (char)data2).forEach(datas2::add);
	   System.out.println(datas2); //char타입으로 어떻게 바꾸지?
	   
	   ArrayList<Character> datas7 = new ArrayList<Character>();
	   IntStream.range(0, 5)
	   		.map((i) -> i > 2 ? i + 66 : i + 65)
	   			.forEach((data7) -> {datas7.add((char)data7);});
     
	   System.out.println(datas);

	   
//     5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk")
	   ArrayList<String> datas3 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
	   datas3.stream().map(String::toLowerCase).forEach(System.out::println);


//     1~100까지 중 짝수만 ArrayList에 담고 출력
	   ArrayList<Integer> datas4 = new ArrayList<Integer>();
	   IntStream.rangeClosed(0, 100).filter((data4) -> data4 % 2 == 0).forEach(datas4::add);
	   System.out.println(datas4);
	   
//     "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
	   ArrayList<String> datas5 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
	   datas5.stream().filter((data5) -> data5.charAt(0) >= 'A')
        .filter((data5) -> data5.charAt(0) <= 'Z')
           .forEach(System.out::println);

	   
//     한글을 정수로 변경
	   String hangle = "공일이삼사오육칠팔구";
	   String input = "일공이사";
	   input.chars().map(hangle::indexOf).forEach(System.out::println);
 
	   
//     정수를 한글로 변경
	   String hangle2 = "공일이삼사오육칠팔구";
	   String input2 = "1024";
	   input2.chars().map((c) -> c - 48).forEach((i) -> System.out.println(hangle2.charAt(i)));
	 
   }
}






















