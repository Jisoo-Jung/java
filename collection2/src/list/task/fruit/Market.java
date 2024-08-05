package list.task.fruit;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Market {
	//CRUD관련 기능을 담아놓을 클래스 선언(Market)
	//- 과일 추가
	//- 과일 삭제
	//- 과일 가격이 평균 가격보다 낮은 지 검사
	//- 과일 전체 조회
	//- 과일 이름으로 가격 조회
	
	//과일 추가
	public void add(Fruit fruit) {
		DBConnecter.fruits.add(fruit);
	}
	
	//과일 삭제
	public void remove(Fruit fruit) {
		DBConnecter.fruits.remove(fruit);
	}
	
	//과일 가격이 평균 가격보다 낮은 지 검사
	public void check(Fruit fruit) {
		int total = 0; //전체 과일을 다 더한 값
		double average = 0.0; //과일의 평균 값
		int fruitPrice = 0;
		
//		1. 전체 가격을 구하는 문장 만들기
//		2. 전체 가격을 전체 과일 갯수로 나눠서 평균 값을 구하는 문장 만들기
//		3. 사용자가 입력할 과일의 가격이 평균 가격보다 낮은지 검사하는 문장 만들기(for문, if문)
		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			fruitPrice = DBConnecter.fruits.get(i).getPrice();
			total += fruitPrice;
			}
		
			average = (double) total / DBConnecter.fruits.size();
			
			if(fruitPrice < average) {
				System.out.println("평균 가격보다 낫습니다." + fruit);
			}else if(fruitPrice > average){
				System.out.println("평균 가격보다 높습니다.");
			}
			
		}
//		4. 평균 가격보다 낮다면 -> 평균 가격보다 낫습니다. 과일 이름, 가격 출력 //아니면 평균 가격보다 높습니다.
	
	
	//과일 전체 조회
	public ArrayList<Fruit> allFind() {
		//얕은 복사 //사용자가 건들일 수도 있으니깐 복사해서 제공
		//리턴하기
//		1. 복사하여 ArrayList<Fruit> 타입으로 강제 형변환
//		2. ArrayList<Fruit>타입의 객체에 저장
//		3. 해당 객체 리턴해주기
		ArrayList<Fruit> fruit = (ArrayList<Fruit>) DBConnecter.fruits.clone();
		
		return fruit;
		
	}
	
	//과일 이름으로 가격 조회
	public int findPrice(Fruit fruit) {
		//얕은 복사 //리턴
//		1. 과일 이름을 검색했을 때 -> 매개변수 자리에 과일 클래스와 객체명
//		2. 가격 조회 -> getPrice
		
		return fruit.getPrice();
	
	}
   
}





















